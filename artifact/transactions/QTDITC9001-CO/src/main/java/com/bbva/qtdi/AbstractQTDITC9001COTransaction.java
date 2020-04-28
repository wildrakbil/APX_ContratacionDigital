package com.bbva.qtdi;

import java.util.List;
import com.bbva.qtdi.dto.employees.DTOIntAuthorizationQuestion;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQTDITC9001COTransaction extends AbstractTransaction {

	public AbstractQTDITC9001COTransaction(){
	}
	/**
	 * Return value for input parameter enabled
	 */
	protected Boolean getEnabled()
	{
		return (Boolean)getParameter("enabled");
	}
	
	

	
	

	/**
	 * Set value for output parameter authorizationQuestions
	 */
	protected void setAuthorizationquestions(final List<DTOIntAuthorizationQuestion> field){
		this.addParameter("authorizationQuestions", field);
	}			
	
}
