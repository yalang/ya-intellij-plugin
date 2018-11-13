// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.yalang.lexer

import com.intellij.psi.tree.IElementType
import com.intellij.util.containers.Stack
import org.yalang.lexer.YaLangLexer
import org.yalang.YaLangTokenTypes
import org.yalang.psi.YaLangElementType
import org.yalang.psi.YaLangStringLiteralUtil
import org.yalang.lexer.FlexLexerEx


class YaLangLexerFStringHelper(private val myLexer: FlexLexerEx) {
  private val myFStringStates: Stack<FStringState> = Stack()

  fun handleFStringStartInFragment(): IElementType {
    val prefixAndQuotes = myLexer.yytext().toString()
    val (_, offset) = findFStringTerminator(prefixAndQuotes)
    if (offset == prefixAndQuotes.length) {
      return pushFString(prefixAndQuotes)
    }
    return YaLangTokenTypes.IDENTIFIER
  }

  fun handleFStringStart(): IElementType {
    return pushFString(myLexer.yytext().toString())
  }

  private fun pushFString(prefixAndQuotes: String): YaLangElementType {
    val openingQuotes = prefixAndQuotes.substring(YaLangStringLiteralUtil.getPrefixLength(prefixAndQuotes))
    myFStringStates.push(FStringState(myLexer.yystate(), myLexer.tokenStart, openingQuotes))
    myLexer.yybegin(YaLangLexer.FSTRING)
    return YaLangTokenTypes.FSTRING_START
  }

  fun handleFStringEnd(): IElementType {
    val (type, offset) = findFStringTerminator(myLexer.yytext().toString())
    return if (offset == 0) type!! else YaLangTokenTypes.FSTRING_TEXT
  }

  fun handleFragmentStart(): IElementType {
    myFStringStates.peek().fragmentStates.push(FragmentState(myLexer.yystate(), myLexer.tokenStart))
    myLexer.yybegin(YaLangLexer.FSTRING_FRAGMENT)
    return YaLangTokenTypes.FSTRING_FRAGMENT_START
  }

  fun handleFragmentEnd(): IElementType {
    val state = myFStringStates.peek().fragmentStates.pop()
    myLexer.yybegin(state.oldState)
    return YaLangTokenTypes.FSTRING_FRAGMENT_END
  }

  fun handleLeftBracketInFragment(type: IElementType): IElementType {
    myFStringStates.peek().fragmentStates.peek().braceBalance++    
    return type
  }

  fun handleRightBracketInFragment(type: IElementType): IElementType {
    val activeFragmentState = myFStringStates.peek().fragmentStates.peek()
    if (activeFragmentState.braceBalance == 0 && type == YaLangTokenTypes.RBRACE) {
      return handleFragmentEnd()
    }
    else {
      activeFragmentState.braceBalance--
      return type
    }
  }
  
  fun handleColonInFragment(): IElementType {
    if (myFStringStates.peek().fragmentStates.peek().braceBalance == 0) {
      myLexer.yybegin(YaLangLexer.FSTRING_FRAGMENT_FORMAT)
      return YaLangTokenTypes.FSTRING_FRAGMENT_FORMAT_START
    }
    else {
      return YaLangTokenTypes.COLON
    }
  }

  fun handleLineBreakInFragment(): IElementType {
    val text = myLexer.yytext().toString()
    // We will return a line break anyway, but we need to transit from FSTRING state of the lexer
    findFStringTerminator(text)
    return YaLangTokenTypes.LINE_BREAK
  }

  fun handleLineBreakInLiteralText(): IElementType {
    val text = myLexer.yytext().toString()
    val (_, offset) = findFStringTerminator(text)
    if (offset == text.length) {
      return YaLangTokenTypes.FSTRING_TEXT
    }
    return YaLangTokenTypes.LINE_BREAK
  }
  
  fun handleStringLiteral(stringLiteralType: IElementType): IElementType {
    val stringText = myLexer.yytext().toString()
    val prefixLength = YaLangStringLiteralUtil.getPrefixLength(stringText)

    val (type, offset) = findFStringTerminator(stringText)
    return when (offset) {
      0 -> type!!
      prefixLength -> YaLangTokenTypes.IDENTIFIER
      else -> stringLiteralType
    }
  }

  private fun findFStringTerminator(text: String): Pair<IElementType?, Int> {
    var i = 0
    while (i < text.length) {
      val c = text[i]
      if (c == '\\') {
        i += 2
        continue
      }
      if (c == '\n') {
        val insideSingleQuoted = myFStringStates.any { it.openingQuotes.length == 1 }
        if (insideSingleQuoted) {
          if (i == 0) {
            // Terminate all f-strings and insert STATEMENT_BREAK at this point
            dropFStringStateWithAllNested(0)
          }
          pushBackToOrConsumeMatch(i, 1)
          return Pair(YaLangTokenTypes.LINE_BREAK, i)
        }
      }
      else {
        val nextThree = text.substring(i, Math.min(text.length, i + 3))
        val lastWithMatchingQuotesIndex = myFStringStates.indexOfLast { nextThree.startsWith(it.openingQuotes) }
        if (lastWithMatchingQuotesIndex >= 0) {
          val state = myFStringStates[lastWithMatchingQuotesIndex]
          if (i == 0) {
            dropFStringStateWithAllNested(lastWithMatchingQuotesIndex)
          }
          pushBackToOrConsumeMatch(i, state.openingQuotes.length)
          return Pair(YaLangTokenTypes.FSTRING_END, i)
        }
      }
      i++
    }
    return Pair(null, text.length)
  }

  private fun dropFStringStateWithAllNested(fStringIndex: Int) {
    myLexer.yybegin(myFStringStates[fStringIndex].oldState)
    myFStringStates.subList(fStringIndex, myFStringStates.size).clear()
  }

  private fun pushBackToOrConsumeMatch(matchOffset: Int, matchSize: Int) {
    if (matchOffset == 0) {
      myLexer.yypushback(myLexer.yylength() - matchSize)
    }
    else {
      myLexer.yypushback(myLexer.yylength() - matchOffset)
    }
  }

  fun reset() {
    // There is no need to be smarter about it, since LexerEditorHighlighter always resets 
    // the lexer state to YYINITIAL where there can't be any f-strings.
    myFStringStates.clear()
  }

  private data class FStringState(val oldState: Int, val offset: Int, val openingQuotes: String) {
    val fragmentStates = Stack<FragmentState>()
  }

  private data class FragmentState(val oldState: Int, val offset: Int) {
    var braceBalance: Int = 0
  }
}
