/***********/
/* PACKAGE */
/***********/
package AST;

/************/
/* AST Node */
/************/
public abstract class AST_Node
{
	public int SerialNumber;
	
	public int PrintMe()
	{
		return 700;
	}

	/****************************/
	/* ACCEPT AST VISITOR(S):   */
	/* [1] AST PRINTING VISITOR */
	/* [2] AST SEMANTIC VISITOR */
	/* [3] AST CODE_GEN VISITOR */
	/****************************/
	public void Accept_AST_Visitor(AST_Visitor v){v.Visit(this);}
}
