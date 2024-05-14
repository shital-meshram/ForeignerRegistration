package com.example.ForeignerRegistration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The primary key class for the t_cs_foreigner_pre_visit_details database table.
 * 
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCsForeignerPreVisitDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="VISIT_SRNO")
	private long visitSrno;

	@Column(name="LANG_CD")
	private int langCd;



	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TCsForeignerPreVisitDetailPK)) {
			return false;
		}
		TCsForeignerPreVisitDetailPK castOther = (TCsForeignerPreVisitDetailPK)other;
		return 
			(this.visitSrno == castOther.visitSrno)
			&& (this.langCd == castOther.langCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.visitSrno ^ (this.visitSrno >>> 32)));
		hash = hash * prime + this.langCd;
		
		return hash;
	}
}