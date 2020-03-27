/**
 * 
 */
package com.bbva.qtdi.dto.applicants;

import java.util.Date;

/**
 * @author Novatec Solutions
 *
 */
public class BirthData {

	private String city;
	private Country country;
	private Date birthDate;
	
	/**
	 * @param city
	 * @param country
	 * @param birthDate
	 */
	public BirthData(String city, Country country, Date birthDate) {
		super();
		this.city = city;
		this.country = country;
		this.birthDate = birthDate;
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
	 * @return the country
	 */
	public final Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public final void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @return the birthDate
	 */
	public final Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public final void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
