package com.example.ForeignerRegistration.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The primary key class for the t_cs_person_address database table.
 * 
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TCsPersonAddressPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS_CD")
	private long addressCd;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TCsPersonAddressPK)) {
			return false;
		}
		TCsPersonAddressPK castOther = (TCsPersonAddressPK)other;
		return 
			(this.addressCd == castOther.addressCd)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.addressCd ^ (this.addressCd >>> 32)));
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}