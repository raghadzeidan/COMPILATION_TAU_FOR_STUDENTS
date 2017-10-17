package AST;

public class AST_EXP_VAR_FIELD extends AST_EXP_VAR
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public AST_EXP_VAR var;
	public String fieldName;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_EXP_VAR_FIELD(AST_EXP_VAR var,String fieldName)
	{
		this.var = var;
		this.fieldName = fieldName;
	}
}
