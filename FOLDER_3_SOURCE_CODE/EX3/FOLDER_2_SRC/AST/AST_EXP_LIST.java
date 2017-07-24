package AST;

public class AST_EXP_LIST extends AST_Node
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public AST_EXP head;
	public AST_EXP_LIST tail;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_EXP_LIST(AST_EXP head,AST_EXP_LIST tail)
	{
		this.head = head;
		this.tail = tail;
	}

	/********************/
	/* PRINTING VISITOR */
	/********************/
	public void Accept_AST_Printing_Visitor(AST_Printing_Visitor v, FilePrinter fl, int serial_number)
	{
		/*******************************/
		/* [1] Print The AST node type */
		/*******************************/
		fl.print("v");
		fl.print(serial_numer);
		fl.print("[");
		fl.print("label = ");
		fl.print("\"");
		fl.print("EXP\nLIST");
		fl.print("\"");
		fl.print("]");
		fl.print(";\n");

		/***********************/
		/* [2] Print Head EXP */
		/***********************/
		v.AST_Printing_Visit(head);

		/***********************/
		/* [3] Print Tail EXP */
		/***********************/
		v.AST_Printing_Visit(tail);
	}
}
