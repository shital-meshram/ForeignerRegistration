package com.master.dropdown.MasterDropdown.Master;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The primary key class for the m_travel_type database table.
 * 
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MTravelTypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TRVLEL_TYPE_CD")
	private int trvlelTypeCd;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MTravelTypePK)) {
			return false;
		}
		MTravelTypePK castOther = (MTravelTypePK)other;
		return 
			(this.trvlelTypeCd == castOther.trvlelTypeCd)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.trvlelTypeCd;
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}