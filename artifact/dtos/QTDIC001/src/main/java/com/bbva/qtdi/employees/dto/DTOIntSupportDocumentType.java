package com.bbva.qtdi.employees.dto;

import com.bbva.apx.dto.AbstractDTO;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DTOIntSupportDocumentType extends AbstractDTO {

	private Long id;
	private String description;
	private boolean required;
	private String responsible;
	private DTOIntCategory category;
	private DTOIntExternalReference externalReference;

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

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public DTOIntCategory getCategory() {
		return category;
	}

	public void setCategory(DTOIntCategory category) {
		this.category = category;
	}

	public DTOIntExternalReference getExternalReference() {
		return externalReference;
	}

	public void setExternalReference(DTOIntExternalReference externalReference) {
		this.externalReference = externalReference;
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				.append("id", getId())
				.append("description", getDescription())
				.append("required", isRequired())
				.append("responsible", getResponsible())
				.append("category", getCategory())
				.append("externalReference", getExternalReference())
				.toString();
	}
}
