package com.bbva.qtdi;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDITC9101COTransaction extends AbstractTransaction {

	public AbstractQTDITC9101COTransaction(){
	}
	/**
	 * Return value for input parameter id
	 */
	protected Long getId()
	{
		return (Long)getParameter("id");
	}
	/**
	 * Return value for input parameter description
	 */
	protected String getDescription()
	{
		return (String)getParameter("description");
	}
	/**
	 * Return value for input parameter text
	 */
	protected String getText()
	{
		return (String)getParameter("text");
	}
	/**
	 * Return value for input parameter enabled
	 */
	protected Boolean getEnabled()
	{
		return (Boolean)getParameter("enabled");
	}
	
	

	
	

}
