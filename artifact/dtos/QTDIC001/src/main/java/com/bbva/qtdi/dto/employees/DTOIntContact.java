package com.bbva.qtdi.dto.employees;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOIntContact extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641114L;

	private String contactDetailType;
	private String address;
	private String number;

	/**
	 * @return the contactDetailType
	 */
	public final String getContactDetailType() {
		return contactDetailType;
	}

	/**
	 * @param contactDetailType
	 *            the contactDetailType to set
	 */
	public final void setContactDetailType(String contactDetailType) {
		this.contactDetailType = contactDetailType;
	}
	
	

	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the number
	 */
	public final String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public final void setNumber(String number) {
		this.number = number;
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
		DTOIntContact other = (DTOIntContact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactDetailType == null) {
			if (other.contactDetailType != null)
				return false;
		} else if (!contactDetailType.equals(other.contactDetailType))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("contactDetailType", contactDetailType)
				.append("address", address)
				.append("number", number)
				.toString();
	}

}
