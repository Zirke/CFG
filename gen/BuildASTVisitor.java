package astBuilder;
import abstractSyntaxTree.AbstractNode;
import abstractSyntaxTree.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class BuildASTVisitor extends AbstractParseTreeVisitor<AbstractNode> implements PyTrunVisitor<AbstractNode>{

    @Override public AbstractNode visitStart(PyTrun.StartContext ctx) {
        //return visitChildren(ctx);
        return visit(ctx.stmts);
    }

    @Override public StatementList visitStmts(PyTrun.StmtsContext ctx) {
        ArrayList<Statement> stmts = new ArrayList<>;
        List<StmtContext> bStmts = ctx.stmt();
        for (StmtContext x : bStmts){
            stmts.add(visit(bStmts));
        }
        return new StatementList(stmts);
    }

    @Override public Statement visitStmt(PyTrun.StmtContext ctx) {
        Statement stmt;
        if( ctx.class == DclContext.class){
            stmt = visitDcl(ctx);
        }else if(ctx.class == IfstmtContext.class){
            stmt = visitIfstmt(ctx);
        }else if(ctx.class == WhilestmtContext.class){
            stmt = visitWhilestmt(ctx);
        }else if(ctx.class == ReturnstmtContext.class){
            stmt = visitReturnstmt(ctx);
        }else if(ctx.class == FunctioncallContext.class){
            stmt = visitFunctioncall(ctx);
        }else if(ctx.class == RepeatuntilstmtContext.class){
            stmt = visitRepeatuntilstmt(ctx);
        }else if(ctx.class == FromstmtContext.class){
            stmt = visitFromstmt(ctx);
        }else if(ctx.class == AssignmentContext.class){
            stmt = visitAssignment(ctx);
        }else if(ctx.class == ArraddContext.class){
            stmt = visitArradd(ctx);
        }else if(ctx.class == ArrindexContext.class){
            stmt = visitArrindex(ctx);
        }else if(ctx.class == FunctiondclContext.class){
            stmt = visitFunctiondcl(ctx);
        }
        return stmt;
    }

    @Override public FunctionDeclaration visitFunctiondcl(PyTrun.FunctiondclContext ctx) {
        Identifier functionName = new Identifier( ctx.ID());
        
        //return visitChildren(ctx);
    }

    @Override public T visitDcl(PyTrun.DclContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTruedcl(PyTrun.TruedclContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitFunctioncall(PyTrun.FunctioncallContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArgs(PyTrun.ArgsContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitIfstmt(PyTrun.IfstmtContext ctx) {
        return visitChildren(ctx);
    }


    @Override public T visitWhilestmt(PyTrun.WhilestmtContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitRepeatuntilstmt(PyTrun.RepeatuntilstmtContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitFromstmt(PyTrun.FromstmtContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitReturnstmt(PyTrun.ReturnstmtContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAssignment(PyTrun.AssignmentContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitValue(PyTrun.ValueContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitExpr(PyTrun.ExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArithmexpr(PyTrun.ArithmexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitMultexpr(PyTrun.MultexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitParexpr(PyTrun.ParexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTruthexpr(PyTrun.TruthexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitLogicalexpr(PyTrun.LogicalexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitRelationalexpr(PyTrun.RelationalexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAppend(PyTrun.AppendContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArrelems(PyTrun.ArrelemsContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArrindex(PyTrun.ArrindexContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArradd(PyTrun.ArraddContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitNums(PyTrun.NumsContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitParamlist(PyTrun.ParamlistContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitStmtblock(PyTrun.StmtblockContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTruthpar(PyTrun.TruthparContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTruth(PyTrun.TruthContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitType(PyTrun.TypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTypes(PyTrun.TypesContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitStmtend(PyTrun.StmtendContext ctx) {
        return visitChildren(ctx);
    }

}
