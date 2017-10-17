/***********/
/* PACKAGE */
/***********/
package AST;

public class AST_EXP_VAR_SIMPLE extends AST_EXP_VAR
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public String name;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_EXP_VAR_SIMPLE(String name)
	{
		this.name = name;
	}
}
