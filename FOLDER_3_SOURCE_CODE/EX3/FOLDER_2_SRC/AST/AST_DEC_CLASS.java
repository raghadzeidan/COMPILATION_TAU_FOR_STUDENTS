package AST;

public class AST_DEC_CLASS extends AST_DEC
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public String name;
	public AST_TYPE_NAME_LIST members;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_DEC_CLASS(String name,AST_TYPE_NAME_LIST members)
	{
		this.name = name;
		this.members = members;
	}
	
}
