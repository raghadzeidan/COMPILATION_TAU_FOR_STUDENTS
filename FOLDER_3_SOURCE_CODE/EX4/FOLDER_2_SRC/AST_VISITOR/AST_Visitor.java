/***********/
/* PACKAGE */
/***********/
package AST_VISITOR;

/*******************/
/* PROJECT IMPORTS */
/*******************/
import AST.*;

/***************/
/* AST Visitor */
/***************/
public abstract class AST_Visitor
{
	public void Visit(AST_Node       AST){}
	public void Visit(AST_DEC_LIST   AST){}
	public void Visit(AST_DEC_VAR    AST){}
	public void Visit(AST_DEC_FUNC   AST){}
	public void Visit(AST_DEC_CLASS  AST){}
}
