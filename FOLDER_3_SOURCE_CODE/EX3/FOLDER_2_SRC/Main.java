/*******************/
/* GENERAL IMPORTS */
/*******************/
import java.io.*;
import java.io.PrintWriter;
import java_cup.runtime.Symbol;

/*******************/
/* PROJECT IMPORTS */
/*******************/
import AST.*;
import AST_PRINT.*;

public class Main
{
	static public void main(String argv[])
	{
		Lexer l;
		Parser p;
		Symbol s;
		AST_STMT_LIST AST;
		FileReader file_reader;
		PrintWriter file_writer;
		String inputFilename = argv[0];
		String outputFilename = argv[1];
		
		try
		{
			/********************************/
			/* [1] Initialize a file reader */
			/********************************/
			file_reader = new FileReader(inputFilename);

			/********************************/
			/* [2] Initialize a file writer */
			/********************************/
			file_writer = new PrintWriter(outputFilename);
			
			/******************************/
			/* [3] Initialize a new lexer */
			/******************************/
			l = new Lexer(file_reader);
			
			/*******************************/
			/* [4] Initialize a new parser */
			/*******************************/
			p = new Parser(l);

			/***********************************/
			/* [5] 3 ... 2 ... 1 ... Parse !!! */
			/***********************************/
			AST = (AST_STMT_LIST) p.parse().value;
			
			/********************************************************/
			/* [6] Print AST recursively with AST Printing Visitors */
			/********************************************************/
			AST.Accept_AST_Printing_Visitor(new AST_Printing_Visitor)
			
			while (AST != null)
			{
				System.out.print(AST.PrintMe());
				System.out.print("\n");
				AST = AST.tail;
			}
			
			/**************************/
			/* [10] Close output file */
			/**************************/
			file_writer.close();
    	}
			     
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}


