package com.bbva.qtdi;

import com.bbva.qtdi.dto.employees.DTOIntCategory;
import com.bbva.qtdi.dto.employees.DTOIntExternalReference;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDITC0101COTransaction extends AbstractTransaction {

	public AbstractQTDITC0101COTransaction(){
	}
	/**
	 * Return value for input parameter supportDocumentTypeId
	 */
	protected Long getSupportdocumenttypeid()
	{
		return (Long)getParameter("supportDocumentTypeId");
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
	 * Set value for output parameter required
	 */
	protected void setRequired(final Boolean field)
	{
		this.addParameter("required", field);
	}
	/**
	 * Set value for output parameter responsible
	 */
	protected void setResponsible(final String field)
	{
		this.addParameter("responsible", field);
	}
	

	/**
	 * Set value for output parameter externalReference
	 */
	protected void setExternalreference(final DTOIntExternalReference field){
		this.addParameter("externalReference", field);
	}			
	
	/**
	 * Set value for output parameter category
	 */
	protected void setCategory(final DTOIntCategory field){
		this.addParameter("category", field);
	}			
	
}
