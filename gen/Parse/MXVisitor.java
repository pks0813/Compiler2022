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
	 * Visit a parse tree produced by {@link MXParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(MXParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MXParser.StatementContext ctx);
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
	 * Visit a parse tree produced by {@link MXParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(MXParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#onevarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnevarDef(MXParser.OnevarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(MXParser.LambdaContext ctx);
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
	 * Visit a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(MXParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscriptExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpr(MXParser.SubscriptExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(MXParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryEXpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryEXpr(MXParser.BinaryEXprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(MXParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(MXParser.BinaryExprContext ctx);
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
	 * Visit a parse tree produced by {@link MXParser#canCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanCreate(MXParser.CanCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MXParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#easytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEasytype(MXParser.EasytypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MXParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MXParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MXParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(MXParser.StrContext ctx);
}