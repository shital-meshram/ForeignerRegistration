package com.master.dropdown.MasterDropdown.MasterPojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The primary key class for the m_nationality_acquire_by database table.
 * 
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MNationalityAcquireByPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NATION_AQUR_BY_CD")
	private int nationAqurByCd;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MNationalityAcquireByPK)) {
			return false;
		}
		MNationalityAcquireByPK castOther = (MNationalityAcquireByPK)other;
		return 
			(this.nationAqurByCd == castOther.nationAqurByCd)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nationAqurByCd;
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}