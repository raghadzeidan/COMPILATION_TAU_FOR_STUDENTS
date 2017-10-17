package AST;

public class AST_DEC_FUNC extends AST_DEC
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public String returnType;
	public String name;
	public AST_TYPE_NAME_LIST params;
	public AST_STMT_LIST body;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_DEC_FUNC(
		String returnType,
		String name,
		AST_TYPE_NAME_LIST params,
		AST_STMT_LIST body)
	{
		this.returnType = returnType;
		this.name = name;
		this.params = params;
		this.body = body;
	}
	
}
