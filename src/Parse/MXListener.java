
package Parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MXParser}.
 */
public interface MXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MXParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MXParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MXParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code programFuncDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 */
	void enterProgramFuncDef(MXParser.ProgramFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programFuncDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 */
	void exitProgramFuncDef(MXParser.ProgramFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code programClassDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 */
	void enterProgramClassDef(MXParser.ProgramClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programClassDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 */
	void exitProgramClassDef(MXParser.ProgramClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code programVarDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 */
	void enterProgramVarDef(MXParser.ProgramVarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programVarDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 */
	void exitProgramVarDef(MXParser.ProgramVarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(MXParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(MXParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suiteStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSuiteStat(MXParser.SuiteStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suiteStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSuiteStat(MXParser.SuiteStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardefineStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVardefineStat(MXParser.VardefineStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardefineStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVardefineStat(MXParser.VardefineStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(MXParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(MXParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestate}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestate(MXParser.WhilestateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestate}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestate(MXParser.WhilestateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStat(MXParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStat(MXParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStat(MXParser.BreakStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStat(MXParser.BreakStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStat(MXParser.ContinueStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStat(MXParser.ContinueStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(MXParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(MXParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprssionStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprssionStat(MXParser.ExprssionStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprssionStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprssionStat(MXParser.ExprssionStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStat(MXParser.EmptyStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStat(MXParser.EmptyStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MXParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MXParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(MXParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(MXParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#constructDef}.
	 * @param ctx the parse tree
	 */
	void enterConstructDef(MXParser.ConstructDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#constructDef}.
	 * @param ctx the parse tree
	 */
	void exitConstructDef(MXParser.ConstructDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#classvarDef}.
	 * @param ctx the parse tree
	 */
	void enterClassvarDef(MXParser.ClassvarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#classvarDef}.
	 * @param ctx the parse tree
	 */
	void exitClassvarDef(MXParser.ClassvarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#basicvarDef}.
	 * @param ctx the parse tree
	 */
	void enterBasicvarDef(MXParser.BasicvarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#basicvarDef}.
	 * @param ctx the parse tree
	 */
	void exitBasicvarDef(MXParser.BasicvarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(MXParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(MXParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(MXParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(MXParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(MXParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(MXParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscriptExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpr(MXParser.SubscriptExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscriptExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpr(MXParser.SubscriptExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MXParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MXParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOpExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOpExpr(MXParser.BinaryOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOpExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOpExpr(MXParser.BinaryOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backfixExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBackfixExpr(MXParser.BackfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backfixExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBackfixExpr(MXParser.BackfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MXParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MXParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPointExpr(MXParser.PointExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPointExpr(MXParser.PointExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(MXParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(MXParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#functionInsList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInsList(MXParser.FunctionInsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#functionInsList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInsList(MXParser.FunctionInsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterList(MXParser.FunctionParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterList(MXParser.FunctionParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WrongCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 */
	void enterWrongCreate(MXParser.WrongCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WrongCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 */
	void exitWrongCreate(MXParser.WrongCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreate(MXParser.ArrayCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreate(MXParser.ArrayCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 */
	void enterClassCreate(MXParser.ClassCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 */
	void exitClassCreate(MXParser.ClassCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EasyCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 */
	void enterEasyCreate(MXParser.EasyCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EasyCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 */
	void exitEasyCreate(MXParser.EasyCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MXParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MXParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(MXParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(MXParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterClassExpr(MXParser.ClassExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitClassExpr(MXParser.ClassExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(MXParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(MXParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Basictype}
	 * labeled alternative in {@link MXParser#functiontype}.
	 * @param ctx the parse tree
	 */
	void enterBasictype(MXParser.BasictypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Basictype}
	 * labeled alternative in {@link MXParser#functiontype}.
	 * @param ctx the parse tree
	 */
	void exitBasictype(MXParser.BasictypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link MXParser#functiontype}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(MXParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link MXParser#functiontype}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(MXParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arraytype}
	 * labeled alternative in {@link MXParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArraytype(MXParser.ArraytypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arraytype}
	 * labeled alternative in {@link MXParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArraytype(MXParser.ArraytypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Onlytype}
	 * labeled alternative in {@link MXParser#type}.
	 * @param ctx the parse tree
	 */
	void enterOnlytype(MXParser.OnlytypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Onlytype}
	 * labeled alternative in {@link MXParser#type}.
	 * @param ctx the parse tree
	 */
	void exitOnlytype(MXParser.OnlytypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inttype}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void enterInttype(MXParser.InttypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inttype}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void exitInttype(MXParser.InttypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void enterStringType(MXParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void exitStringType(MXParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(MXParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(MXParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void enterClassType(MXParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void exitClassType(MXParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(MXParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(MXParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolCst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolCst(MXParser.BoolCstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolCst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolCst(MXParser.BoolCstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntcst(MXParser.IntcstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Intcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntcst(MXParser.IntcstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Strcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStrcst(MXParser.StrcstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Strcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStrcst(MXParser.StrcstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nullcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullcst(MXParser.NullcstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nullcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullcst(MXParser.NullcstContext ctx);
}