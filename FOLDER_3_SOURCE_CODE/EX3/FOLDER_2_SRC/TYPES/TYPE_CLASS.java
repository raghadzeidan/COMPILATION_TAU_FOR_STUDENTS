package TYPES;

public abstract class TYPE_CLASS extends TYPE
{
	/*********************************************************************/
	/* If this class does not extend a father class this should be null  */
	/*********************************************************************/
	public TYPE_CLASS father;

	/*******************************************************************/
	/* Keep the name for debug purposes ... it won't harm anything ... */
	/*******************************************************************/
	public String name;

	/*******************************************/
	/* Gather up all data members in one place */
	/*******************************************/
	public TYPE_CLASS_VAR_DEC_LIST data_members;

	/**************************************/
	/* Gather up all methods in one place */
	/**************************************/
	public TYPE_CLASS_FUNC_DEC_LIST methods;
}
