package com.bbva.qtdi.dto.employees;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOIntApplicant extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641102L;

	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String secondLastName;
	private List<DTOIntIdentityDocuments> identityDocuments = new ArrayList<DTOIntIdentityDocuments>();
	private String nationality;
	private DTOIntBirthData birthData;
	private DTOIntGender gender;
	private DTOIntMaritalStatus maritalStatus;
	private List<DTOIntAddresses> addresses;
	private List<DTOIntContactDetails> contactDetails = new ArrayList<DTOIntContactDetails>();
	private List<DTOIntSocialSecurity> SocialSecurity = new ArrayList<DTOIntSocialSecurity>();

	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
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
	 * @param middleName
	 *            the middleName to set
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
	 * @param lastName
	 *            the lastName to set
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
	 * @param secondLastName
	 *            the secondLastName to set
	 */
	public final void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	/**
	 * @return the identityDocuments
	 */
	public final List<DTOIntIdentityDocuments> getIdentityDocuments() {
		return identityDocuments;
	}

	/**
	 * @param identityDocuments
	 *            the identityDocuments to set
	 */
	public final void setIdentityDocuments(List<DTOIntIdentityDocuments> identityDocuments) {
		this.identityDocuments = identityDocuments;
	}

	/**
	 * @return the nationality
	 */
	public final String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public final void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the birthData
	 */
	public final DTOIntBirthData getBirthData() {
		return birthData;
	}

	/**
	 * @param birthData
	 *            the birthData to set
	 */
	public final void setBirthData(DTOIntBirthData birthData) {
		this.birthData = birthData;
	}

	/**
	 * @return the gender
	 */
	public final DTOIntGender getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public final void setGender(DTOIntGender gender) {
		this.gender = gender;
	}

	/**
	 * @return the maritalStatus
	 */
	public final DTOIntMaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * @param maritalStatus
	 *            the maritalStatus to set
	 */
	public final void setMaritalStatus(DTOIntMaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	 * @return the addresses
	 */
	public final List<DTOIntAddresses> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public final void setAddresses(List<DTOIntAddresses> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the contactDetails
	 */
	public final List<DTOIntContactDetails> getContactDetails() {
		return contactDetails;
	}

	/**
	 * @param contactDetails
	 *            the contactDetails to set
	 */
	public final void setContactDetails(List<DTOIntContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}

	/**
	 * @return the socialSecurity
	 */
	public final List<DTOIntSocialSecurity> getSocialSecurity() {
		return SocialSecurity;
	}

	/**
	 * @param socialSecurity
	 *            the socialSecurity to set
	 */
	public final void setSocialSecurity(List<DTOIntSocialSecurity> socialSecurity) {
		SocialSecurity = socialSecurity;
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
		DTOIntApplicant other = (DTOIntApplicant) obj;
		if (SocialSecurity == null) {
			if (other.SocialSecurity != null)
				return false;
		} else if (!SocialSecurity.equals(other.SocialSecurity))
			return false;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		if (birthData == null) {
			if (other.birthData != null)
				return false;
		} else if (!birthData.equals(other.birthData))
			return false;
		if (contactDetails == null) {
			if (other.contactDetails != null)
				return false;
		} else if (!contactDetails.equals(other.contactDetails))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (identityDocuments == null) {
			if (other.identityDocuments != null)
				return false;
		} else if (!identityDocuments.equals(other.identityDocuments))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (secondLastName == null) {
			if (other.secondLastName != null)
				return false;
		} else if (!secondLastName.equals(other.secondLastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
				.append("firstName", firstName).append("middleName", middleName).append("lastName", lastName)
				.append("secondLastName", secondLastName).append("identityDocuments", identityDocuments)
				.append("nationality", nationality).append("birthData", birthData).append("genderDto", gender)
				.append("maritalStatus", maritalStatus).append("addresses", addresses)
				.append("contactDetails", contactDetails).append("SocialSecurity", SocialSecurity).toString();
	}
}
