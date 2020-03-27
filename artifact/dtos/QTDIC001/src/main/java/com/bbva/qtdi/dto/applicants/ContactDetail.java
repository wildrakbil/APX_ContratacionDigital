/**
 * 
 */
package com.bbva.qtdi.dto.applicants;

import java.util.Date;

/**
 * @author Novatec Solutions
 *
 */
public class ContactDetail {
	
	private Contact Contact;
	private Date countryEntryDate;
	
	/**
	 * @param contact
	 * @param countryEntryDate
	 */
	public ContactDetail(com.bbva.qtdi.dto.applicants.Contact contact, Date countryEntryDate) {
		super();
		Contact = contact;
		this.countryEntryDate = countryEntryDate;
	}
	/**
	 * @return the contact
	 */
	public final Contact getContact() {
		return Contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public final void setContact(Contact contact) {
		Contact = contact;
	}
	/**
	 * @return the countryEntryDate
	 */
	public final Date getCountryEntryDate() {
		return countryEntryDate;
	}
	/**
	 * @param countryEntryDate the countryEntryDate to set
	 */
	public final void setCountryEntryDate(Date countryEntryDate) {
		this.countryEntryDate = countryEntryDate;
	}
}
