package com.master.dropdown.MasterDropdown.MasterPojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The primary key class for the m_gender database table.
 * 
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MGenderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="GENDER_CD")
	private int genderCd;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MGenderPK)) {
			return false;
		}
		MGenderPK castOther = (MGenderPK)other;
		return 
			(this.genderCd == castOther.genderCd)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.genderCd;
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}