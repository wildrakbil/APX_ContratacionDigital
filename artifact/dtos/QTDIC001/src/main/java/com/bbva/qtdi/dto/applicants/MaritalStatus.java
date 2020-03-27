/**
 * 
 */
package com.bbva.qtdi.dto.applicants;

import java.util.Date;

/**
 * @author Novatec Solutions
 *
 */
public class MaritalStatus {
	
	private String id; //TODO: hacer la prueba con tipo enum
	private String description;
	private Date startDate;
	
	/**
	 * @param id
	 * @param description
	 * @param startDate
	 */
	public MaritalStatus(String id, String description, Date startDate) {
		super();
		this.id = id;
		this.description = description;
		this.startDate = startDate;
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

	/**
	 * @return the startDate
	 */
	public final Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public final void setStartDate(Date startDate) {
		this.startDate = startDate;
	}	
}