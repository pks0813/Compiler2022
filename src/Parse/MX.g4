grammar MX;

//标准运算
Plus:'+';
Minus:'-';
Multiply:'*';
Devide:'\\';
Mod:'%';
//关系运算
Greater:'>';
GreaterEqual:'>=';
Less:'<';
LessEqual:'<=';
NotEqual:'!=';
Equal:'==';
//逻辑运算
AndAnd:'&&';
OrOr:'||';
Not:'!';
//位运算
RightShift:'>>';
LeftShift:'<<';
And:'&';
Or:'|';
Xor:'^';
Negate:'~';
//赋值运算
Assign:'=';
//自增运算
PlusPlus:'++';
MinusMinus:'--';
//分量运算
Point:'.';
//下标运算
LeftSquareBracket:'[';
RightSquareBracket:']';
//优先级运算
LeftBracket:'(';
RightBracket:')';
//分隔号
Semicolon:';';
Comma:',';
LeftBigBracket:'{';
RightBigBracket:'}';
//特殊符号
//Space:' ';
//Newline:'\\n';//????没看懂skip是啥
Tabs:'\\t';
Annotate:'//';
StringEdge:'"';

//关键词
Int : 'int';
Bool: 'bool';
String: 'string';
Null: 'null';
Void: 'void';
True: 'true';
False:'false';
If :'if';
Else:'else';
For:'for';
While:'while';
Break:'break';
Continue:'continue';
Return:'return';
New:'new';
Class:'class';
This:'this';

WS: [ \t]+ -> skip;
NEWLINE: ('\r' '\n'? | '\n') -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;




program:(functionDef|classDef|varDef)* EOF;
//mainFn:Int 'main' '(' ')' suite EOF;
suite:'{' statement* '}';
statement
    :suite
    |varDef
    |'if' '(' expression ')' trueStmt=statement
        (Else falseStmt=statement)?
    |While '(' expression ')' statement
    |For '(' init=expression ';' check=expression ';' step=expression ')' statement
    |Break ';'
    |Continue ';'
    |Return expression? ';'
    |expression ';'
    |';'
    ;
classDef:Class Identifier '{' (varDef|functionDef|constructDef)* '}' ';';
functionDef
:(type|Void) Identifier '(' functionParameterList? ')' suite;
constructDef:Identifier '('  ')' suite;
varDef:type onevarDef (',' onevarDef)* ';';
onevarDef:Identifier ('=' expression)?;
lambda:'[&]'('(' functionParameterList? ')')? '->' suite '('functionInsList?')' ;
expression
    :primary
    |lambda
    |<assoc=right> op=('++'|'--') expression
    |expression op=('++'|'--')
    |expression '.' Identifier
    |expression '(' functionInsList? ')'
    |expression '[' expression ']'
    |expression op=('*'|'/'|'%') expression
    |expression op=('-'|'+') expression
    |expression op=('=='|'!='|'<'|'<='|'>'|'>=') expression
    |expression op=('&&'|'||') expression
    |expression op=('&'|'|'|'^') expression
    |<assoc=right> expression '=' expression
    |<assoc=right> op='-' expression
    |<assoc=right> op='~' expression
    |<assoc=right> op='!' expression
    |<assoc=right> New canCreate
    |DecimalInteger
    |Identifier
    ;
functionInsList:expression (',' expression)*;
functionParameterList:type Identifier (',' type Identifier)*;
canCreate
:easytype ('['expression']')+ ('['']')*
|easytype
|easytype '('')'
;
type
    :easytype ('['']')+
    |easytype;
easytype: Int | String|Bool|Identifier;

primary
:'(' expression ')'
|This
|Identifier
|literal
;

literal:True|False|DecimalInteger|str|Null;
str:'"' (ESC|.)*? '"';
ESC:'\\''\n''\t';
Identifier:[a-zA-Z] [a-zA-Z0-9_]*;
DecimalInteger
:Minus? [1-9] [0-9]*
|'0'
;
