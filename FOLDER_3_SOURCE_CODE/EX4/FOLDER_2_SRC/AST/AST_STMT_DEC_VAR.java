package AST;

public class AST_STMT_DEC_VAR extends AST_STMT
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public String type;
	public String name;
	public AST_EXP initialValue;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_STMT_DEC_VAR(String type,String name,AST_EXP initialValue)
	{
		this.type = type;
		this.name = name;
		this.initialValue = initialValue;
	}
	
}
