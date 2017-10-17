package AST;

public class AST_STMT_ASSIGN extends AST_STMT
{
	public AST_EXP exp;
	public AST_EXP_VAR var;

	/*******************/
	/*  CONSTRUCTOR(S) */
	/*******************/
	public AST_STMT_ASSIGN(AST_EXP_VAR var,AST_EXP exp)
	{
		this.var = var;
		this.exp = exp;
	}
}
