package com.example.ForeignerRegistration.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The primary key class for the t_cs_person_identity_marks database table.
 * 
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TCsPersonIdentityMarkPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="IDENTITY_SRNO")
	private long identitySrno;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TCsPersonIdentityMarkPK)) {
			return false;
		}
		TCsPersonIdentityMarkPK castOther = (TCsPersonIdentityMarkPK)other;
		return 
			(this.identitySrno == castOther.identitySrno)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.identitySrno ^ (this.identitySrno >>> 32)));
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}