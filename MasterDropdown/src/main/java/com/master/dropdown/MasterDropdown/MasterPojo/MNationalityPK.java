package com.master.dropdown.MasterDropdown.MasterPojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The primary key class for the m_nationality database table.
 * 
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MNationalityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NATIONALITY_CD")
	private int nationalityCd;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MNationalityPK)) {
			return false;
		}
		MNationalityPK castOther = (MNationalityPK)other;
		return 
			(this.nationalityCd == castOther.nationalityCd)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nationalityCd;
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}