/**
 * 
 */
package com.bbva.qtdi.dto.employees;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

/**
 * @author Novatec Solutions
 *
 */
public class DTOIntLanguageSkillLevel extends AbstractDTO {

	private static final long serialVersionUID = 2931699728946641128L;
	
	private String id;
	private String description;
	private String testName;
	private String instituteName;
	
	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public final void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the testName
	 */
	public final String getTestName() {
		return testName;
	}

	/**
	 * @param testName the testName to set
	 */
	public final void setTestName(String testName) {
		this.testName = testName;
	}

	/**
	 * @return the instituteName
	 */
	public final String getInstituteName() {
		return instituteName;
	}

	/**
	 * @param instituteName the instituteName to set
	 */
	public final void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTOIntLanguageSkillLevel other = (DTOIntLanguageSkillLevel) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (instituteName == null) {
			if (other.instituteName != null)
				return false;
		} else if (!instituteName.equals(other.instituteName))
			return false;
		if (testName == null) {
			if (other.testName != null)
				return false;
		} else if (!testName.equals(other.testName))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("id", id)
				.append("description", description)
				.append("testName", testName)
				.append("instituteName", instituteName)
				.toString();
	}

}
