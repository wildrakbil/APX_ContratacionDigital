package com.bbva.qtdi.employees.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOIntLocation extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641128L;

	private DTOIntCity city;


	/**
	 * @return the cityDto
	 */
	public final DTOIntCity getCity() {
		return city;
	}

	/**
	 * @param cityDto
	 *            the cityDto to set
	 */
	public final void setCity(DTOIntCity city) {
		this.city = city;
	}

	/* (non-Javadoc)
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
		DTOIntLocation other = (DTOIntLocation) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("city", city).toString();
	}

}
