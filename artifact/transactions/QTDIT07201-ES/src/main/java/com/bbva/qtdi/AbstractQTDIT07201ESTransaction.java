package com.bbva.qtdi;

import java.util.Date;
import java.util.List;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.qtdi.dto.applicants.DTOIntAddresses;
import com.bbva.qtdi.dto.applicants.DTOIntBirthData;
import com.bbva.qtdi.dto.applicants.DTOIntContactDetails;
import com.bbva.qtdi.dto.applicants.DTOIntGender;
import com.bbva.qtdi.dto.applicants.DTOIntIdentityDocuments;
import com.bbva.qtdi.dto.applicants.DTOIntMaritalStatus;
import com.bbva.qtdi.dto.applicants.DTOIntSocialSecurity;

public abstract class AbstractQTDIT07201ESTransaction extends AbstractTransaction {

	public AbstractQTDIT07201ESTransaction(){
	}
	/**
	 * Return value for input parameter applicant-id
	 */
	protected Long getApplicantId()
	{
		return (Long)getParameter("applicant-id");
	}
	
	

	
	/**
	 * Set value for output parameter id
	 */
	protected void setId(final String field)
	{
		this.addParameter("id", field);
	}
	/**
	 * Set value for output parameter firstName
	 */
	protected void setFirstname(final String field)
	{
		this.addParameter("firstName", field);
	}
	/**
	 * Set value for output parameter middleName
	 */
	protected void setMiddlename(final String field)
	{
		this.addParameter("middleName", field);
	}
	/**
	 * Set value for output parameter lastName
	 */
	protected void setLastname(final String field)
	{
		this.addParameter("lastName", field);
	}
	/**
	 * Set value for output parameter secondLastName
	 */
	protected void setSecondlastname(final String field)
	{
		this.addParameter("secondLastName", field);
	}
	/**
	 * Set value for output parameter nationality
	 */
	protected void setNationality(final String field)
	{
		this.addParameter("nationality", field);
	}
	/**
	 * Set value for output parameter countryEntryDate
	 */
	protected void setCountryentrydate(final Date field)
	{
		this.addParameter("countryEntryDate", field);
	}
	

	/**
	 * Set value for output parameter identityDocuments
	 */
	protected void setIdentitydocuments(final List<DTOIntIdentityDocuments> field){
		this.addParameter("identityDocuments", field);
	}			
	
	/**
	 * Set value for output parameter addresses
	 */
	protected void setAddresses(final List<DTOIntAddresses> field){
		this.addParameter("addresses", field);
	}			
	
	/**
	 * Set value for output parameter contactDetails
	 */
	protected void setContactdetails(final List<DTOIntContactDetails> field){
		this.addParameter("contactDetails", field);
	}			
	
	/**
	 * Set value for output parameter socialSecurity
	 */
	protected void setSocialsecurity(final List<DTOIntSocialSecurity> field){
		this.addParameter("socialSecurity", field);
	}			
	
	/**
	 * Set value for output parameter birthData
	 */
	protected void setBirthdata(final DTOIntBirthData field){
		this.addParameter("birthData", field);
	}			
	
	/**
	 * Set value for output parameter gender
	 */
	protected void setGender(final DTOIntGender field){
		this.addParameter("gender", field);
	}			
	
	/**
	 * Set value for output parameter maritalStatus
	 */
	protected void setMaritalstatus(final DTOIntMaritalStatus field){
		this.addParameter("maritalStatus", field);
	}			
	
}
