package com.bbva.qtdi;

import java.util.List;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.qtdi.employees.dto.DTOIntLanguageSkill;

public abstract class AbstractQTDIT07801ESTransaction extends AbstractTransaction {

	public AbstractQTDIT07801ESTransaction(){
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
	 * Set value for output parameter data
	 */
	protected void setData(final List<DTOIntLanguageSkill> field){
		this.addParameter("data", field);
	}			
	
}
