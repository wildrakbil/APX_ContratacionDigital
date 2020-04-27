package com.bbva.qtdi;

import java.util.List;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.qtdi.employees.dto.DTOIntAuthorizationQuestion;

public abstract class AbstractQTDIT09001ESTransaction extends AbstractTransaction {

	public AbstractQTDIT09001ESTransaction(){
	}
	/**
	 * Return value for input parameter enabled
	 */
	protected Boolean getEnabled()
	{
		return (Boolean)getParameter("enabled");
	}
	
	

	
	

	/**
	 * Set value for output parameter data
	 */
	protected void setData(final List<DTOIntAuthorizationQuestion> field){
		this.addParameter("data", field);
	}			
	
}
