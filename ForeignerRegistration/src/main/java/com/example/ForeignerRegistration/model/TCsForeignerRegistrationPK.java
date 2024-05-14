package com.example.ForeignerRegistration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * The primary key class for the t_cs_foreigner_registration database table.
 * 
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TCsForeignerRegistrationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FOREIGNER_SR_NUM")
	private long foreignerSrNum;

	@Column(name="LANG_CD")
	private int langCd;




	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TCsForeignerRegistrationPK)) {
			return false;
		}
		TCsForeignerRegistrationPK castOther = (TCsForeignerRegistrationPK)other;
		return 
			(this.foreignerSrNum == castOther.foreignerSrNum)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.foreignerSrNum ^ (this.foreignerSrNum >>> 32)));
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}