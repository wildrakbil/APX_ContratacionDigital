package com.bbva.qtdi.dto.employees;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOIntAddresses extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641100L;

	private String addressName;
	private String formattedAddress;
	private String alias;
	private String city;
	private String state;
	private String zipCode;
	private DTOIntAddressType addressType;
	private DTOIntCountry country;
	private DTOIntLocation location;
	

	/**
	 * @return the addressName
	 */
	public final String getAddressName() {
		return addressName;
	}



	/**
	 * @param addressName the addressName to set
	 */
	public final void setAddressName(String addressName) {
		this.addressName = addressName;
	}



	/**
	 * @return the formattedAddress
	 */
	public final String getFormattedAddress() {
		return formattedAddress;
	}



	/**
	 * @param formattedAddress the formattedAddress to set
	 */
	public final void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}



	/**
	 * @return the alias
	 */
	public final String getAlias() {
		return alias;
	}



	/**
	 * @param alias the alias to set
	 */
	public final void setAlias(String alias) {
		this.alias = alias;
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
	 * @return the state
	 */
	public final String getState() {
		return state;
	}



	/**
	 * @param state the state to set
	 */
	public final void setState(String state) {
		this.state = state;
	}



	/**
	 * @return the zipCode
	 */
	public final String getZipCode() {
		return zipCode;
	}



	/**
	 * @param zipCode the zipCode to set
	 */
	public final void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	/**
	 * @return the addressType
	 */
	public final DTOIntAddressType getAddressType() {
		return addressType;
	}



	/**
	 * @param addressType the addressType to set
	 */
	public final void setAddressType(DTOIntAddressType addressType) {
		this.addressType = addressType;
	}



	/**
	 * @return the country
	 */
	public final DTOIntCountry getCountry() {
		return country;
	}



	/**
	 * @param country the country to set
	 */
	public final void setCountry(DTOIntCountry country) {
		this.country = country;
	}



	/**
	 * @return the location
	 */
	public final DTOIntLocation getLocation() {
		return location;
	}



	/**
	 * @param location the location to set
	 */
	public final void setLocation(DTOIntLocation location) {
		this.location = location;
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
		DTOIntAddresses other = (DTOIntAddresses) obj;
		if (addressName == null) {
			if (other.addressName != null)
				return false;
		} else if (!addressName.equals(other.addressName))
			return false;
		if (addressType == null) {
			if (other.addressType != null)
				return false;
		} else if (!addressType.equals(other.addressType))
			return false;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (formattedAddress == null) {
			if (other.formattedAddress != null)
				return false;
		} else if (!formattedAddress.equals(other.formattedAddress))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("addressName", addressName)
				.append("city", city).append("state", state).append("country", country).append("zipCode", zipCode)
				.append("alias", alias).append("addressType", addressType).append("formattedAddress", formattedAddress)
				.append("location", location).toString();
	}
}
