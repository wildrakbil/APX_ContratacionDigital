/**
 * 
 */
package com.bbva.qtdi.dto.applicants;

/**
 * @author Novatec Solutions
 *
 */
public class SocialSecurity {
	
	private String typo;
	private Entity entity;
	
	/**
	 * @param typo
	 * @param entity
	 */
	public SocialSecurity(String typo, Entity entity) {
		super();
		this.typo = typo;
		this.entity = entity;
	}

	/**
	 * @return the typo
	 */
	public final String getTypo() {
		return typo;
	}

	/**
	 * @param typo the typo to set
	 */
	public final void setTypo(String typo) {
		this.typo = typo;
	}

	/**
	 * @return the entity
	 */
	public final Entity getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public final void setEntity(Entity entity) {
		this.entity = entity;
	}
	
}
