package com.bbva.qtdi.dto.employees;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.bbva.apx.dto.AbstractDTO;

public class DTOIntAuthorizationQuestion extends AbstractDTO {

	private Long id;
	private String description;
	private String text;
	private boolean enabled;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		DTOIntAuthorizationQuestion that = (DTOIntAuthorizationQuestion) o;

		if (enabled != that.enabled) return false;
		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		return text != null ? text.equals(that.text) : that.text == null;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("id", id)
				.append("description", description)
				.append("text", text)
				.append("enabled", enabled)
				.toString();
	}
}
