package com.bbva.qtdi.dto.applicants;

/**
 * @author Novatec Solutions
 *
 */
public class Address {
	
	private String formatedAddress;
	private AddressType addressType;
	private Location location;
	
	/**
	 * @param formatedAddress
	 * @param addressType
	 * @param location
	 */
	public Address(String formatedAddress, AddressType addressType, Location location) {
		super();
		this.formatedAddress = formatedAddress;
		this.addressType = addressType;
		this.location = location;
	}
	/**
	 * @return the formatedAddress
	 */
	public final String getFormatedAddress() {
		return formatedAddress;
	}
	/**
	 * @param formatedAddress the formatedAddress to set
	 */
	public final void setFormatedAddress(String formatedAddress) {
		this.formatedAddress = formatedAddress;
	}
	/**
	 * @return the addressType
	 */
	public final AddressType getAddressType() {
		return addressType;
	}
	/**
	 * @param addressType the addressType to set
	 */
	public final void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	/**
	 * @return the location
	 */
	public final Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public final void setLocation(Location location) {
		this.location = location;
	}

}
