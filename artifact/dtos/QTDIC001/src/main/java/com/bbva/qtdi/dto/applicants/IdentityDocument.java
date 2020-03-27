/**
 * 
 */
package com.bbva.qtdi.dto.applicants;

import java.util.Date;

/**
 * @author Novatec Solutions
 *
 */
public class IdentityDocument {
	
	private String documentNumber;
	private Date issueDate;
	private String city;
	private IdentityDocumentType identityDocumentType;
	
	/**
	 * @param documentNumber
	 * @param issueDate
	 * @param city
	 * @param identityDocumentType
	 */
	public IdentityDocument(String documentNumber, Date issueDate, String city,
			IdentityDocumentType identityDocumentType) {
		super();
		this.documentNumber = documentNumber;
		this.issueDate = issueDate;
		this.city = city;
		this.identityDocumentType = identityDocumentType;
	}

	/**
	 * @return the documentNumber
	 */
	public final String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * @param documentNumber the documentNumber to set
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
	 * @param issueDate the issueDate to set
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
	 * @param city the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the identityDocumentType
	 */
	public final IdentityDocumentType getIdentityDocumentType() {
		return identityDocumentType;
	}

	/**
	 * @param identityDocumentType the identityDocumentType to set
	 */
	public final void setIdentityDocumentType(IdentityDocumentType identityDocumentType) {
		this.identityDocumentType = identityDocumentType;
	}
}
