// Generated from AST/phpParser.all
package AST;
import AST.*;
import utility.LabelUtility; 
import java.util.ArrayList;
import beaver.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.4
 * from the grammar specification "phpParser.beaver".
 */
public class phpParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short SQL = 1;
		static public final short LPAREN = 2;
		static public final short IDENTIFIER = 3;
		static public final short SEP = 4;
		static public final short RPAREN = 5;
		static public final short IF = 6;
		static public final short ELSE = 7;
		static public final short POST = 8;
		static public final short LSBRACE = 9;
		static public final short READIDENTIFIER = 10;
		static public final short RSBRACE = 11;
		static public final short SQLNUMROWS = 12;
		static public final short ASSIGN = 13;
		static public final short SEMICOLON = 14;
		static public final short WHILE = 15;
		static public final short REQUIRE = 16;
		static public final short FILEVAR = 17;
		static public final short PHPBEGIN = 18;
		static public final short PHPEND = 19;
		static public final short LBRACE = 20;
		static public final short RBRACE = 21;
		static public final short ECHO = 22;
		static public final short OPPLUS = 23;
		static public final short STRVAR = 24;
		static public final short NUMBER = 25;
		static public final short TRUE = 26;
		static public final short FALSE = 27;
		static public final short NOT = 28;
		static public final short OPMUL = 29;
		static public final short OPMINUS = 30;
		static public final short OPRELATIONAL = 31;
		static public final short AND = 32;
		static public final short OR = 33;

		static public final String[] NAMES = {
			"EOF",
			"SQL",
			"LPAREN",
			"IDENTIFIER",
			"SEP",
			"RPAREN",
			"IF",
			"ELSE",
			"POST",
			"LSBRACE",
			"READIDENTIFIER",
			"RSBRACE",
			"SQLNUMROWS",
			"ASSIGN",
			"SEMICOLON",
			"WHILE",
			"REQUIRE",
			"FILEVAR",
			"PHPBEGIN",
			"PHPEND",
			"LBRACE",
			"RBRACE",
			"ECHO",
			"OPPLUS",
			"STRVAR",
			"NUMBER",
			"TRUE",
			"FALSE",
			"NOT",
			"OPMUL",
			"OPMINUS",
			"OPRELATIONAL",
			"AND",
			"OR"
		};
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pDLLjlL5KK$jQSdgbIEfssemDMIsTwfwNGggWe2WX2LS07Otp1nFZgBz0OeebFn2TYlCH" +
		"4ueqOZK#yD2OYqLTYz56ivTO2fLUgfVJYyjjhzZbpK#AZU#MRlTQtRlkSlVSPcKKUzo231$" +
		"0W7a60Lc$t8A6gvsWxAuaU$Kilu5vimrsu6rbiG0qEaodQXRp8AjQfPrIThtC7xKPsQYx9U" +
		"uZspjlKkHDRiOvv$RZVLjc0#p24ZHZ49jOjvhMOrLOHznZZzk1m1ViKMTUbd7qQWteLkNAM" +
		"pA1EnbtQiPzC1vakdKSdclIgbqbqa#dLEMpMoLZcqKTcG6THf$Enp64tcKTr1e$hN2opU8B" +
		"CRft6BfsDPGP9CljqYfwPMAPnWCn1lOP3EXtB5406UfsOYYLYhkXvhlUQbuY1NjBhiLpHDM" +
		"FME3VHAiXvNN6Chj2tXcTClqHP9h#YosHNTCBfi45#cSyxOHwd5zXRIDjlDBRZOSPCw2tAa" +
		"lFeajCjzcRXbyoIQSvFdSnDNJJFejFTBkggHQoIMJJD#QcJMKMjys27wOXt4TYBP#q4XBQI" +
		"OTFTYEv20zRpHBXgutwrSIwPI8$cD6frZBrs6BQptpXbJ2zQdmXFOfZCi8wod$NG1QIO1nt" +
		"Lo$gd$g6$wuBUu8svY2sbZFvcAnbrZ6aBdhaSHL6$WQh1A462jxe7lTYC9jw$WhqUM#ZUIj" +
		"jPdRJ1Dn7oIJRo3RJmddUGJPNOXRp8AjPfutt9#Jhrj5sdtf8yPuUtgPEdbM9U5xhzAlju$" +
		"tenm7kVAydBcxMk8YxFEBVIQjPrgMP3VYFAsPInKPS4zQojAA1Mm$lVog#CUyOixPJvWogs" +
		"cx#vCZRZOzlBs5gocIgsqyTcojXsierMlOHLvNbHXCG$i9GArlEbTGFZarnBaStncHfuXfF" +
		"qDTFhJdLR1HiwLcqOcsDSC$KY6rZFfFeHLtVHWTL8Hj7ETh7EPvglL1bhk$WVOwdvNVGhTB" +
		"dDbc5rJ2lU1UwzCQ5VRJ4t5P#6QCxQQGZOnw6LQBFd3wrF1BUc514IXHuXprVEAePUd5ROX" +
		"vGNfzaQZCrwBMLpOMzoLYEdLOEUvuuglmZryecyYeoa#U#Zs2ijh9dcrsjLDk4rl2L7y0xU" +
		"nwVu1YFoEdxatZVY9$aIp#C8ti0ytiLx#10Vu8HyZC$n1RwICt8AXsH4Vf3JSbQ#a#$nAyR" +
		"bJSp9st8Ct$9qxiH9dCOf6PBFv8I4#9blz3ZEo2xibpevWBFuHLwGbxY#CM99fu#g4mouNt" +
		"cPE6vsccWi#CmU8lOKxNyN7AjYDh3JETCE4XyH9vsEhurxaHWXNYdB#R#F3dwbXL$hWEyye" +
		"2L4Wj#C6gAM28d0q4rVbo7WDotW2PGA90Xt$eK8U3w520pzrFivzt7kuvpddBUvXaZwMGpR" +
		"$WQclTzP");
 // Generated from AST/phpParser.all
class Events extends Parser.Events {
    public void syntaxError(Symbol token) {
      StringBuffer s = new StringBuffer();
      s.append(token.getLine(token.getStart()) + ", " + token.getColumn(token.getStart()) + "\n");
      s.append("  *** Syntactic error: unexpected token " + Terminals.NAMES[token.getId()]);
      throw new Error(s.toString());
    }
    public void scannerError(Scanner.Exception e) {
      StringBuffer s = new StringBuffer();
      s.append(e.line + ", " + e.column + "\n");
      s.append("  *** Lexical error: " + e.getMessage());
      throw new Error(s.toString());
    }
  }
  {LabelUtility.reset();  
  report = new Events(); } // Use error handler in parser

	public phpParser() {
		super(PARSING_TABLES);
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		switch(rule_num) {
			case 0: // goal = mainblock.mainblock
			{
					final Symbol _symbol_mainblock = _symbols[offset + 1];
					final S mainblock = (S) _symbol_mainblock.value;
					 ASTNode _node_ = new Program(mainblock);
        _node_.setStart(Symbol.getLine(_symbol_mainblock.getStart()), (short) Symbol.getColumn(_symbol_mainblock.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_mainblock.getEnd()), (short) Symbol.getColumn(_symbol_mainblock.getEnd()));
        return new Symbol(_node_);
			}
			case 1: // mainblock = PHPBEGIN.PHPBEGIN blockStmtList.blockStmtList PHPEND.PHPEND
			{
					final Symbol PHPBEGIN = _symbols[offset + 1];
					final Symbol _symbol_blockStmtList = _symbols[offset + 2];
					final List blockStmtList = (List) _symbol_blockStmtList.value;
					final Symbol PHPEND = _symbols[offset + 3];
					 ASTNode _node_ = new CompoundS(blockStmtList);
        _node_.setStart(Symbol.getLine(PHPBEGIN.getStart()), (short) Symbol.getColumn(PHPBEGIN.getStart()));
        _node_.setEnd(Symbol.getLine(PHPEND.getEnd()), (short) Symbol.getColumn(PHPEND.getEnd()));
        return new Symbol(_node_);
			}
			case 2: // block = LBRACE.LBRACE blockStmtList.blockStmtList RBRACE.RBRACE
			{
					final Symbol LBRACE = _symbols[offset + 1];
					final Symbol _symbol_blockStmtList = _symbols[offset + 2];
					final List blockStmtList = (List) _symbol_blockStmtList.value;
					final Symbol RBRACE = _symbols[offset + 3];
					 ASTNode _node_ = new CompoundS(blockStmtList);
        _node_.setStart(Symbol.getLine(LBRACE.getStart()), (short) Symbol.getColumn(LBRACE.getStart()));
        _node_.setEnd(Symbol.getLine(RBRACE.getEnd()), (short) Symbol.getColumn(RBRACE.getEnd()));
        return new Symbol(_node_);
			}
			case 3: // blockStmtList = stmt.stmt
			{
					final Symbol _symbol_stmt = _symbols[offset + 1];
					final S stmt = (S) _symbol_stmt.value;
					 ASTNode _node_ = new List().add(stmt);
        _node_.setStart(Symbol.getLine(_symbol_stmt.getStart()), (short) Symbol.getColumn(_symbol_stmt.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_stmt.getEnd()), (short) Symbol.getColumn(_symbol_stmt.getEnd()));
        return new Symbol(_node_);
			}
			case 4: // blockStmtList = blockStmtList.blockStmtList stmt.stmt
			{
					final Symbol _symbol_blockStmtList = _symbols[offset + 1];
					final List blockStmtList = (List) _symbol_blockStmtList.value;
					final Symbol _symbol_stmt = _symbols[offset + 2];
					final S stmt = (S) _symbol_stmt.value;
					 ASTNode _node_ = blockStmtList.add(stmt);
        _node_.setStart(Symbol.getLine(_symbol_blockStmtList.getStart()), (short) Symbol.getColumn(_symbol_blockStmtList.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_stmt.getEnd()), (short) Symbol.getColumn(_symbol_stmt.getEnd()));
        return new Symbol(_node_);
			}
			case 5: // stmt = IDENTIFIER.IDENTIFIER ASSIGN.ASSIGN expression.e SEMICOLON.SEMICOLON
			{
					final Symbol IDENTIFIER = _symbols[offset + 1];
					final Symbol ASSIGN = _symbols[offset + 2];
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol SEMICOLON = _symbols[offset + 4];
					 ASTNode _node_ = new AssignS(new NumLabel(LabelUtility.nextLabel()), ((String)IDENTIFIER.value), e);
        _node_.setStart(Symbol.getLine(IDENTIFIER.getStart()), (short) Symbol.getColumn(IDENTIFIER.getStart()));
        _node_.setEnd(Symbol.getLine(SEMICOLON.getEnd()), (short) Symbol.getColumn(SEMICOLON.getEnd()));
        return new Symbol(_node_);
			}
			case 6: // stmt = IF.IF LPAREN.LPAREN expression.be RPAREN.RPAREN block.b ELSE.ELSE block.c
			{
					final Symbol IF = _symbols[offset + 1];
					final Symbol LPAREN = _symbols[offset + 2];
					final Symbol _symbol_be = _symbols[offset + 3];
					final Expr be = (Expr) _symbol_be.value;
					final Symbol RPAREN = _symbols[offset + 4];
					final Symbol _symbol_b = _symbols[offset + 5];
					final S b = (S) _symbol_b.value;
					final Symbol ELSE = _symbols[offset + 6];
					final Symbol _symbol_c = _symbols[offset + 7];
					final S c = (S) _symbol_c.value;
					 ASTNode _node_ = new IfS(new LabeledExpr(new NumLabel(LabelUtility.nextLabel()), be), b, c);
        _node_.setStart(Symbol.getLine(IF.getStart()), (short) Symbol.getColumn(IF.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_c.getEnd()), (short) Symbol.getColumn(_symbol_c.getEnd()));
        return new Symbol(_node_);
			}
			case 7: // stmt = WHILE.WHILE LPAREN.LPAREN expression.be RPAREN.RPAREN block.block
			{
					final Symbol WHILE = _symbols[offset + 1];
					final Symbol LPAREN = _symbols[offset + 2];
					final Symbol _symbol_be = _symbols[offset + 3];
					final Expr be = (Expr) _symbol_be.value;
					final Symbol RPAREN = _symbols[offset + 4];
					final Symbol _symbol_block = _symbols[offset + 5];
					final S block = (S) _symbol_block.value;
					 ASTNode _node_ = new WhileS(new LabeledExpr(new NumLabel(LabelUtility.nextLabel()), be), block);
        _node_.setStart(Symbol.getLine(WHILE.getStart()), (short) Symbol.getColumn(WHILE.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_block.getEnd()), (short) Symbol.getColumn(_symbol_block.getEnd()));
        return new Symbol(_node_);
			}
			case 8: // stmt = ECHO.ECHO expression.be SEMICOLON.SEMICOLON
			{
					final Symbol ECHO = _symbols[offset + 1];
					final Symbol _symbol_be = _symbols[offset + 2];
					final Expr be = (Expr) _symbol_be.value;
					final Symbol SEMICOLON = _symbols[offset + 3];
					 ASTNode _node_ = new EchoS(new NumLabel(LabelUtility.nextLabel()), be);
        _node_.setStart(Symbol.getLine(ECHO.getStart()), (short) Symbol.getColumn(ECHO.getStart()));
        _node_.setEnd(Symbol.getLine(SEMICOLON.getEnd()), (short) Symbol.getColumn(SEMICOLON.getEnd()));
        return new Symbol(_node_);
			}
			case 9: // stmt = REQUIRE.REQUIRE FILEVAR.FILEVAR SEMICOLON.SEMICOLON
			{
					final Symbol REQUIRE = _symbols[offset + 1];
					final Symbol FILEVAR = _symbols[offset + 2];
					final Symbol SEMICOLON = _symbols[offset + 3];
					 ASTNode _node_ = new RequireS(new NumLabel(LabelUtility.nextLabel()), new FileLitExpr(((String)FILEVAR.value)));
        _node_.setStart(Symbol.getLine(REQUIRE.getStart()), (short) Symbol.getColumn(REQUIRE.getStart()));
        _node_.setEnd(Symbol.getLine(SEMICOLON.getEnd()), (short) Symbol.getColumn(SEMICOLON.getEnd()));
        return new Symbol(_node_);
			}
			case 10: // strprimary = STRVAR.STRVAR
			{
					final Symbol STRVAR = _symbols[offset + 1];
					 ASTNode _node_ = new StrLitExpr(((String)STRVAR.value));
        _node_.setStart(Symbol.getLine(STRVAR.getStart()), (short) Symbol.getColumn(STRVAR.getStart()));
        _node_.setEnd(Symbol.getLine(STRVAR.getEnd()), (short) Symbol.getColumn(STRVAR.getEnd()));
        return new Symbol(_node_);
			}
			case 11: // strfactor = strprimary.p
			{
					final Symbol _symbol_p = _symbols[offset + 1];
					final Expr p = (Expr) _symbol_p.value;
					 ASTNode _node_ = p;
        _node_.setStart(Symbol.getLine(_symbol_p.getStart()), (short) Symbol.getColumn(_symbol_p.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_p.getEnd()), (short) Symbol.getColumn(_symbol_p.getEnd()));
        return new Symbol(_node_);
			}
			case 12: // strfactor = strfactor.l OPPLUS.OPPLUS strprimary.r
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final Expr l = (Expr) _symbol_l.value;
					final Symbol OPPLUS = _symbols[offset + 2];
					final Symbol _symbol_r = _symbols[offset + 3];
					final Expr r = (Expr) _symbol_r.value;
					 ASTNode _node_ = new StringExpr(l, new Op_s(((String)OPPLUS.value)), r);
        _node_.setStart(Symbol.getLine(_symbol_l.getStart()), (short) Symbol.getColumn(_symbol_l.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_r.getEnd()), (short) Symbol.getColumn(_symbol_r.getEnd()));
        return new Symbol(_node_);
			}
			case 13: // strfactor2 = strfactor.l OPPLUS.OPPLUS IDENTIFIER.IDENTIFIER
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final Expr l = (Expr) _symbol_l.value;
					final Symbol OPPLUS = _symbols[offset + 2];
					final Symbol IDENTIFIER = _symbols[offset + 3];
					 ASTNode _node_ = new StringExpr(l, new Op_s(((String)OPPLUS.value)), new VarRefExpr(((String)IDENTIFIER.value)));
        _node_.setStart(Symbol.getLine(_symbol_l.getStart()), (short) Symbol.getColumn(_symbol_l.getStart()));
        _node_.setEnd(Symbol.getLine(IDENTIFIER.getEnd()), (short) Symbol.getColumn(IDENTIFIER.getEnd()));
        return new Symbol(_node_);
			}
			case 14: // primary = IDENTIFIER.IDENTIFIER
			{
					final Symbol IDENTIFIER = _symbols[offset + 1];
					 ASTNode _node_ = new VarRefExpr(((String)IDENTIFIER.value));
        _node_.setStart(Symbol.getLine(IDENTIFIER.getStart()), (short) Symbol.getColumn(IDENTIFIER.getStart()));
        _node_.setEnd(Symbol.getLine(IDENTIFIER.getEnd()), (short) Symbol.getColumn(IDENTIFIER.getEnd()));
        return new Symbol(_node_);
			}
			case 15: // primary = NUMBER.NUMBER
			{
					final Symbol NUMBER = _symbols[offset + 1];
					 ASTNode _node_ = new NumLitExpr(((String)NUMBER.value));
        _node_.setStart(Symbol.getLine(NUMBER.getStart()), (short) Symbol.getColumn(NUMBER.getStart()));
        _node_.setEnd(Symbol.getLine(NUMBER.getEnd()), (short) Symbol.getColumn(NUMBER.getEnd()));
        return new Symbol(_node_);
			}
			case 16: // primary = TRUE.TRUE
			{
					final Symbol TRUE = _symbols[offset + 1];
					 ASTNode _node_ = new BoolLitExpr(((String)TRUE.value));
        _node_.setStart(Symbol.getLine(TRUE.getStart()), (short) Symbol.getColumn(TRUE.getStart()));
        _node_.setEnd(Symbol.getLine(TRUE.getEnd()), (short) Symbol.getColumn(TRUE.getEnd()));
        return new Symbol(_node_);
			}
			case 17: // primary = FALSE.FALSE
			{
					final Symbol FALSE = _symbols[offset + 1];
					 ASTNode _node_ = new BoolLitExpr(((String)FALSE.value));
        _node_.setStart(Symbol.getLine(FALSE.getStart()), (short) Symbol.getColumn(FALSE.getStart()));
        _node_.setEnd(Symbol.getLine(FALSE.getEnd()), (short) Symbol.getColumn(FALSE.getEnd()));
        return new Symbol(_node_);
			}
			case 18: // primary = NOT.NOT primary.e
			{
					final Symbol NOT = _symbols[offset + 1];
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expr e = (Expr) _symbol_e.value;
					 ASTNode _node_ = new NotExpr(e);
        _node_.setStart(Symbol.getLine(NOT.getStart()), (short) Symbol.getColumn(NOT.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_e.getEnd()), (short) Symbol.getColumn(_symbol_e.getEnd()));
        return new Symbol(_node_);
			}
			case 19: // primary = LPAREN.LPAREN expression.e RPAREN.RPAREN
			{
					final Symbol LPAREN = _symbols[offset + 1];
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol RPAREN = _symbols[offset + 3];
					 ASTNode _node_ = e;
        _node_.setStart(Symbol.getLine(LPAREN.getStart()), (short) Symbol.getColumn(LPAREN.getStart()));
        _node_.setEnd(Symbol.getLine(RPAREN.getEnd()), (short) Symbol.getColumn(RPAREN.getEnd()));
        return new Symbol(_node_);
			}
			case 20: // factor = primary.p
			{
					final Symbol _symbol_p = _symbols[offset + 1];
					final Expr p = (Expr) _symbol_p.value;
					 ASTNode _node_ = p;
        _node_.setStart(Symbol.getLine(_symbol_p.getStart()), (short) Symbol.getColumn(_symbol_p.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_p.getEnd()), (short) Symbol.getColumn(_symbol_p.getEnd()));
        return new Symbol(_node_);
			}
			case 21: // factor = factor.l OPMUL.OPMUL primary.r
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final Expr l = (Expr) _symbol_l.value;
					final Symbol OPMUL = _symbols[offset + 2];
					final Symbol _symbol_r = _symbols[offset + 3];
					final Expr r = (Expr) _symbol_r.value;
					 ASTNode _node_ = new ABinaryExpr(l, new Op_a(((String)OPMUL.value)), r);
        _node_.setStart(Symbol.getLine(_symbol_l.getStart()), (short) Symbol.getColumn(_symbol_l.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_r.getEnd()), (short) Symbol.getColumn(_symbol_r.getEnd()));
        return new Symbol(_node_);
			}
			case 22: // aexpression = factor.f
			{
					final Symbol _symbol_f = _symbols[offset + 1];
					final Expr f = (Expr) _symbol_f.value;
					 ASTNode _node_ = f;
        _node_.setStart(Symbol.getLine(_symbol_f.getStart()), (short) Symbol.getColumn(_symbol_f.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_f.getEnd()), (short) Symbol.getColumn(_symbol_f.getEnd()));
        return new Symbol(_node_);
			}
			case 23: // aexpression = aexpression.l OPPLUS.OPPLUS factor.r
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final Expr l = (Expr) _symbol_l.value;
					final Symbol OPPLUS = _symbols[offset + 2];
					final Symbol _symbol_r = _symbols[offset + 3];
					final Expr r = (Expr) _symbol_r.value;
					 ASTNode _node_ = new ABinaryExpr(l, new Op_a(((String)OPPLUS.value)), r);
        _node_.setStart(Symbol.getLine(_symbol_l.getStart()), (short) Symbol.getColumn(_symbol_l.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_r.getEnd()), (short) Symbol.getColumn(_symbol_r.getEnd()));
        return new Symbol(_node_);
			}
			case 24: // aexpression = aexpression.l OPMINUS.OPMINUS factor.r
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final Expr l = (Expr) _symbol_l.value;
					final Symbol OPMINUS = _symbols[offset + 2];
					final Symbol _symbol_r = _symbols[offset + 3];
					final Expr r = (Expr) _symbol_r.value;
					 ASTNode _node_ = new ABinaryExpr(l, new Op_a(((String)OPMINUS.value)), r);
        _node_.setStart(Symbol.getLine(_symbol_l.getStart()), (short) Symbol.getColumn(_symbol_l.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_r.getEnd()), (short) Symbol.getColumn(_symbol_r.getEnd()));
        return new Symbol(_node_);
			}
			case 26: // relexp = aexpression.l OPRELATIONAL.OPRELATIONAL aexpression.r
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final Expr l = (Expr) _symbol_l.value;
					final Symbol OPRELATIONAL = _symbols[offset + 2];
					final Symbol _symbol_r = _symbols[offset + 3];
					final Expr r = (Expr) _symbol_r.value;
					 ASTNode _node_ = new RelExpr(l, new Op_r(((String)OPRELATIONAL.value)), r);
        _node_.setStart(Symbol.getLine(_symbol_l.getStart()), (short) Symbol.getColumn(_symbol_l.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_r.getEnd()), (short) Symbol.getColumn(_symbol_r.getEnd()));
        return new Symbol(_node_);
			}
			case 27: // conj = relexp.re
			{
					final Symbol _symbol_re = _symbols[offset + 1];
					final Expr re = (Expr) _symbol_re.value;
					 ASTNode _node_ = re;
        _node_.setStart(Symbol.getLine(_symbol_re.getStart()), (short) Symbol.getColumn(_symbol_re.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_re.getEnd()), (short) Symbol.getColumn(_symbol_re.getEnd()));
        return new Symbol(_node_);
			}
			case 28: // conj = conj.l AND.AND relexp.r
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final Expr l = (Expr) _symbol_l.value;
					final Symbol AND = _symbols[offset + 2];
					final Symbol _symbol_r = _symbols[offset + 3];
					final Expr r = (Expr) _symbol_r.value;
					 ASTNode _node_ = new LogicExpr(l, new Op_b(((String)AND.value)), r);
        _node_.setStart(Symbol.getLine(_symbol_l.getStart()), (short) Symbol.getColumn(_symbol_l.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_r.getEnd()), (short) Symbol.getColumn(_symbol_r.getEnd()));
        return new Symbol(_node_);
			}
			case 29: // expression = conj.c
			{
					final Symbol _symbol_c = _symbols[offset + 1];
					final Expr c = (Expr) _symbol_c.value;
					 ASTNode _node_ = c;
        _node_.setStart(Symbol.getLine(_symbol_c.getStart()), (short) Symbol.getColumn(_symbol_c.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_c.getEnd()), (short) Symbol.getColumn(_symbol_c.getEnd()));
        return new Symbol(_node_);
			}
			case 30: // expression = expression.l OR.OR conj.r
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final Expr l = (Expr) _symbol_l.value;
					final Symbol OR = _symbols[offset + 2];
					final Symbol _symbol_r = _symbols[offset + 3];
					final Expr r = (Expr) _symbol_r.value;
					 ASTNode _node_ = new LogicExpr(l, new Op_b(((String)OR.value)), r);
        _node_.setStart(Symbol.getLine(_symbol_l.getStart()), (short) Symbol.getColumn(_symbol_l.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_r.getEnd()), (short) Symbol.getColumn(_symbol_r.getEnd()));
        return new Symbol(_node_);
			}
			case 31: // expression = POST.POST LSBRACE.LSBRACE READIDENTIFIER.READIDENTIFIER RSBRACE.RSBRACE
			{
					final Symbol POST = _symbols[offset + 1];
					final Symbol LSBRACE = _symbols[offset + 2];
					final Symbol READIDENTIFIER = _symbols[offset + 3];
					final Symbol RSBRACE = _symbols[offset + 4];
					 ASTNode _node_ = new PostExpr(((String)READIDENTIFIER.value));
        _node_.setStart(Symbol.getLine(POST.getStart()), (short) Symbol.getColumn(POST.getStart()));
        _node_.setEnd(Symbol.getLine(RSBRACE.getEnd()), (short) Symbol.getColumn(RSBRACE.getEnd()));
        return new Symbol(_node_);
			}
			case 32: // expression = SQL.SQL LPAREN.LPAREN IDENTIFIER.l SEP.SEP IDENTIFIER.r RPAREN.RPAREN
			{
					final Symbol SQL = _symbols[offset + 1];
					final Symbol LPAREN = _symbols[offset + 2];
					final Symbol l = _symbols[offset + 3];
					final Symbol SEP = _symbols[offset + 4];
					final Symbol r = _symbols[offset + 5];
					final Symbol RPAREN = _symbols[offset + 6];
					 ASTNode _node_ = new SqlExpr(new VarRefExpr(((String)l.value)),new VarRefExpr(((String)r.value)));
        _node_.setStart(Symbol.getLine(SQL.getStart()), (short) Symbol.getColumn(SQL.getStart()));
        _node_.setEnd(Symbol.getLine(RPAREN.getEnd()), (short) Symbol.getColumn(RPAREN.getEnd()));
        return new Symbol(_node_);
			}
			case 33: // expression = SQLNUMROWS.SQLNUMROWS LPAREN.LPAREN IDENTIFIER.IDENTIFIER RPAREN.RPAREN
			{
					final Symbol SQLNUMROWS = _symbols[offset + 1];
					final Symbol LPAREN = _symbols[offset + 2];
					final Symbol IDENTIFIER = _symbols[offset + 3];
					final Symbol RPAREN = _symbols[offset + 4];
					 ASTNode _node_ = new SqlNumRowsExpr(new VarRefExpr(((String)IDENTIFIER.value)));
        _node_.setStart(Symbol.getLine(SQLNUMROWS.getStart()), (short) Symbol.getColumn(SQLNUMROWS.getStart()));
        _node_.setEnd(Symbol.getLine(RPAREN.getEnd()), (short) Symbol.getColumn(RPAREN.getEnd()));
        return new Symbol(_node_);
			}
			case 34: // expression = strfactor.s
			{
					final Symbol _symbol_s = _symbols[offset + 1];
					final Expr s = (Expr) _symbol_s.value;
					 ASTNode _node_ = s;
        _node_.setStart(Symbol.getLine(_symbol_s.getStart()), (short) Symbol.getColumn(_symbol_s.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_s.getEnd()), (short) Symbol.getColumn(_symbol_s.getEnd()));
        return new Symbol(_node_);
			}
			case 35: // expression = strfactor2.s
			{
					final Symbol _symbol_s = _symbols[offset + 1];
					final Expr s = (Expr) _symbol_s.value;
					 ASTNode _node_ = s;
        _node_.setStart(Symbol.getLine(_symbol_s.getStart()), (short) Symbol.getColumn(_symbol_s.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_s.getEnd()), (short) Symbol.getColumn(_symbol_s.getEnd()));
        return new Symbol(_node_);
			}
			case 25: // relexp = aexpression.aexpression
			{
				return _symbols[offset + 1];
			}
			default:
				throw new IllegalArgumentException("unknown production #" + rule_num);
		}
	}
}