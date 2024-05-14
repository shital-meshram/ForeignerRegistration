package com.master.dropdown.MasterDropdown.Master;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The primary key class for the m_physical_features database table.
 * 
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MPhysicalFeaturePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PHYSICAL_FEATURE_CD")
	private int physicalFeatureCd;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MPhysicalFeaturePK)) {
			return false;
		}
		MPhysicalFeaturePK castOther = (MPhysicalFeaturePK)other;
		return 
			(this.physicalFeatureCd == castOther.physicalFeatureCd)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.physicalFeatureCd;
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}