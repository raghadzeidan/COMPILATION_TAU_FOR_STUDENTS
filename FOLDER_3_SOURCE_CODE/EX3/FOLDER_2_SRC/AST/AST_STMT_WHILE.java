package AST;

public class AST_STMT_WHILE extends AST_STMT
{
	public AST_EXP cond;
	public AST_STMT_LIST body;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_STMT_WHILE(AST_EXP cond,AST_STMT_LIST body)
	{
		this.cond = cond;
		this.body = body;
	}

	/********************************/
	/*  ACCEPT AST PRINTING VISITOR */
	/********************************/
	public void Accept_AST_PrintingVisitor(AST_PrintingVisitor v)
	{
		v.AST_Print_By_Visiting(this);
	}
}
