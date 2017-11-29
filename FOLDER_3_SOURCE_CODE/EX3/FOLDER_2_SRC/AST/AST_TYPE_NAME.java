package AST;

import TYPES.*;

public class AST_TYPE_NAME extends AST_Node
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public String type;
	public String name;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_TYPE_NAME(String type,String name)
	{
		this.type = type;
		this.name = name;
	}

	/*****************/
	/* SEMANT ME ... */
	/*****************/
	public TYPE SemantMe()
	{
		TYPE t = SYMBOL_TABLE.getInstance().find(type);
		
		if (t == null)
		{
			/**************************/
			/* ERROR: undeclared type */
			/**************************/
			assert(0); 
		}
		
		return t;
	}	
}
