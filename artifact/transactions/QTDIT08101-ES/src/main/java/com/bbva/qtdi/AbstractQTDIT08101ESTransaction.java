package com.bbva.qtdi;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDIT08101ESTransaction extends AbstractTransaction {

	public AbstractQTDIT08101ESTransaction(){
	}
	/**
	 * Return value for input parameter enabled
	 */
	protected Boolean getEnabled()
	{
		return (Boolean)getParameter("enabled");
	}
	
	

	
	/**
	 * Set value for output parameter id
	 */
	protected void setId(final Long field)
	{
		this.addParameter("id", field);
	}
	/**
	 * Set value for output parameter description
	 */
	protected void setDescription(final String field)
	{
		this.addParameter("description", field);
	}
	/**
	 * Set value for output parameter text
	 */
	protected void setText(final String field)
	{
		this.addParameter("text", field);
	}
	/**
	 * Set value for output parameter enabled
	 */
	protected void setEnabled(final Boolean field)
	{
		this.addParameter("enabled", field);
	}
	

}
