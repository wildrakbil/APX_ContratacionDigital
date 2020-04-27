/**
 * 
 */
package com.bbva.qtdi.employees.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Novatec Solutions
 *
 */
public class DTOIntContactDetails {

	private DTOIntContact contact;
	private Date countryEntryDate;

	/**
	 * @return the contact
	 */
	public final DTOIntContact getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public final void setContact(DTOIntContact contact) {
		this.contact = contact;
	}

	/**
	 * @return the countryEntryDate
	 */
	public final Date getCountryEntryDate() {
		return countryEntryDate;
	}

	/**
	 * @param countryEntryDate
	 *            the countryEntryDate to set
	 */
	public final void setCountryEntryDate(Date countryEntryDate) {
		this.countryEntryDate = countryEntryDate;
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
		DTOIntContactDetails other = (DTOIntContactDetails) obj;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (countryEntryDate == null) {
			if (other.countryEntryDate != null)
				return false;
		} else if (!countryEntryDate.equals(other.countryEntryDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("contact", contact)
				.append("countryEntryDate", countryEntryDate).toString();
	}

}
