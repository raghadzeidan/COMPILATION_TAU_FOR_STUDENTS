package AST;

public class AST_DEC_CLASS extends AST_DEC
{
	/********/
	/* NAME */
	/********/
	public String name;

	/****************/
	/* DATA MEMBERS */
	/****************/
	public AST_TYPE_NAME_LIST data_members;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_DEC_CLASS(String name,AST_TYPE_NAME_LIST data_members)
	{
		this.name = name;
		this.data_members = data_members;
	}

	/*********************************************************/
	/* The printing message for a class declaration AST node */
	/*********************************************************/
	public void PrintMe()
	{
		/**********************************************/
		/* AST NODE TYPE = AST NODE CLASS DECLARATION */
		/**********************************************/
		System.out.print("AST NODE CLASS DECLARATION\n");

		/*************************************/
		/* RECURSIVELY PRINT HEAD + TAIL ... */
		/*************************************/
		System.out.format("CLASS NAME = %s\n",name);
		if (data_members != null) data_members.PrintMe();
	}
	
}
