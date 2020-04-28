package com.bbva.qtdi;

import com.bbva.qtdi.dto.employees.DTOIntCategory;
import com.bbva.qtdi.dto.employees.DTOIntExternalReference;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDITC9901COTransaction extends AbstractTransaction {

	public AbstractQTDITC9901COTransaction(){
	}
	/**
	 * Return value for input parameter description
	 */
	protected String getDescription()
	{
		return (String)getParameter("description");
	}
	/**
	 * Return value for input parameter required
	 */
	protected Boolean getRequired()
	{
		return (Boolean)getParameter("required");
	}
	/**
	 * Return value for input parameter responsible
	 */
	protected String getResponsible()
	{
		return (String)getParameter("responsible");
	}
	
	

	/**
	 * Return value for input parameter externalReference
	 */
	protected DTOIntExternalReference getExternalreference(){
		return (DTOIntExternalReference)getParameter("externalReference");
	}
	
	/**
	 * Return value for input parameter category
	 */
	protected DTOIntCategory getCategory(){
		return (DTOIntCategory)getParameter("category");
	}
	
	
	

}
