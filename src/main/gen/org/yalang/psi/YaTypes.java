// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.yalang.psi.impl.*;

public interface YaTypes {

  IElementType AND_EXPR = new YaElementType("AND_EXPR");
  IElementType AND_TEST = new YaElementType("AND_TEST");
  IElementType ANNASSIGN = new YaElementType("ANNASSIGN");
  IElementType ARGLIST = new YaElementType("ARGLIST");
  IElementType ARGUMENT = new YaElementType("ARGUMENT");
  IElementType ARITH_EXPR = new YaElementType("ARITH_EXPR");
  IElementType ASSERT_STMT = new YaElementType("ASSERT_STMT");
  IElementType ASYNC_FUNCDEF = new YaElementType("ASYNC_FUNCDEF");
  IElementType ASYNC_STMT = new YaElementType("ASYNC_STMT");
  IElementType ATOM = new YaElementType("ATOM");
  IElementType ATOM_EXPR = new YaElementType("ATOM_EXPR");
  IElementType AUGASSIGN = new YaElementType("AUGASSIGN");
  IElementType BREAK_STMT = new YaElementType("BREAK_STMT");
  IElementType CLASSDEF = new YaElementType("CLASSDEF");
  IElementType COMPARISON = new YaElementType("COMPARISON");
  IElementType COMPOUND_STMT = new YaElementType("COMPOUND_STMT");
  IElementType COMP_FOR = new YaElementType("COMP_FOR");
  IElementType COMP_IF = new YaElementType("COMP_IF");
  IElementType COMP_ITER = new YaElementType("COMP_ITER");
  IElementType COMP_OP = new YaElementType("COMP_OP");
  IElementType CONTINUE_STMT = new YaElementType("CONTINUE_STMT");
  IElementType DECORATED = new YaElementType("DECORATED");
  IElementType DECORATOR = new YaElementType("DECORATOR");
  IElementType DECORATORS = new YaElementType("DECORATORS");
  IElementType DEL_STMT = new YaElementType("DEL_STMT");
  IElementType DICTORSETMAKER = new YaElementType("DICTORSETMAKER");
  IElementType DOTTED_AS_NAME = new YaElementType("DOTTED_AS_NAME");
  IElementType DOTTED_AS_NAMES = new YaElementType("DOTTED_AS_NAMES");
  IElementType DOTTED_NAME = new YaElementType("DOTTED_NAME");
  IElementType ENCODING_DECL = new YaElementType("ENCODING_DECL");
  IElementType EVAL_INPUT = new YaElementType("EVAL_INPUT");
  IElementType EXCEPT_CLAUSE = new YaElementType("EXCEPT_CLAUSE");
  IElementType EXPR = new YaElementType("EXPR");
  IElementType EXPRLIST = new YaElementType("EXPRLIST");
  IElementType EXPR_STMT = new YaElementType("EXPR_STMT");
  IElementType FACTOR = new YaElementType("FACTOR");
  IElementType FILE_INPUT = new YaElementType("FILE_INPUT");
  IElementType FLOW_STMT = new YaElementType("FLOW_STMT");
  IElementType FOR_STMT = new YaElementType("FOR_STMT");
  IElementType FUNCDEF = new YaElementType("FUNCDEF");
  IElementType GLOBAL_STMT = new YaElementType("GLOBAL_STMT");
  IElementType IF_STMT = new YaElementType("IF_STMT");
  IElementType IMPORT_AS_NAME = new YaElementType("IMPORT_AS_NAME");
  IElementType IMPORT_AS_NAMES = new YaElementType("IMPORT_AS_NAMES");
  IElementType IMPORT_FROM = new YaElementType("IMPORT_FROM");
  IElementType IMPORT_NAME = new YaElementType("IMPORT_NAME");
  IElementType IMPORT_STMT = new YaElementType("IMPORT_STMT");
  IElementType LAMBDEF = new YaElementType("LAMBDEF");
  IElementType LAMBDEF_NOCOND = new YaElementType("LAMBDEF_NOCOND");
  IElementType NONLOCAL_STMT = new YaElementType("NONLOCAL_STMT");
  IElementType NOT_TEST = new YaElementType("NOT_TEST");
  IElementType OR_TEST = new YaElementType("OR_TEST");
  IElementType PARAMETERS = new YaElementType("PARAMETERS");
  IElementType PASS_STMT = new YaElementType("PASS_STMT");
  IElementType POWER = new YaElementType("POWER");
  IElementType PROPERTY = new YaElementType("PROPERTY");
  IElementType RAISE_STMT = new YaElementType("RAISE_STMT");
  IElementType RETURN_STMT = new YaElementType("RETURN_STMT");
  IElementType SHIFT_EXPR = new YaElementType("SHIFT_EXPR");
  IElementType SIMPLE_STMT = new YaElementType("SIMPLE_STMT");
  IElementType SINGLE_INPUT = new YaElementType("SINGLE_INPUT");
  IElementType SLICEOP = new YaElementType("SLICEOP");
  IElementType SMALL_STMT = new YaElementType("SMALL_STMT");
  IElementType STAR_EXPR = new YaElementType("STAR_EXPR");
  IElementType STMT = new YaElementType("STMT");
  IElementType SUBSCRIPT = new YaElementType("SUBSCRIPT");
  IElementType SUBSCRIPTLIST = new YaElementType("SUBSCRIPTLIST");
  IElementType SUITE = new YaElementType("SUITE");
  IElementType SYNC_COMP_FOR = new YaElementType("SYNC_COMP_FOR");
  IElementType TERM = new YaElementType("TERM");
  IElementType TEST = new YaElementType("TEST");
  IElementType TESTLIST = new YaElementType("TESTLIST");
  IElementType TESTLIST_COMP = new YaElementType("TESTLIST_COMP");
  IElementType TESTLIST_STAR_EXPR = new YaElementType("TESTLIST_STAR_EXPR");
  IElementType TEST_NOCOND = new YaElementType("TEST_NOCOND");
  IElementType TFPDEF = new YaElementType("TFPDEF");
  IElementType TRAILER = new YaElementType("TRAILER");
  IElementType TRY_STMT = new YaElementType("TRY_STMT");
  IElementType TYPEDARGSLIST = new YaElementType("TYPEDARGSLIST");
  IElementType VARARGSLIST = new YaElementType("VARARGSLIST");
  IElementType VFPDEF = new YaElementType("VFPDEF");
  IElementType WHILE_STMT = new YaElementType("WHILE_STMT");
  IElementType WITH_ITEM = new YaElementType("WITH_ITEM");
  IElementType WITH_STMT = new YaElementType("WITH_STMT");
  IElementType XOR_EXPR = new YaElementType("XOR_EXPR");
  IElementType YIELD_ARG = new YaElementType("YIELD_ARG");
  IElementType YIELD_EXPR = new YaElementType("YIELD_EXPR");
  IElementType YIELD_STMT = new YaElementType("YIELD_STMT");

  IElementType AND = new YaTokenType("&");
  IElementType ANDEQ = new YaTokenType("&=");
  IElementType AND_KEYWORD = new YaTokenType("و");
  IElementType ASSERT_KEYWORD = new YaTokenType("أكد");
  IElementType ASYNC_KEYWORD = new YaTokenType("غيرمتزامن");
  IElementType AS_KEYWORD = new YaTokenType("مثل");
  IElementType AT = new YaTokenType("@");
  IElementType ATEQ = new YaTokenType("@=");
  IElementType AWAIT_KEYWORD = new YaTokenType("ترقب");
  IElementType BREAK_KEYWORD = new YaTokenType("اكسر");
  IElementType CLASS_KEYWORD = new YaTokenType("صنف");
  IElementType COLON = new YaTokenType(":");
  IElementType COMMA = new YaTokenType("،");
  IElementType COMMENT = new YaTokenType("COMMENT");
  IElementType CONTINUE_KEYWORD = new YaTokenType("استمر");
  IElementType CRLF = new YaTokenType("CRLF");
  IElementType DEDENT = new YaTokenType("DEDENT");
  IElementType DEF_KEYWORD = new YaTokenType("وظيفة");
  IElementType DEL_KEYWORD = new YaTokenType("حذف");
  IElementType DIV = new YaTokenType("/");
  IElementType DIVEQ = new YaTokenType("/=");
  IElementType DOT = new YaTokenType(".");
  IElementType ELIF_KEYWORD = new YaTokenType("ولو");
  IElementType ELSE_KEYWORD = new YaTokenType("آخر");
  IElementType ENDMARKER = new YaTokenType("ENDMARKER");
  IElementType EQ = new YaTokenType("=");
  IElementType EQEQ = new YaTokenType("==");
  IElementType EXCEPT_KEYWORD = new YaTokenType("إلا");
  IElementType EXP = new YaTokenType("**");
  IElementType EXPEQ = new YaTokenType("**=");
  IElementType FALSE_KEYWORD = new YaTokenType("زائف");
  IElementType FINALLY_KEYWORD = new YaTokenType("أخيرا");
  IElementType FLOORDIV = new YaTokenType("//");
  IElementType FLOORDIVEQ = new YaTokenType("//=");
  IElementType FOR_KEYWORD = new YaTokenType("لأن");
  IElementType FROM_KEYWORD = new YaTokenType("من");
  IElementType GE = new YaTokenType(">=");
  IElementType GLOBAL_KEYWORD = new YaTokenType("عالمي");
  IElementType GT = new YaTokenType(">");
  IElementType GTGT = new YaTokenType(">>");
  IElementType GTGTEQ = new YaTokenType(">>=");
  IElementType IF_KEYWORD = new YaTokenType("لو");
  IElementType IMPORT_KEYWORD = new YaTokenType("استيراد");
  IElementType INDENT = new YaTokenType("INDENT");
  IElementType IN_KEYWORD = new YaTokenType("في");
  IElementType IS_KEYWORD = new YaTokenType("يساوي");
  IElementType KEY = new YaTokenType("KEY");
  IElementType LAMBDA_KEYWORD = new YaTokenType("امدا");
  IElementType LBRACE = new YaTokenType("{");
  IElementType LBRACKET = new YaTokenType("[");
  IElementType LE = new YaTokenType("<=");
  IElementType LPAR = new YaTokenType("(");
  IElementType LT = new YaTokenType("<");
  IElementType LTLT = new YaTokenType("<<");
  IElementType LTLTEQ = new YaTokenType("<<=");
  IElementType MINUS = new YaTokenType("-");
  IElementType MINUSEQ = new YaTokenType("-=");
  IElementType MULT = new YaTokenType("*");
  IElementType MULTEQ = new YaTokenType("*=");
  IElementType NAME = new YaTokenType("NAME");
  IElementType NE = new YaTokenType("!=");
  IElementType NEWLINE = new YaTokenType("NEWLINE");
  IElementType NE_OLD = new YaTokenType("<>");
  IElementType NONE_KEYWORD = new YaTokenType("لااحد");
  IElementType NONLOCAL_KEYWORD = new YaTokenType("غيرمحلي");
  IElementType NOT_KEYWORD = new YaTokenType("لا");
  IElementType NUMBER = new YaTokenType("NUMBER");
  IElementType OR = new YaTokenType("|");
  IElementType OREQ = new YaTokenType("|=");
  IElementType OR_KEYWORD = new YaTokenType("أو");
  IElementType PASS_KEYWORD = new YaTokenType("مرر");
  IElementType PERC = new YaTokenType("٪");
  IElementType PERCEQ = new YaTokenType("٪=");
  IElementType PLUS = new YaTokenType("+");
  IElementType PLUSEQ = new YaTokenType("+=");
  IElementType RAISE_KEYWORD = new YaTokenType("رفع");
  IElementType RARROW = new YaTokenType("->");
  IElementType RBRACE = new YaTokenType("}");
  IElementType RBRACKET = new YaTokenType("]");
  IElementType RETURN_KEYWORD = new YaTokenType("إرجع");
  IElementType RPAR = new YaTokenType(")");
  IElementType SEMICOLON = new YaTokenType("؛");
  IElementType SEPARATOR = new YaTokenType("SEPARATOR");
  IElementType STRING = new YaTokenType("STRING");
  IElementType TICK = new YaTokenType("`");
  IElementType TILDE = new YaTokenType("~");
  IElementType TRUE_KEYWORD = new YaTokenType("صحيح");
  IElementType TRY_KEYWORD = new YaTokenType("حاول");
  IElementType VALUE = new YaTokenType("VALUE");
  IElementType WHILE_KEYWORD = new YaTokenType("بينما");
  IElementType WITH_KEYWORD = new YaTokenType("مع");
  IElementType XOR = new YaTokenType("^");
  IElementType XOREQ = new YaTokenType("^=");
  IElementType YIELD_KEYWORD = new YaTokenType("محصول");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AND_EXPR) {
        return new YaAndExprImpl(node);
      }
      else if (type == AND_TEST) {
        return new YaAndTestImpl(node);
      }
      else if (type == ANNASSIGN) {
        return new YaAnnassignImpl(node);
      }
      else if (type == ARGLIST) {
        return new YaArglistImpl(node);
      }
      else if (type == ARGUMENT) {
        return new YaArgumentImpl(node);
      }
      else if (type == ARITH_EXPR) {
        return new YaArithExprImpl(node);
      }
      else if (type == ASSERT_STMT) {
        return new YaAssertStmtImpl(node);
      }
      else if (type == ASYNC_FUNCDEF) {
        return new YaAsyncFuncdefImpl(node);
      }
      else if (type == ASYNC_STMT) {
        return new YaAsyncStmtImpl(node);
      }
      else if (type == ATOM) {
        return new YaAtomImpl(node);
      }
      else if (type == ATOM_EXPR) {
        return new YaAtomExprImpl(node);
      }
      else if (type == AUGASSIGN) {
        return new YaAugassignImpl(node);
      }
      else if (type == BREAK_STMT) {
        return new YaBreakStmtImpl(node);
      }
      else if (type == CLASSDEF) {
        return new YaClassdefImpl(node);
      }
      else if (type == COMPARISON) {
        return new YaComparisonImpl(node);
      }
      else if (type == COMPOUND_STMT) {
        return new YaCompoundStmtImpl(node);
      }
      else if (type == COMP_FOR) {
        return new YaCompForImpl(node);
      }
      else if (type == COMP_IF) {
        return new YaCompIfImpl(node);
      }
      else if (type == COMP_ITER) {
        return new YaCompIterImpl(node);
      }
      else if (type == COMP_OP) {
        return new YaCompOpImpl(node);
      }
      else if (type == CONTINUE_STMT) {
        return new YaContinueStmtImpl(node);
      }
      else if (type == DECORATED) {
        return new YaDecoratedImpl(node);
      }
      else if (type == DECORATOR) {
        return new YaDecoratorImpl(node);
      }
      else if (type == DECORATORS) {
        return new YaDecoratorsImpl(node);
      }
      else if (type == DEL_STMT) {
        return new YaDelStmtImpl(node);
      }
      else if (type == DICTORSETMAKER) {
        return new YaDictorsetmakerImpl(node);
      }
      else if (type == DOTTED_AS_NAME) {
        return new YaDottedAsNameImpl(node);
      }
      else if (type == DOTTED_AS_NAMES) {
        return new YaDottedAsNamesImpl(node);
      }
      else if (type == DOTTED_NAME) {
        return new YaDottedNameImpl(node);
      }
      else if (type == ENCODING_DECL) {
        return new YaEncodingDeclImpl(node);
      }
      else if (type == EVAL_INPUT) {
        return new YaEvalInputImpl(node);
      }
      else if (type == EXCEPT_CLAUSE) {
        return new YaExceptClauseImpl(node);
      }
      else if (type == EXPR) {
        return new YaExprImpl(node);
      }
      else if (type == EXPRLIST) {
        return new YaExprlistImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new YaExprStmtImpl(node);
      }
      else if (type == FACTOR) {
        return new YaFactorImpl(node);
      }
      else if (type == FILE_INPUT) {
        return new YaFileInputImpl(node);
      }
      else if (type == FLOW_STMT) {
        return new YaFlowStmtImpl(node);
      }
      else if (type == FOR_STMT) {
        return new YaForStmtImpl(node);
      }
      else if (type == FUNCDEF) {
        return new YaFuncdefImpl(node);
      }
      else if (type == GLOBAL_STMT) {
        return new YaGlobalStmtImpl(node);
      }
      else if (type == IF_STMT) {
        return new YaIfStmtImpl(node);
      }
      else if (type == IMPORT_AS_NAME) {
        return new YaImportAsNameImpl(node);
      }
      else if (type == IMPORT_AS_NAMES) {
        return new YaImportAsNamesImpl(node);
      }
      else if (type == IMPORT_FROM) {
        return new YaImportFromImpl(node);
      }
      else if (type == IMPORT_NAME) {
        return new YaImportNameImpl(node);
      }
      else if (type == IMPORT_STMT) {
        return new YaImportStmtImpl(node);
      }
      else if (type == LAMBDEF) {
        return new YaLambdefImpl(node);
      }
      else if (type == LAMBDEF_NOCOND) {
        return new YaLambdefNocondImpl(node);
      }
      else if (type == NONLOCAL_STMT) {
        return new YaNonlocalStmtImpl(node);
      }
      else if (type == NOT_TEST) {
        return new YaNotTestImpl(node);
      }
      else if (type == OR_TEST) {
        return new YaOrTestImpl(node);
      }
      else if (type == PARAMETERS) {
        return new YaParametersImpl(node);
      }
      else if (type == PASS_STMT) {
        return new YaPassStmtImpl(node);
      }
      else if (type == POWER) {
        return new YaPowerImpl(node);
      }
      else if (type == PROPERTY) {
        return new YaPropertyImpl(node);
      }
      else if (type == RAISE_STMT) {
        return new YaRaiseStmtImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new YaReturnStmtImpl(node);
      }
      else if (type == SHIFT_EXPR) {
        return new YaShiftExprImpl(node);
      }
      else if (type == SIMPLE_STMT) {
        return new YaSimpleStmtImpl(node);
      }
      else if (type == SINGLE_INPUT) {
        return new YaSingleInputImpl(node);
      }
      else if (type == SLICEOP) {
        return new YaSliceopImpl(node);
      }
      else if (type == SMALL_STMT) {
        return new YaSmallStmtImpl(node);
      }
      else if (type == STAR_EXPR) {
        return new YaStarExprImpl(node);
      }
      else if (type == STMT) {
        return new YaStmtImpl(node);
      }
      else if (type == SUBSCRIPT) {
        return new YaSubscriptImpl(node);
      }
      else if (type == SUBSCRIPTLIST) {
        return new YaSubscriptlistImpl(node);
      }
      else if (type == SUITE) {
        return new YaSuiteImpl(node);
      }
      else if (type == SYNC_COMP_FOR) {
        return new YaSyncCompForImpl(node);
      }
      else if (type == TERM) {
        return new YaTermImpl(node);
      }
      else if (type == TEST) {
        return new YaTestImpl(node);
      }
      else if (type == TESTLIST) {
        return new YaTestlistImpl(node);
      }
      else if (type == TESTLIST_COMP) {
        return new YaTestlistCompImpl(node);
      }
      else if (type == TESTLIST_STAR_EXPR) {
        return new YaTestlistStarExprImpl(node);
      }
      else if (type == TEST_NOCOND) {
        return new YaTestNocondImpl(node);
      }
      else if (type == TFPDEF) {
        return new YaTfpdefImpl(node);
      }
      else if (type == TRAILER) {
        return new YaTrailerImpl(node);
      }
      else if (type == TRY_STMT) {
        return new YaTryStmtImpl(node);
      }
      else if (type == TYPEDARGSLIST) {
        return new YaTypedargslistImpl(node);
      }
      else if (type == VARARGSLIST) {
        return new YaVarargslistImpl(node);
      }
      else if (type == VFPDEF) {
        return new YaVfpdefImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new YaWhileStmtImpl(node);
      }
      else if (type == WITH_ITEM) {
        return new YaWithItemImpl(node);
      }
      else if (type == WITH_STMT) {
        return new YaWithStmtImpl(node);
      }
      else if (type == XOR_EXPR) {
        return new YaXorExprImpl(node);
      }
      else if (type == YIELD_ARG) {
        return new YaYieldArgImpl(node);
      }
      else if (type == YIELD_EXPR) {
        return new YaYieldExprImpl(node);
      }
      else if (type == YIELD_STMT) {
        return new YaYieldStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
