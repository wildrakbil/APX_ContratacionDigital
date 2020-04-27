package com.bbva.qtdi;

import java.util.List;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.qtdi.employees.dto.DTOIntIdentityDocuments;

public abstract class AbstractQTDIT07501ESTransaction extends AbstractTransaction {

	public AbstractQTDIT07501ESTransaction(){
	}
	/**
	 * Return value for input parameter pageSize
	 */
	protected Long getPagesize()
	{
		return (Long)getParameter("pageSize");
	}
	/**
	 * Return value for input parameter paginationKey
	 */
	protected String getPaginationkey()
	{
		return (String)getParameter("paginationKey");
	}
	
	

	
	/**
	 * Set value for output parameter firstName
	 */
	protected void setFirstname(final String field)
	{
		this.addParameter("firstName", field);
	}
	/**
	 * Set value for output parameter lastName
	 */
	protected void setLastname(final String field)
	{
		this.addParameter("lastName", field);
	}
	

	/**
	 * Set value for output parameter identityDocuments
	 */
	protected void setIdentitydocuments(final List<DTOIntIdentityDocuments> field){
		this.addParameter("identityDocuments", field);
	}			
	
}
