// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.yalang.psi.impl.*;

public interface YaLangTypes {

  IElementType AND_EXPR = new YaLangElementType("AND_EXPR");
  IElementType AND_TEST = new YaLangElementType("AND_TEST");
  IElementType ANNASSIGN = new YaLangElementType("ANNASSIGN");
  IElementType ARGLIST = new YaLangElementType("ARGLIST");
  IElementType ARGUMENT = new YaLangElementType("ARGUMENT");
  IElementType ARITH_EXPR = new YaLangElementType("ARITH_EXPR");
  IElementType ASSERT_STMT = new YaLangElementType("ASSERT_STMT");
  IElementType ASYNC_FUNCDEF = new YaLangElementType("ASYNC_FUNCDEF");
  IElementType ASYNC_STMT = new YaLangElementType("ASYNC_STMT");
  IElementType ATOM = new YaLangElementType("ATOM");
  IElementType ATOM_EXPR = new YaLangElementType("ATOM_EXPR");
  IElementType AUGASSIGN = new YaLangElementType("AUGASSIGN");
  IElementType BREAK_STMT = new YaLangElementType("BREAK_STMT");
  IElementType CLASSDEF = new YaLangElementType("CLASSDEF");
  IElementType COMPARISON = new YaLangElementType("COMPARISON");
  IElementType COMPOUND_STMT = new YaLangElementType("COMPOUND_STMT");
  IElementType COMP_FOR = new YaLangElementType("COMP_FOR");
  IElementType COMP_IF = new YaLangElementType("COMP_IF");
  IElementType COMP_ITER = new YaLangElementType("COMP_ITER");
  IElementType COMP_OP = new YaLangElementType("COMP_OP");
  IElementType CONTINUE_STMT = new YaLangElementType("CONTINUE_STMT");
  IElementType DECORATED = new YaLangElementType("DECORATED");
  IElementType DECORATOR = new YaLangElementType("DECORATOR");
  IElementType DECORATORS = new YaLangElementType("DECORATORS");
  IElementType DEL_STMT = new YaLangElementType("DEL_STMT");
  IElementType DICTORSETMAKER = new YaLangElementType("DICTORSETMAKER");
  IElementType DOTTED_AS_NAME = new YaLangElementType("DOTTED_AS_NAME");
  IElementType DOTTED_AS_NAMES = new YaLangElementType("DOTTED_AS_NAMES");
  IElementType DOTTED_NAME = new YaLangElementType("DOTTED_NAME");
  IElementType ENCODING_DECL = new YaLangElementType("ENCODING_DECL");
  IElementType EVAL_INPUT = new YaLangElementType("EVAL_INPUT");
  IElementType EXCEPT_CLAUSE = new YaLangElementType("EXCEPT_CLAUSE");
  IElementType EXPR = new YaLangElementType("EXPR");
  IElementType EXPRLIST = new YaLangElementType("EXPRLIST");
  IElementType EXPR_STMT = new YaLangElementType("EXPR_STMT");
  IElementType FACTOR = new YaLangElementType("FACTOR");
  IElementType FILE_INPUT = new YaLangElementType("FILE_INPUT");
  IElementType FLOW_STMT = new YaLangElementType("FLOW_STMT");
  IElementType FOR_STMT = new YaLangElementType("FOR_STMT");
  IElementType FUNCDEF = new YaLangElementType("FUNCDEF");
  IElementType GLOBAL_STMT = new YaLangElementType("GLOBAL_STMT");
  IElementType IF_STMT = new YaLangElementType("IF_STMT");
  IElementType IMPORT_AS_NAME = new YaLangElementType("IMPORT_AS_NAME");
  IElementType IMPORT_AS_NAMES = new YaLangElementType("IMPORT_AS_NAMES");
  IElementType IMPORT_FROM = new YaLangElementType("IMPORT_FROM");
  IElementType IMPORT_NAME = new YaLangElementType("IMPORT_NAME");
  IElementType IMPORT_STMT = new YaLangElementType("IMPORT_STMT");
  IElementType LAMBDEF = new YaLangElementType("LAMBDEF");
  IElementType LAMBDEF_NOCOND = new YaLangElementType("LAMBDEF_NOCOND");
  IElementType NONLOCAL_STMT = new YaLangElementType("NONLOCAL_STMT");
  IElementType NOT_TEST = new YaLangElementType("NOT_TEST");
  IElementType OR_TEST = new YaLangElementType("OR_TEST");
  IElementType PARAMETERS = new YaLangElementType("PARAMETERS");
  IElementType PASS_STMT = new YaLangElementType("PASS_STMT");
  IElementType POWER = new YaLangElementType("POWER");
  IElementType PROPERTY = new YaLangElementType("PROPERTY");
  IElementType RAISE_STMT = new YaLangElementType("RAISE_STMT");
  IElementType RETURN_STMT = new YaLangElementType("RETURN_STMT");
  IElementType SHIFT_EXPR = new YaLangElementType("SHIFT_EXPR");
  IElementType SIMPLE_STMT = new YaLangElementType("SIMPLE_STMT");
  IElementType SINGLE_INPUT = new YaLangElementType("SINGLE_INPUT");
  IElementType SLICEOP = new YaLangElementType("SLICEOP");
  IElementType SMALL_STMT = new YaLangElementType("SMALL_STMT");
  IElementType STAR_EXPR = new YaLangElementType("STAR_EXPR");
  IElementType STMT = new YaLangElementType("STMT");
  IElementType SUBSCRIPT = new YaLangElementType("SUBSCRIPT");
  IElementType SUBSCRIPTLIST = new YaLangElementType("SUBSCRIPTLIST");
  IElementType SUITE = new YaLangElementType("SUITE");
  IElementType SYNC_COMP_FOR = new YaLangElementType("SYNC_COMP_FOR");
  IElementType TERM = new YaLangElementType("TERM");
  IElementType TEST = new YaLangElementType("TEST");
  IElementType TESTLIST = new YaLangElementType("TESTLIST");
  IElementType TESTLIST_COMP = new YaLangElementType("TESTLIST_COMP");
  IElementType TESTLIST_STAR_EXPR = new YaLangElementType("TESTLIST_STAR_EXPR");
  IElementType TEST_NOCOND = new YaLangElementType("TEST_NOCOND");
  IElementType TFPDEF = new YaLangElementType("TFPDEF");
  IElementType TRAILER = new YaLangElementType("TRAILER");
  IElementType TRY_STMT = new YaLangElementType("TRY_STMT");
  IElementType TYPEDARGSLIST = new YaLangElementType("TYPEDARGSLIST");
  IElementType VARARGSLIST = new YaLangElementType("VARARGSLIST");
  IElementType VFPDEF = new YaLangElementType("VFPDEF");
  IElementType WHILE_STMT = new YaLangElementType("WHILE_STMT");
  IElementType WITH_ITEM = new YaLangElementType("WITH_ITEM");
  IElementType WITH_STMT = new YaLangElementType("WITH_STMT");
  IElementType XOR_EXPR = new YaLangElementType("XOR_EXPR");
  IElementType YIELD_ARG = new YaLangElementType("YIELD_ARG");
  IElementType YIELD_EXPR = new YaLangElementType("YIELD_EXPR");
  IElementType YIELD_STMT = new YaLangElementType("YIELD_STMT");

  IElementType AND = new YaLangTokenType("&");
  IElementType ANDEQ = new YaLangTokenType("&=");
  IElementType AND_KEYWORD = new YaLangTokenType("و");
  IElementType ASSERT_KEYWORD = new YaLangTokenType("أكد");
  IElementType ASYNC_KEYWORD = new YaLangTokenType("غيرمتزامن");
  IElementType AS_KEYWORD = new YaLangTokenType("مثل");
  IElementType AT = new YaLangTokenType("@");
  IElementType ATEQ = new YaLangTokenType("@=");
  IElementType AWAIT_KEYWORD = new YaLangTokenType("ترقب");
  IElementType BREAK_KEYWORD = new YaLangTokenType("اكسر");
  IElementType CLASS_KEYWORD = new YaLangTokenType("صنف");
  IElementType COLON = new YaLangTokenType(":");
  IElementType COMMA = new YaLangTokenType("،");
  IElementType COMMENT = new YaLangTokenType("COMMENT");
  IElementType CONTINUE_KEYWORD = new YaLangTokenType("استمر");
  IElementType CRLF = new YaLangTokenType("CRLF");
  IElementType DEDENT = new YaLangTokenType("DEDENT");
  IElementType DEF_KEYWORD = new YaLangTokenType("وظيفة");
  IElementType DEL_KEYWORD = new YaLangTokenType("حذف");
  IElementType DIV = new YaLangTokenType("/");
  IElementType DIVEQ = new YaLangTokenType("/=");
  IElementType DOT = new YaLangTokenType(".");
  IElementType ELIF_KEYWORD = new YaLangTokenType("ولو");
  IElementType ELSE_KEYWORD = new YaLangTokenType("آخر");
  IElementType ENDMARKER = new YaLangTokenType("ENDMARKER");
  IElementType EQ = new YaLangTokenType("=");
  IElementType EQEQ = new YaLangTokenType("==");
  IElementType EXCEPT_KEYWORD = new YaLangTokenType("إلا");
  IElementType EXP = new YaLangTokenType("**");
  IElementType EXPEQ = new YaLangTokenType("**=");
  IElementType FALSE_KEYWORD = new YaLangTokenType("زائف");
  IElementType FINALLY_KEYWORD = new YaLangTokenType("أخيرا");
  IElementType FLOORDIV = new YaLangTokenType("//");
  IElementType FLOORDIVEQ = new YaLangTokenType("//=");
  IElementType FOR_KEYWORD = new YaLangTokenType("لأن");
  IElementType FROM_KEYWORD = new YaLangTokenType("من");
  IElementType GE = new YaLangTokenType(">=");
  IElementType GLOBAL_KEYWORD = new YaLangTokenType("عالمي");
  IElementType GT = new YaLangTokenType(">");
  IElementType GTGT = new YaLangTokenType(">>");
  IElementType GTGTEQ = new YaLangTokenType(">>=");
  IElementType IF_KEYWORD = new YaLangTokenType("لو");
  IElementType IMPORT_KEYWORD = new YaLangTokenType("استيراد");
  IElementType INDENT = new YaLangTokenType("INDENT");
  IElementType IN_KEYWORD = new YaLangTokenType("في");
  IElementType IS_KEYWORD = new YaLangTokenType("يساوي");
  IElementType KEY = new YaLangTokenType("KEY");
  IElementType LAMBDA_KEYWORD = new YaLangTokenType("امدا");
  IElementType LBRACE = new YaLangTokenType("{");
  IElementType LBRACKET = new YaLangTokenType("[");
  IElementType LE = new YaLangTokenType("<=");
  IElementType LPAR = new YaLangTokenType("(");
  IElementType LT = new YaLangTokenType("<");
  IElementType LTLT = new YaLangTokenType("<<");
  IElementType LTLTEQ = new YaLangTokenType("<<=");
  IElementType MINUS = new YaLangTokenType("-");
  IElementType MINUSEQ = new YaLangTokenType("-=");
  IElementType MULT = new YaLangTokenType("*");
  IElementType MULTEQ = new YaLangTokenType("*=");
  IElementType NAME = new YaLangTokenType("NAME");
  IElementType NE = new YaLangTokenType("!=");
  IElementType NEWLINE = new YaLangTokenType("NEWLINE");
  IElementType NE_OLD = new YaLangTokenType("<>");
  IElementType NONE_KEYWORD = new YaLangTokenType("لااحد");
  IElementType NONLOCAL_KEYWORD = new YaLangTokenType("غيرمحلي");
  IElementType NOT_KEYWORD = new YaLangTokenType("لا");
  IElementType NUMBER = new YaLangTokenType("NUMBER");
  IElementType OR = new YaLangTokenType("|");
  IElementType OREQ = new YaLangTokenType("|=");
  IElementType OR_KEYWORD = new YaLangTokenType("أو");
  IElementType PASS_KEYWORD = new YaLangTokenType("مرر");
  IElementType PERC = new YaLangTokenType("٪");
  IElementType PERCEQ = new YaLangTokenType("٪=");
  IElementType PLUS = new YaLangTokenType("+");
  IElementType PLUSEQ = new YaLangTokenType("+=");
  IElementType RAISE_KEYWORD = new YaLangTokenType("رفع");
  IElementType RARROW = new YaLangTokenType("->");
  IElementType RBRACE = new YaLangTokenType("}");
  IElementType RBRACKET = new YaLangTokenType("]");
  IElementType RETURN_KEYWORD = new YaLangTokenType("إرجع");
  IElementType RPAR = new YaLangTokenType(")");
  IElementType SEMICOLON = new YaLangTokenType("؛");
  IElementType SEPARATOR = new YaLangTokenType("SEPARATOR");
  IElementType STRING = new YaLangTokenType("STRING");
  IElementType TICK = new YaLangTokenType("`");
  IElementType TILDE = new YaLangTokenType("~");
  IElementType TRUE_KEYWORD = new YaLangTokenType("صحيح");
  IElementType TRY_KEYWORD = new YaLangTokenType("حاول");
  IElementType VALUE = new YaLangTokenType("VALUE");
  IElementType WHILE_KEYWORD = new YaLangTokenType("بينما");
  IElementType WITH_KEYWORD = new YaLangTokenType("مع");
  IElementType XOR = new YaLangTokenType("^");
  IElementType XOREQ = new YaLangTokenType("^=");
  IElementType YIELD_KEYWORD = new YaLangTokenType("محصول");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AND_EXPR) {
        return new YaLangAndExprImpl(node);
      }
      else if (type == AND_TEST) {
        return new YaLangAndTestImpl(node);
      }
      else if (type == ANNASSIGN) {
        return new YaLangAnnassignImpl(node);
      }
      else if (type == ARGLIST) {
        return new YaLangArglistImpl(node);
      }
      else if (type == ARGUMENT) {
        return new YaLangArgumentImpl(node);
      }
      else if (type == ARITH_EXPR) {
        return new YaLangArithExprImpl(node);
      }
      else if (type == ASSERT_STMT) {
        return new YaLangAssertStmtImpl(node);
      }
      else if (type == ASYNC_FUNCDEF) {
        return new YaLangAsyncFuncdefImpl(node);
      }
      else if (type == ASYNC_STMT) {
        return new YaLangAsyncStmtImpl(node);
      }
      else if (type == ATOM) {
        return new YaLangAtomImpl(node);
      }
      else if (type == ATOM_EXPR) {
        return new YaLangAtomExprImpl(node);
      }
      else if (type == AUGASSIGN) {
        return new YaLangAugassignImpl(node);
      }
      else if (type == BREAK_STMT) {
        return new YaLangBreakStmtImpl(node);
      }
      else if (type == CLASSDEF) {
        return new YaLangClassdefImpl(node);
      }
      else if (type == COMPARISON) {
        return new YaLangComparisonImpl(node);
      }
      else if (type == COMPOUND_STMT) {
        return new YaLangCompoundStmtImpl(node);
      }
      else if (type == COMP_FOR) {
        return new YaLangCompForImpl(node);
      }
      else if (type == COMP_IF) {
        return new YaLangCompIfImpl(node);
      }
      else if (type == COMP_ITER) {
        return new YaLangCompIterImpl(node);
      }
      else if (type == COMP_OP) {
        return new YaLangCompOpImpl(node);
      }
      else if (type == CONTINUE_STMT) {
        return new YaLangContinueStmtImpl(node);
      }
      else if (type == DECORATED) {
        return new YaLangDecoratedImpl(node);
      }
      else if (type == DECORATOR) {
        return new YaLangDecoratorImpl(node);
      }
      else if (type == DECORATORS) {
        return new YaLangDecoratorsImpl(node);
      }
      else if (type == DEL_STMT) {
        return new YaLangDelStmtImpl(node);
      }
      else if (type == DICTORSETMAKER) {
        return new YaLangDictorsetmakerImpl(node);
      }
      else if (type == DOTTED_AS_NAME) {
        return new YaLangDottedAsNameImpl(node);
      }
      else if (type == DOTTED_AS_NAMES) {
        return new YaLangDottedAsNamesImpl(node);
      }
      else if (type == DOTTED_NAME) {
        return new YaLangDottedNameImpl(node);
      }
      else if (type == ENCODING_DECL) {
        return new YaLangEncodingDeclImpl(node);
      }
      else if (type == EVAL_INPUT) {
        return new YaLangEvalInputImpl(node);
      }
      else if (type == EXCEPT_CLAUSE) {
        return new YaLangExceptClauseImpl(node);
      }
      else if (type == EXPR) {
        return new YaLangExprImpl(node);
      }
      else if (type == EXPRLIST) {
        return new YaLangExprlistImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new YaLangExprStmtImpl(node);
      }
      else if (type == FACTOR) {
        return new YaLangFactorImpl(node);
      }
      else if (type == FILE_INPUT) {
        return new YaLangFileInputImpl(node);
      }
      else if (type == FLOW_STMT) {
        return new YaLangFlowStmtImpl(node);
      }
      else if (type == FOR_STMT) {
        return new YaLangForStmtImpl(node);
      }
      else if (type == FUNCDEF) {
        return new YaLangFuncdefImpl(node);
      }
      else if (type == GLOBAL_STMT) {
        return new YaLangGlobalStmtImpl(node);
      }
      else if (type == IF_STMT) {
        return new YaLangIfStmtImpl(node);
      }
      else if (type == IMPORT_AS_NAME) {
        return new YaLangImportAsNameImpl(node);
      }
      else if (type == IMPORT_AS_NAMES) {
        return new YaLangImportAsNamesImpl(node);
      }
      else if (type == IMPORT_FROM) {
        return new YaLangImportFromImpl(node);
      }
      else if (type == IMPORT_NAME) {
        return new YaLangImportNameImpl(node);
      }
      else if (type == IMPORT_STMT) {
        return new YaLangImportStmtImpl(node);
      }
      else if (type == LAMBDEF) {
        return new YaLangLambdefImpl(node);
      }
      else if (type == LAMBDEF_NOCOND) {
        return new YaLangLambdefNocondImpl(node);
      }
      else if (type == NONLOCAL_STMT) {
        return new YaLangNonlocalStmtImpl(node);
      }
      else if (type == NOT_TEST) {
        return new YaLangNotTestImpl(node);
      }
      else if (type == OR_TEST) {
        return new YaLangOrTestImpl(node);
      }
      else if (type == PARAMETERS) {
        return new YaLangParametersImpl(node);
      }
      else if (type == PASS_STMT) {
        return new YaLangPassStmtImpl(node);
      }
      else if (type == POWER) {
        return new YaLangPowerImpl(node);
      }
      else if (type == PROPERTY) {
        return new YaLangPropertyImpl(node);
      }
      else if (type == RAISE_STMT) {
        return new YaLangRaiseStmtImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new YaLangReturnStmtImpl(node);
      }
      else if (type == SHIFT_EXPR) {
        return new YaLangShiftExprImpl(node);
      }
      else if (type == SIMPLE_STMT) {
        return new YaLangSimpleStmtImpl(node);
      }
      else if (type == SINGLE_INPUT) {
        return new YaLangSingleInputImpl(node);
      }
      else if (type == SLICEOP) {
        return new YaLangSliceopImpl(node);
      }
      else if (type == SMALL_STMT) {
        return new YaLangSmallStmtImpl(node);
      }
      else if (type == STAR_EXPR) {
        return new YaLangStarExprImpl(node);
      }
      else if (type == STMT) {
        return new YaLangStmtImpl(node);
      }
      else if (type == SUBSCRIPT) {
        return new YaLangSubscriptImpl(node);
      }
      else if (type == SUBSCRIPTLIST) {
        return new YaLangSubscriptlistImpl(node);
      }
      else if (type == SUITE) {
        return new YaLangSuiteImpl(node);
      }
      else if (type == SYNC_COMP_FOR) {
        return new YaLangSyncCompForImpl(node);
      }
      else if (type == TERM) {
        return new YaLangTermImpl(node);
      }
      else if (type == TEST) {
        return new YaLangTestImpl(node);
      }
      else if (type == TESTLIST) {
        return new YaLangTestlistImpl(node);
      }
      else if (type == TESTLIST_COMP) {
        return new YaLangTestlistCompImpl(node);
      }
      else if (type == TESTLIST_STAR_EXPR) {
        return new YaLangTestlistStarExprImpl(node);
      }
      else if (type == TEST_NOCOND) {
        return new YaLangTestNocondImpl(node);
      }
      else if (type == TFPDEF) {
        return new YaLangTfpdefImpl(node);
      }
      else if (type == TRAILER) {
        return new YaLangTrailerImpl(node);
      }
      else if (type == TRY_STMT) {
        return new YaLangTryStmtImpl(node);
      }
      else if (type == TYPEDARGSLIST) {
        return new YaLangTypedargslistImpl(node);
      }
      else if (type == VARARGSLIST) {
        return new YaLangVarargslistImpl(node);
      }
      else if (type == VFPDEF) {
        return new YaLangVfpdefImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new YaLangWhileStmtImpl(node);
      }
      else if (type == WITH_ITEM) {
        return new YaLangWithItemImpl(node);
      }
      else if (type == WITH_STMT) {
        return new YaLangWithStmtImpl(node);
      }
      else if (type == XOR_EXPR) {
        return new YaLangXorExprImpl(node);
      }
      else if (type == YIELD_ARG) {
        return new YaLangYieldArgImpl(node);
      }
      else if (type == YIELD_EXPR) {
        return new YaLangYieldExprImpl(node);
      }
      else if (type == YIELD_STMT) {
        return new YaLangYieldStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
