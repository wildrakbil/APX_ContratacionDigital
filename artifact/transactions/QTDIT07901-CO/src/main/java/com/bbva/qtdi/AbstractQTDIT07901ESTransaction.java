package com.bbva.qtdi;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.qtdi.employees.dto.DTOIntLanguage;
import com.bbva.qtdi.employees.dto.DTOIntLanguageSkillLevel;

public abstract class AbstractQTDIT07901ESTransaction extends AbstractTransaction {

	public AbstractQTDIT07901ESTransaction(){
	}
	/**
	 * Return value for input parameter applicant-id
	 */
	protected Long getApplicantId()
	{
		return (Long)getParameter("applicant-id");
	}
	/**
	 * Return value for input parameter language-skill-id
	 */
	protected Long getLanguageSkillId()
	{
		return (Long)getParameter("language-skill-id");
	}
	
	

	
	/**
	 * Set value for output parameter reading
	 */
	protected void setReading(final Boolean field)
	{
		this.addParameter("reading", field);
	}
	/**
	 * Set value for output parameter writing
	 */
	protected void setWriting(final Boolean field)
	{
		this.addParameter("writing", field);
	}
	/**
	 * Set value for output parameter listening
	 */
	protected void setListening(final Boolean field)
	{
		this.addParameter("listening", field);
	}
	/**
	 * Set value for output parameter speaking
	 */
	protected void setSpeaking(final Boolean field)
	{
		this.addParameter("speaking", field);
	}
	

	/**
	 * Set value for output parameter language
	 */
	protected void setLanguage(final DTOIntLanguage field){
		this.addParameter("language", field);
	}			
	
	/**
	 * Set value for output parameter level
	 */
	protected void setLevel(final DTOIntLanguageSkillLevel field){
		this.addParameter("level", field);
	}			
	
}
