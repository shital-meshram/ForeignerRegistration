package com.example.ForeignerRegistration.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_cs_person_identity_marks database table.
 * 
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="t_cs_person_identity_marks")
@NamedQuery(name="TCsPersonIdentityMark.findAll", query="SELECT t FROM TCsPersonIdentityMark t")
public class TCsPersonIdentityMark implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCsPersonIdentityMarkPK id;

	@Column(name="DUMMY_COLUMN_1")
	private String dummyColumn1;

	@Column(name="DUMMY_COLUMN_2")
	private String dummyColumn2;

	@Column(name="IS_FIRST_SYNC_DONE")
	private String isFirstSyncDone;

	@Column(name="ORIGINAL_RECORD")
	private int originalRecord;

	@Column(name="PERSON_CODE")
	private BigInteger personCode;

	@Column(name="PLACE_BLACKMARK")
	private int placeBlackmark;

	@Column(name="PLACE_BURNMARK")
	private int placeBurnmark;

	@Column(name="PLACE_LEUCODERMA")
	private int placeLeucoderma;

	@Column(name="PLACE_MOLE")
	private int placeMole;

	@Column(name="PLACE_SCAR")
	private int placeScar;

	@Column(name="PLACE_TATTOO")
	private int placeTattoo;

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

	@Column(name="TATTOO_MARK_DESC")
	private String tattooMarkDesc;

	@Column(name="TATTOO_TYPE_CD")
	private int tattooTypeCd;



}