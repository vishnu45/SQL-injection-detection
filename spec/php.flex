package AST;

import beaver.Symbol;
import beaver.Scanner;
import AST.phpParser.Terminals;

%%
%public
%final
%class phpScanner
%extends Scanner
%unicode
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%line
%column

%{
  private Symbol sym(short id) {
    return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}


// Helper Definitions

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]
Comment = {TraditionalComment} | {EndOfLineComment} 
TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

Identifier = "$" [:letter:]([:letter:] | [:digit:])*
ReadIdentifier = [:letter:]([:letter:] | [:digit:])*
BeginIdentifier = "<?php"
EndIdentifier = "?>"
StringIdentifier = "\"" ([:letter:] | {LineTerminator} | [" "] | ["*"] | [","] | ["+"] | ["("] | [")"] | ["="] | [ \t\f] | [:digit:])* "\""
FileIdentifier = "\"" [:letter:] ([:letter:] | [:digit:])* ".php\""


%% // Rules
"while"       					{ return sym(Terminals.WHILE); }
"if"          					{ return sym(Terminals.IF); }
"else"		  					{ return sym(Terminals.ELSE); }
"true"        					{ return sym(Terminals.TRUE); }
"false"       					{ return sym(Terminals.FALSE); }
"not"                			{ return sym(Terminals.NOT); }
"="           					{ return sym(Terminals.ASSIGN); }
";"           					{ return sym(Terminals.SEMICOLON); }

{BeginIdentifier}           	{ return sym(Terminals.PHPBEGIN); }
{EndIdentifier}           		{ return sym(Terminals.PHPEND); }
{StringIdentifier}				{ return sym(Terminals.STRVAR); }
{FileIdentifier}				{ return sym(Terminals.FILEVAR); }

"echo"           				{ return sym(Terminals.ECHO); }
"$_POST"						{ return sym(Terminals.POST); }
"mysqli_query"				    { return sym(Terminals.SQL); }
"mysqli_num_rows"				{ return sym(Terminals.SQLNUMROWS); }
"require"           		    { return sym(Terminals.REQUIRE); }

// Operators
"and"                			{ return sym(Terminals.AND); }
"or"                 			{ return sym(Terminals.OR); }
("=="|"!="|"<"|"<="|">="|">")   { return sym(Terminals.OPRELATIONAL); }

// split + and - so later could handle unary minus separately...
"+"                       		{ return sym(Terminals.OPPLUS); }
"-"                       		{ return sym(Terminals.OPMINUS); }
("*"|"/")                       { return sym(Terminals.OPMUL); }
","                             { return sym(Terminals.SEP); }


// Separators
"("                             { return sym(Terminals.LPAREN); }
")"                             { return sym(Terminals.RPAREN); }
"{"                             { return sym(Terminals.LBRACE); }
"}"                             { return sym(Terminals.RBRACE); }
"[\""                           { return sym(Terminals.LSBRACE); }
"\"]"                           { return sym(Terminals.RSBRACE); }

[:digit:]+    					{ return sym(Terminals.NUMBER); }
{Identifier}  					{ return sym(Terminals.IDENTIFIER); }
{ReadIdentifier}  				{ return sym(Terminals.READIDENTIFIER); }
  
{Comment}     					{ /* discard token */ }
{WhiteSpace}  					{ /* discard token */ }

<<EOF>>       					{ return sym(Terminals.EOF); }
.          						{ throw new RuntimeException("Illegal character \""+yytext()+ "\" at line "+yyline+", column "+yycolumn); }
