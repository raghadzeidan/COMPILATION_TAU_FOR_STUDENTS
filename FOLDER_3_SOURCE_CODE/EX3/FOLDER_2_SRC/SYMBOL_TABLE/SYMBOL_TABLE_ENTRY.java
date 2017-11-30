/***********/
/* PACKAGE */
/***********/
package SYMBOL_TABLE;

/*******************/
/* PROJECT IMPORTS */
/*******************/
import TYPES.*;

/**********************/
/* SYMBOL TABLE ENTRY */
/**********************/
public class SYMBOL_TABLE_ENTRY
{
	/********/
	/* name */
	/********/
	public String name;

	/******************/
	/* TYPE value ... */
	/******************/
	public TYPE value;

	/*********************************************/
	/* prevtop and next symbol table entries ... */
	/*********************************************/
	public SYMBOL_TABLE_ENTRY prevtop;
	public SYMBOL_TABLE_ENTRY next;
	
	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public SYMBOL_TABLE_ENTRY(
		String name,
		TYPE value,
		SYMBOL_TABLE_ENTRY prevtop,
		SYMBOL_TABLE_ENTRY next)
	{
		this.name = name;
		this.value = value;
		this.prevtop = prevtop;
		this.next = next;
	}
}
