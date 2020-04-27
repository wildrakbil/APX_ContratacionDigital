package com.bbva.qtdi.employees.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOIntIdentityDocuments extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641125L;

	private String documentNumber;
	private Date issueDate;
	private String city;
	private DTOIntIdentityDocumentType identityDocumentType;

	/**
	 * @return the documentNumber
	 */
	public final String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * @param documentNumber
	 *            the documentNumber to set
	 */
	public final void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
	 * @return the issueDate
	 */
	public final Date getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate
	 *            the issueDate to set
	 */
	public final void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the identityDocumentType
	 */
	public final DTOIntIdentityDocumentType getIdentityDocumentType() {
		return identityDocumentType;
	}

	/**
	 * @param identityDocumentType
	 *            the identityDocumentType to set
	 */
	public final void setIdentityDocumentType(DTOIntIdentityDocumentType identityDocumentType) {
		this.identityDocumentType = identityDocumentType;
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
		DTOIntIdentityDocuments other = (DTOIntIdentityDocuments) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (documentNumber == null) {
			if (other.documentNumber != null)
				return false;
		} else if (!documentNumber.equals(other.documentNumber))
			return false;
		if (identityDocumentType == null) {
			if (other.identityDocumentType != null)
				return false;
		} else if (!identityDocumentType.equals(other.identityDocumentType))
			return false;
		if (issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!issueDate.equals(other.issueDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("documentNumber", documentNumber)
				.append("issueDate", issueDate).append("city", city)
				.append("identityDocumentType", identityDocumentType).toString();
	}
}
