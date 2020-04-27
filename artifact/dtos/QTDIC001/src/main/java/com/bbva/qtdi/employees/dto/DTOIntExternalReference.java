package com.bbva.qtdi.employees.dto;

import com.bbva.apx.dto.AbstractDTO;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DTOIntExternalReference extends AbstractDTO {

	private static final long serialVersionUID = 1931699728946641122L;

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id).append("name", name)
				.toString();
	}

}
