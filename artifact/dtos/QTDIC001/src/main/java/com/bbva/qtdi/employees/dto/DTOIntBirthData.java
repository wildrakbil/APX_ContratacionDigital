package com.bbva.qtdi.employees.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOIntBirthData extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641107L;

	private Date birthDate;
	private String city;
	private DTOIntCountry countryDto;
	
	


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
	 * @return the countryDto
	 */
	public final DTOIntCountry getCountryDto() {
		return countryDto;
	}



	/**
	 * @param countryDto the countryDto to set
	 */
	public final void setCountryDto(DTOIntCountry countryDto) {
		this.countryDto = countryDto;
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
		DTOIntBirthData other = (DTOIntBirthData) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (countryDto == null) {
			if (other.countryDto != null)
				return false;
		} else if (!countryDto.equals(other.countryDto))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("birthDate", birthDate)
				.append("city", city).append("countryDto", countryDto).toString();
	}

}
