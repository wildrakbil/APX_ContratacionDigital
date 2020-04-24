package com.bbva.qtdi;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDIT07401ESTransaction extends AbstractTransaction {

	public AbstractQTDIT07401ESTransaction(){
	}
	/**
	 * Return value for input parameter applicant-id
	 */
	protected Long getApplicantId()
	{
		return (Long)getParameter("applicant-id");
	}
	
	

	
	

}
