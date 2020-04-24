/**
 * 
 */
package com.bbva.qtdi.dto.applicants;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

/**
 * @author Novatec Solutions
 *
 */
public class DTOIntLanguageSkill extends AbstractDTO {
	
	private static final long serialVersionUID = 2931699728946641127L;
	
	private Integer id;
    private DTOIntLanguage language;
    private Boolean reading;
    private Boolean writing;
    private Boolean listening;
    private Boolean speaking;
    private DTOIntLanguageSkillLevel level;
	
	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the language
	 */
	public final DTOIntLanguage getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public final void setLanguage(DTOIntLanguage language) {
		this.language = language;
	}
	/**
	 * @return the reading
	 */
	public final Boolean getReading() {
		return reading;
	}
	/**
	 * @param reading the reading to set
	 */
	public final void setReading(Boolean reading) {
		this.reading = reading;
	}
	/**
	 * @return the writing
	 */
	public final Boolean getWriting() {
		return writing;
	}
	/**
	 * @param writing the writing to set
	 */
	public final void setWriting(Boolean writing) {
		this.writing = writing;
	}
	/**
	 * @return the listening
	 */
	public final Boolean getListening() {
		return listening;
	}
	/**
	 * @param listening the listening to set
	 */
	public final void setListening(Boolean listening) {
		this.listening = listening;
	}
	/**
	 * @return the speaking
	 */
	public final Boolean getSpeaking() {
		return speaking;
	}
	/**
	 * @param speaking the speaking to set
	 */
	public final void setSpeaking(Boolean speaking) {
		this.speaking = speaking;
	}
	/**
	 * @return the level
	 */
	public final DTOIntLanguageSkillLevel getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public final void setLevel(DTOIntLanguageSkillLevel level) {
		this.level = level;
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
		DTOIntLanguageSkill other = (DTOIntLanguageSkill) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (listening == null) {
			if (other.listening != null)
				return false;
		} else if (!listening.equals(other.listening))
			return false;
		if (reading == null) {
			if (other.reading != null)
				return false;
		} else if (!reading.equals(other.reading))
			return false;
		if (speaking == null) {
			if (other.speaking != null)
				return false;
		} else if (!speaking.equals(other.speaking))
			return false;
		if (writing == null) {
			if (other.writing != null)
				return false;
		} else if (!writing.equals(other.writing))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("id", id)
				.append("language", language)
				.append("reading", reading)
				.append("writing", writing)
				.append("listening", listening)
				.append("speaking", speaking)
				.append("level", level)
				.toString();
	}
    
    

}
