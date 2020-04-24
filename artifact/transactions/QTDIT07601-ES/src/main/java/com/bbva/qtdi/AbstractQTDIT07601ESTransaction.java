package com.bbva.qtdi;

import java.util.List;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.qtdi.dto.applicants.DTOIntLanguageSkill;

public abstract class AbstractQTDIT07601ESTransaction extends AbstractTransaction {

	public AbstractQTDIT07601ESTransaction(){
	}
	/**
	 * Return value for input parameter applicant-id
	 */
	protected Long getApplicantId()
	{
		return (Long)getParameter("applicant-id");
	}
	
	

	
	

	/**
	 * Set value for output parameter data
	 */
	protected void setData(final List<DTOIntLanguageSkill> field){
		this.addParameter("data", field);
	}			
	
}
