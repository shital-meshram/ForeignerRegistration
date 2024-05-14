package com.example.ForeignerRegistration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_cs_person_address database table.
 * 
 */
@Entity
@Table(name="t_cs_person_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name="TCsPersonAddress.findAll", query="SELECT t FROM TCsPersonAddress t")
public class TCsPersonAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCsPersonAddressPK id;

	@Column(name="ADDR_TYPE")
	private int addrType;

	@Column(name="ADDRESS_LINE_1")
	private String addressLine1;

	@Column(name="ADDRESS_LINE_2")
	private String addressLine2;

	@Column(name="ADDRESS_LINE_3")
	private String addressLine3;

	@Column(name="COUNTRY_CD")
	private int countryCd;

	@Column(name="DISTRICT_CD")
	private int districtCd;

	@Column(name="DUMMY_COLUMN_1")
	private String dummyColumn1;

	@Column(name="DUMMY_COLUMN_2")
	private String dummyColumn2;

	@Column(name="IS_FIRST_SYNC_DONE")
	private String isFirstSyncDone;

	@Column(name="IS_PERM_ADDR_SAME")
	private String isPermAddrSame;

	private BigInteger mobile;

	@Column(name="ORIGINAL_RECORD")
	private int originalRecord;


	private int pincode;

	@Column(name="PS_CD")
	private int psCd;

	@Column(name="RECORD_CREATED_BY")
	private String recordCreatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECORD_CREATED_ON")
	private Date recordCreatedOn;

	@Column(name="RECORD_STATUS")
	private String recordStatus;

	@Column(name="RECORD_SYNC_FROM")
	private String recordSyncFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECORD_SYNC_ON")
	private Date recordSyncOn;

	@Column(name="RECORD_SYNC_TO")
	private String recordSyncTo;

	@Column(name="RECORD_UPDATED_BY")
	private String recordUpdatedBy;

	@Column(name="RECORD_UPDATED_FROM")
	private String recordUpdatedFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECORD_UPDATED_ON")
	private Date recordUpdatedOn;

	@Column(name="STATE_CD")
	private int stateCd;

	@Column(name="STAY_DURATION")
	private String stayDuration;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STAY_FROM_DT")
	private Date stayFromDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STAY_TO_DT")
	private Date stayToDt;

	private String tehsil;

	private String telephone;

	private String village;



}