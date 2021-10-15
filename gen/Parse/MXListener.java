// Generated from D:/´úÂëÄØ/java/Compiler2022/src/Parse\MX.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MXParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MXParser.StatementContext ctx);
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
	 * Enter a parse tree produced by {@link MXParser#onevarDef}.
	 * @param ctx the parse tree
	 */
	void enterOnevarDef(MXParser.OnevarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#onevarDef}.
	 * @param ctx the parse tree
	 */
	void exitOnevarDef(MXParser.OnevarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(MXParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(MXParser.LambdaContext ctx);
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
	 * Enter a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(MXParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(MXParser.MathExprContext ctx);
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
	 * Enter a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(MXParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(MXParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryEXpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryEXpr(MXParser.BinaryEXprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryEXpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryEXpr(MXParser.BinaryEXprContext ctx);
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
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(MXParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(MXParser.BinaryExprContext ctx);
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
	 * Enter a parse tree produced by {@link MXParser#canCreate}.
	 * @param ctx the parse tree
	 */
	void enterCanCreate(MXParser.CanCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#canCreate}.
	 * @param ctx the parse tree
	 */
	void exitCanCreate(MXParser.CanCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MXParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MXParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void enterEasytype(MXParser.EasytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 */
	void exitEasytype(MXParser.EasytypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MXParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MXParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MXParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MXParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MXParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(MXParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MXParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(MXParser.StrContext ctx);
}