package com.bbva.qtdi.dto.employees;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOOutApplicant extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641133L;

	private DTOIntApplicant applicant;

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
		DTOOutApplicant other = (DTOOutApplicant) obj;
		if (applicant == null) {
			if (other.applicant != null)
				return false;
		} else if (!applicant.equals(other.applicant))
			return false;
		return true;
	}

	/**
	 * @return the applicant
	 */
	public final DTOIntApplicant getApplicant() {
		return applicant;
	}

	/**
	 * @param applicant the applicant to set
	 */
	public final void setApplicant(DTOIntApplicant applicant) {
		this.applicant = applicant;
	}



	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("applicant", applicant)
				.toString();
	}

}
