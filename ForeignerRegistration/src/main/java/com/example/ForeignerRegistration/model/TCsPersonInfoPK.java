package com.example.ForeignerRegistration.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The primary key class for the t_cs_person_info database table.
 * 
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TCsPersonInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PERSON_CODE")
	private long personCode;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TCsPersonInfoPK)) {
			return false;
		}
		TCsPersonInfoPK castOther = (TCsPersonInfoPK)other;
		return 
			(this.personCode == castOther.personCode)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.personCode ^ (this.personCode >>> 32)));
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}