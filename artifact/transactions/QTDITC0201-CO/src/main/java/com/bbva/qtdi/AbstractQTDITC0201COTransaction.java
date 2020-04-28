package com.bbva.qtdi;

import com.bbva.qtdi.dto.employees.DTOIntCategory;
import com.bbva.qtdi.dto.employees.DTOIntExternalReference;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDITC0201COTransaction extends AbstractTransaction {

	public AbstractQTDITC0201COTransaction(){
	}
	/**
	 * Return value for input parameter supportDocumentTypeId
	 */
	protected Long getSupportdocumenttypeid()
	{
		return (Long)getParameter("supportDocumentTypeId");
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
