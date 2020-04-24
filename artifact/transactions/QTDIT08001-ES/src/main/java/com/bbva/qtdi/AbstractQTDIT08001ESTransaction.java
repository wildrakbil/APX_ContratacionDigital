package com.bbva.qtdi;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDIT08001ESTransaction extends AbstractTransaction {

	public AbstractQTDIT08001ESTransaction(){
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
	
	

	
	

}
