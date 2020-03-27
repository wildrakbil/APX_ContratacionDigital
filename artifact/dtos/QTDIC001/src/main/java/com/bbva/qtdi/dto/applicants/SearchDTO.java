package com.bbva.qtdi.dto.applicants;

import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.bbva.apx.dto.AbstractDTO;

/**
 * @author Novatec Solutions
 *
 */
public class SearchDTO extends AbstractDTO {

	private static final long serialVersionUID = 2931699728946643246L;

	private String firstName;
	private String lastName;
	private List<IdentityDocument> identityDocuments;

	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the identityDocuments
	 */
	public final List<IdentityDocument> getIdentityDocuments() {
		return identityDocuments;
	}

	/**
	 * @param identityDocuments
	 *            the identityDocuments to set
	 */
	public final void setIdentityDocuments(List<IdentityDocument> identityDocuments) {
		this.identityDocuments = identityDocuments;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.firstName)
				.append(this.lastName)
				.append(this.identityDocuments)
				.toHashCode();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) { return false; }
	    if (obj == this) { return true; }
	    if (obj.getClass() != getClass()) { return false; }
		final SearchDTO rhs = (SearchDTO) obj;
		return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(firstName, rhs.firstName)
                .append(lastName, rhs.lastName)
                .append(identityDocuments, rhs.identityDocuments)
                .isEquals();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("firstName", firstName)
				.append("lastName", lastName)
				.append("identityDocuments", identityDocuments)
				.toString();
	}
}
