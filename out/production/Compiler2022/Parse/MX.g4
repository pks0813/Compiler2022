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
NotationLine: '//' .*? ('\n' | EOF) -> skip;


program:(programDef)* EOF;
programDef
:functionDef #programFuncDef
|classDef    #programClassDef
|varDef      #programVarDef
;
//mainFn:Int 'main' '(' ')' suite EOF;
suite:'{' statement* '}';
statement
    :suite                                                                                  #suiteStat
    |varDef                                                                                 #vardefineStat
    |'if' '(' expression ')' trueStmt=statement
        (Else falseStmt=statement)?                                                         #ifStat
    |While '(' expression ')' statement                                                     #whilestate
    |For '(' (init=expression)? ';' (check=expression)? ';' (step=expression)? ')' statement         #forStat
    |Break ';'                                                                              #breakStat
    |Continue ';'                                                                           #continueStat
    |Return expression? ';'                                                                 #returnStat
    |expression ';'                                                                         #exprssionStat
    |';'                                                                                    #emptyStat
    ;
classDef:Class Identifier '{' (classvarDef|functionDef|constructDef )* '}' ';';
//classState
//:varDef             #ClassVarDef
//|functionDef        #ClassFuncDef
//|constructDef       #ClassConstructDef
//;
functionDef:functiontype Identifier '(' functionParameterList? ')' suite;
constructDef:Identifier '('  ')' suite;
classvarDef:type Identifier (',' Identifier)* ';';
basicvarDef:Identifier ('=' expression)? ;
varDef
:type basicvarDef (',' basicvarDef )* ';'
;
//lambda:('[&]()'|'[&]('functionParameterList')'|'[&]')   '-''>' suite '('functionInsList?')' ;
expression
//    :lambda                                                 #lambdaExpr
    :primary                                                #atomExpr
    |<assoc=right> newsentence                              #newExpr
    |expression '.' Identifier                              #pointExpr
    |expression '(' functionInsList ')'                     #functionExpr
    |expression '[' expression ']'                          #subscriptExpr
    |<assoc=right> op='-' expression                        #prefixExpr
    |<assoc=right> op='~' expression                        #prefixExpr
    |<assoc=right> op='!' expression                        #prefixExpr
    |<assoc=right> op=('++'|'--') expression                #prefixExpr
    |expression op=('++'|'--')                              #backfixExpr
    |expression op=('*'|'/'|'%') expression                 #binaryOpExpr
    |expression op=('-'|'+') expression                     #binaryOpExpr
    |expression op=('&'|'|'|'^') expression                 #binaryOpExpr
    |expression op=('<<'|'>>') expression                   #binaryOpExpr
    |expression op=('=='|'!='|'<'|'<='|'>'|'>=') expression #binaryOpExpr
    |expression op=('&&'|'||') expression                   #binaryOpExpr
    |<assoc=right> expression '=' expression                #assignExpr
    ;
functionInsList:(expression (',' expression)*)?;
functionParameterList:type Identifier (',' type Identifier)*;
newsentence
//:New easytype ('['']') (('['']')|'['expression']')* #WrongCreate
//|New easytype ('['expression']')+ ('['']')+ (('['expression']')+ ('['']')+)+    #WrongCreate
//|New easytype ('['expression']')+ ('['']')+ ('['expression']')+ #WrongCreate
:New easytype ('['expression']')+ ('['']')*     #ArrayCreate
|New easytype '('')'                            #ClassCreate
|New easytype                                   #EasyCreate
;
primary
:'(' expression ')'         #Expr
|This                       #ThisExpr
|Identifier                 #ClassExpr
|literal                    #ConstExpr
;

functiontype
:type           #Basictype
|Void           #VoidType
;
type
:easytype                       #Onlytype
|type '['']'             #Arraytype
;
easytype
: Int               #Inttype
| String            #StringType
|Bool               #BoolType
|Identifier         #ClassType
;

boolConst:True|False;
literal
:boolConst          #BoolCst
|DecimalInteger     #Intcst
|Str                #Strcst
|Null               #Nullcst
;

Str:'"' (~["\n\r\\] | '\\' ["nr\\])*? '"';
//ESC:'\\'|'\n'|'\t'|;
Identifier:[a-zA-Z] [a-zA-Z0-9_]*;
DecimalInteger
:[1-9] [0-9]*
|'0'
;
