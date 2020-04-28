package com.bbva.qtdi;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDITC9201COTransaction extends AbstractTransaction {

	public AbstractQTDITC9201COTransaction(){
	}
	/**
	 * Return value for input parameter authorizationQuestionId
	 */
	protected Long getAuthorizationquestionid()
	{
		return (Long)getParameter("authorizationQuestionId");
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
