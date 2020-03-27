/**
 * 
 */
package com.bbva.qtdi.dto.applicants;

/**
 * @author Novatec Solutions
 *
 */
public class Entity {
	
	private String id;
	private String name;
	
	/**
	 * @param id
	 * @param name
	 */
	public Entity(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

}
