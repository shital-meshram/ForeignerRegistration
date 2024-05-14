package com.master.dropdown.MasterDropdown.Master;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The primary key class for the m_educational_qualification database table.
 * 
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MEducationalQualificationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EDU_QUAL_CD")
	private int eduQualCd;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MEducationalQualificationPK)) {
			return false;
		}
		MEducationalQualificationPK castOther = (MEducationalQualificationPK)other;
		return 
			(this.eduQualCd == castOther.eduQualCd)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.eduQualCd;
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}