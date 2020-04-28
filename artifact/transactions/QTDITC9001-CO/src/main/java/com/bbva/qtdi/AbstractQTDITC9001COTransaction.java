package com.bbva.qtdi;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.qtdi.employees.dto.DTOIntAuthorizationQuestion;

public abstract class AbstractQTDITC9001COTransaction extends AbstractTransaction {

	public AbstractQTDITC9001COTransaction(){
	}
	
	

	/**
	 * Return value for input parameter Ejemplo
	 */
	protected DTOIntAuthorizationQuestion getEjemplo(){
		return (DTOIntAuthorizationQuestion)getParameter("Ejemplo");
	}
	
	
	

}
