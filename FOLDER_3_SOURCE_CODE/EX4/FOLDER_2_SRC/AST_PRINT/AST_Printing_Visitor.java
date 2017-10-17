/***********/
/* PACKAGE */
/***********/
package AST_PRINT;

/*******************/
/* GENERAL IMPORTS */
/*******************/
import java.io.*;

/*******************/
/* PROJECT IMPORTS */
/*******************/
import AST.*;
import AST_VISITOR.*;

/************************/
/* AST PRINTING VISITOR */
/************************/
public class AST_Printing_Visitor extends AST_Visitor
{
	/****************/
	/* DATE MEMBERS */
	/****************/
	public static PrintWriter fl;
	public static int serial_number = 0;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_Printing_Visitor(String graphviz_dot_filename)
	{
		try
		{
			fl = new PrintWriter(graphviz_dot_filename);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/***************************************/
	/* AST_Printing_Visit ... AST_DEC_LIST */
	/***************************************/
	public void Visit(AST_DEC_LIST AST)
	{
		/****************************************/
		/* [1] Print The AST node serial number */
		/****************************************/
		fl.print(String.format("v%d",serial_number));

		/*******************************/
		/* [2] Print The AST node name */
		/*******************************/
		fl.print(" [label = \"DEC\nLIST\"];\n");

		/************************************************/
		/* [3] Print (this,left) and (this,right) edges */
		/************************************************/
		fl.print(String.format("v%d -> v%d",serial_number,serial_number+1));
		fl.print(String.format("v%d -> v%d",serial_number,serial_number+2));

		/***************************/
		/* [4] Print Head and Tail */
		/***************************/
		serial_number++; Visit(AST.head);
		serial_number++; Visit(AST.tail);
	}

	/****************************************/
	/* AST_Printing_Visit ... AST_STMT_LIST */
	/****************************************/
	public void Visit(AST_STMT_LIST AST)
	{
		/****************************************/
		/* [1] Print The AST node serial number */
		/****************************************/
		fl.print(String.format("v%d",serial_number));

		/*******************************/
		/* [2] Print The AST node name */
		/*******************************/
		fl.print(" [label = \"STMT\nLIST\"];\n");

		/************************************************/
		/* [3] Print (this,left) and (this,right) edges */
		/************************************************/
		fl.print(String.format("v%d -> v%d",serial_number,serial_number+1));
		fl.print(String.format("v%d -> v%d",serial_number,serial_number+2));

		/***************************/
		/* [4] Print Head and Tail */
		/***************************/
		serial_number++; Visit(AST.head);
		serial_number++; Visit(AST.tail);
	}

	/***************************************/
	/* AST_Printing_Visit ... AST_EXP_LIST */
	/***************************************/
	public void Visit(AST_EXP_LIST AST)
	{
		/****************************************/
		/* [1] Print The AST node serial number */
		/****************************************/
		fl.print(String.format("v%d",serial_number));

		/*******************************/
		/* [2] Print The AST node name */
		/*******************************/
		fl.print(" [label = \"EXP\nLIST\"];\n");

		/************************************************/
		/* [3] Print (this,left) and (this,right) edges */
		/************************************************/
		fl.print(String.format("v%d -> v%d",serial_number,serial_number+1));
		fl.print(String.format("v%d -> v%d",serial_number,serial_number+2));

		/***************************/
		/* [4] Print Head and Tail */
		/***************************/
		serial_number++; Visit(AST.head);
		serial_number++; Visit(AST.tail);
	}

	/**************************************/
	/* AST_Printing_Visit ... AST_DEC_VAR */
	/**************************************/
	public void Visit(AST_DEC_VAR AST)
	{
		/****************************************/
		/* [1] Print The AST node serial number */
		/****************************************/
		fl.print(String.format("v%d",serial_number));

		/*******************************/
		/* [2] Print The AST node name */
		/*******************************/
		fl.print(String.format(" [label = \"VAR\nDEC(%s)\"];\n",AST.name));

		if (AST.initialValue != null)
		{
			/**************************************************/
			/* [3] Print (this,initialValue) if it exists ... */
			/**************************************************/
			fl.print(
				String.format(
					"v%d -> v%d [label = \" initial\nValue\" ];\n",
					serial_number,
					serial_number+1));

			/**************************/
			/* [4] Print initialValue */
			/**************************/
			serial_number++; Visit(AST.initialValue);
		}
	}

	/***************************************/
	/* AST_Printing_Visit ... AST_DEC_FUNC */
	/***************************************/
	public void Visit(AST_DEC_FUNC AST)
	{
		/****************************************/
		/* [1] Print The AST node serial number */
		/****************************************/
		fl.print(String.format("v%d",serial_number));

		/*******************************/
		/* [2] Print The AST node name */
		/*******************************/
		fl.print(String.format(" [label = \"FUNC\nDEC(%s)\"];\n",AST.name));

		/*********************************/
		/* [3] Print (this,params) edges */
		/*********************************/
		fl.print(String.format("v%d -> v%d",serial_number,serial_number+1));

		/********************/
		/* [4] Print params */
		/********************/
		serial_number++; Visit(AST.params);
	}

	/****************************************/
	/* AST_Printing_Visit ... AST_DEC_CLASS */
	/****************************************/
	public void Visit(AST_DEC_CLASS AST)
	{
		/****************************************/
		/* [1] Print The AST node serial number */
		/****************************************/
		fl.print(String.format("v%d",serial_number));

		/*******************************/
		/* [2] Print The AST node name */
		/*******************************/
		fl.print(String.format(" [label = \"CLASS\nDEC(%s)\"];\n",AST.name));

		/**************************************************/
		/* [3] Print (this,initialValue) if it exists ... */
		/**************************************************/
		fl.print(
			String.format(
				"v%d -> v%d [label = \" class decs\" ];\n",
				serial_number,
				serial_number+1));

		/**************************/
		/* [4] Print initialValue */
		/**************************/
		serial_number++; Visit(AST.members);

	}

	/**************************************/
	/* AST_Printing_Visit ... AST_STMT_IF */
	/**************************************/
	public void Visit(AST_STMT_IF AST)
	{
		/****************************************/
		/* [1] Print The AST node serial number */
		/****************************************/
		fl.print(String.format("v%d",serial_number));

		/*******************************/
		/* [2] Print The AST node name */
		/*******************************/
		fl.print(" [label = \"IF (cond)\nTHEN { body }\"];\n");

		/************************************************/
		/* [3] Print (this,left) and (this,right) edges */
		/************************************************/
		fl.print(String.format("v%d -> v%d [label = \" cond\" ];\n",serial_number,serial_number+1));
		fl.print(String.format("v%d -> v%d [label = \" body\" ];\n",serial_number,serial_number+2));

		/***************************/
		/* [4] Print cond and body */
		/***************************/
		serial_number++; Visit(AST.cond);
		serial_number++; Visit(AST.body);
	}

	/*****************************************/
	/* AST_Printing_Visit ... AST_STMT_WHILE */
	/*****************************************/
	public void Visit(AST_STMT_WHILE AST)
	{
		/****************************************/
		/* [1] Print The AST node serial number */
		/****************************************/
		fl.print(String.format("v%d",serial_number));

		/*******************************/
		/* [2] Print The AST node name */
		/*******************************/
		fl.print(" [label = \"WHILE (cond)\nDO { body }\"];\n");

		/************************************************/
		/* [3] Print (this,left) and (this,right) edges */
		/************************************************/
		fl.print(String.format("v%d -> v%d [label = \" cond\" ];\n",serial_number,serial_number+1));
		fl.print(String.format("v%d -> v%d [label = \" body\" ];\n",serial_number,serial_number+2));

		/***************************/
		/* [4] Print cond and body */
		/***************************/
		serial_number++; Visit(AST.cond);
		serial_number++; Visit(AST.body);
	}

}
