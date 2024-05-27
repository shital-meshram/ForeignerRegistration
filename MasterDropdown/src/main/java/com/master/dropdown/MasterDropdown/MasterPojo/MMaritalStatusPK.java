package com.master.dropdown.MasterDropdown.MasterPojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The primary key class for the m_marital_status database table.
 * 
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MMaritalStatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MARITAL_STATUS_CD")
	private int maritalStatusCd;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MMaritalStatusPK)) {
			return false;
		}
		MMaritalStatusPK castOther = (MMaritalStatusPK)other;
		return 
			(this.maritalStatusCd == castOther.maritalStatusCd)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.maritalStatusCd;
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}