/**
 * 
 */
package com.bbva.qtdi.dto.applicants;

/**
 * @author Novatec Solutions
 *
 */
public class IdentityDocumentType {
	
	private String id;//TODO: Hacer prueba con tipo enum
	private String description;
	
	/**
	 * @param id
	 * @param description
	 */
	public IdentityDocumentType(String id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public final void setDescription(String description) {
		this.description = description;
	}
	
}
