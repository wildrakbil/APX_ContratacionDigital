package com.bbva.qtdi.employees.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOIntSocialSecurity extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641132L;
	
	private String type;
	private DTOIntEntity entity;
	

	/**
	 * @return the entity
	 */
	public final DTOIntEntity getEntity() {
		return entity;
	}

	/**
	 * @param entity
	 *            the entity to set
	 */
	public final void setEntity(DTOIntEntity entity) {
		this.entity = entity;
	}

	/**
	 * @return the type
	 */
	public final String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public final void setType(String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTOIntSocialSecurity other = (DTOIntSocialSecurity) obj;
		if (entity == null) {
			if (other.entity != null)
				return false;
		} else if (!entity.equals(other.entity))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("entity", entity).append("type", type)
				.toString();
	}

}
