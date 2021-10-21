// Generated from D:/´úÂëÄØ/java/Compiler2022/src/Parse\MX.g4 by ANTLR 4.9.1
package Parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MXParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MXParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programFuncDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramFuncDef(MXParser.ProgramFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programClassDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramClassDef(MXParser.ProgramClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programVarDef}
	 * labeled alternative in {@link MXParser#programDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramVarDef(MXParser.ProgramVarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(MXParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suiteStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuiteStat(MXParser.SuiteStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardefineStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardefineStat(MXParser.VardefineStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(MXParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whilestate}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestate(MXParser.WhilestateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(MXParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStat(MXParser.BreakStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStat(MXParser.ContinueStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(MXParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprssionStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprssionStat(MXParser.ExprssionStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStat}
	 * labeled alternative in {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStat(MXParser.EmptyStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(MXParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(MXParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#constructDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructDef(MXParser.ConstructDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manyDef}
	 * labeled alternative in {@link MXParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyDef(MXParser.ManyDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignDef}
	 * labeled alternative in {@link MXParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDef(MXParser.AssignDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(MXParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpr(MXParser.PrefixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscriptExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpr(MXParser.SubscriptExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(MXParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOpExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOpExpr(MXParser.BinaryOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backfixExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackfixExpr(MXParser.BackfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(MXParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointExpr(MXParser.PointExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(MXParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#functionInsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInsList(MXParser.FunctionInsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#functionParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterList(MXParser.FunctionParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WrongCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongCreate(MXParser.WrongCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreate(MXParser.ArrayCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreate(MXParser.ClassCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EasyCreate}
	 * labeled alternative in {@link MXParser#newsentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEasyCreate(MXParser.EasyCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MXParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(MXParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpr(MXParser.ClassExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link MXParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(MXParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Basictype}
	 * labeled alternative in {@link MXParser#functiontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasictype(MXParser.BasictypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link MXParser#functiontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(MXParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arraytype}
	 * labeled alternative in {@link MXParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraytype(MXParser.ArraytypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Onlytype}
	 * labeled alternative in {@link MXParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlytype(MXParser.OnlytypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Inttype}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInttype(MXParser.InttypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(MXParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(MXParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassType}
	 * labeled alternative in {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(MXParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#boolConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(MXParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolCst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCst(MXParser.BoolCstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Intcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntcst(MXParser.IntcstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Strcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrcst(MXParser.StrcstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nullcst}
	 * labeled alternative in {@link MXParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullcst(MXParser.NullcstContext ctx);
}