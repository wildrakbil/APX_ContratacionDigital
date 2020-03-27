package com.bbva.qtdi.dto.applicants;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bbva.apx.dto.AbstractDTO;

/**
 * Class RequestAplicantsDTO to request process for work applicants DTO outside
 * the canonical model
 * 
 * @author Novatec Solutions
 *
 */
public class AplicantsDTO extends AbstractDTO {

	private static final long serialVersionUID = 2931699728946643245L;

	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String secondLastName;
	private List<IdentityDocument> identityDocuments;
	private String nationality;
	private BirthData birthData;
	private Gender gender;
	private MaritalStatus maritalStatus;
	private List<Address> addresses;
	private List<ContactDetail> contactDetails;
	private String countryEntryDate;
	private List<SocialSecurity> socialSecurity;
	
	/**
	 * @return the id
	 */
	public final long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleName
	 */
	public final String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the secondLastName
	 */
	public final String getSecondLastName() {
		return secondLastName;
	}
	/**
	 * @param secondLastName the secondLastName to set
	 */
	public final void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	/**
	 * @return the identityDocuments
	 */
	public final List<IdentityDocument> getIdentityDocuments() {
		return identityDocuments;
	}
	/**
	 * @param identityDocuments the identityDocuments to set
	 */
	public final void setIdentityDocuments(List<IdentityDocument> identityDocuments) {
		this.identityDocuments = identityDocuments;
	}
	/**
	 * @return the nationality
	 */
	public final String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public final void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the birthData
	 */
	public final BirthData getBirthData() {
		return birthData;
	}
	/**
	 * @param birthData the birthData to set
	 */
	public final void setBirthData(BirthData birthData) {
		this.birthData = birthData;
	}
	/**
	 * @return the gender
	 */
	public final Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public final void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * @return the maritalStatus
	 */
	public final MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public final void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	/**
	 * @return the addresses
	 */
	public final List<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public final void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	/**
	 * @return the contactDetails
	 */
	public final List<ContactDetail> getContactDetails() {
		return contactDetails;
	}
	/**
	 * @param contactDetails the contactDetails to set
	 */
	public final void setContactDetails(List<ContactDetail> contactDetails) {
		this.contactDetails = contactDetails;
	}
	/**
	 * @return the countryEntryDate
	 */
	public final String getCountryEntryDate() {
		return countryEntryDate;
	}
	/**
	 * @param countryEntryDate the countryEntryDate to set
	 */
	public final void setCountryEntryDate(String countryEntryDate) {
		this.countryEntryDate = countryEntryDate;
	}
	/**
	 * @return the socialSecurity
	 */
	public final List<SocialSecurity> getSocialSecurity() {
		return socialSecurity;
	}
	/**
	 * @param socialSecurity the socialSecurity to set
	 */
	public final void setSocialSecurity(List<SocialSecurity> socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	
	

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.id)
				.append(this.firstName)
				.append(this.middleName)
				.append(this.lastName)
				.append(this.identityDocuments)
				.append(this.nationality)
				.append(this.birthData)
				.append(this.gender)
				.append(this.maritalStatus)
				.append(this.addresses)
				.append(this.contactDetails)
				.append(this.countryEntryDate)
				.append(this.socialSecurity)
				.toHashCode();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) { return false; }
	    if (obj == this) { return true; }
	    if (obj.getClass() != getClass()) { return false; }
		final AplicantsDTO rhs = (AplicantsDTO) obj;
		return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(id, rhs.id)
                .append(firstName, rhs.firstName)
                .append(middleName, rhs.middleName)
                .append(lastName, rhs.lastName)
                .append(identityDocuments, rhs.identityDocuments)
                .append(nationality, rhs.nationality)
                .append(birthData, rhs.birthData)
                .append(gender, rhs.gender)
                .append(maritalStatus, rhs.maritalStatus)
                .append(addresses, rhs.addresses)
                .append(contactDetails, rhs.contactDetails)
                .append(countryEntryDate, rhs.countryEntryDate)
                .append(socialSecurity, rhs.socialSecurity)
                .isEquals();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("firstName", firstName)
				.append("middleName", middleName)
				.append("lastName", lastName)
				.append("identityDocuments", identityDocuments)
				.append("nationality", nationality)
				.append("birthData", birthData)
				.append("gender", gender)
				.append("maritalStatus", maritalStatus)
				.append("addresses", addresses)
				.append("contactDetails", contactDetails)
				.append("countryEntryDate", countryEntryDate)
				.append("socialSecurity", socialSecurity)
				.toString();
	}
	
	

}
