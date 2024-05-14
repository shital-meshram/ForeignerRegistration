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
 * The persistent class for the t_cs_person_nationality database table.
 * 
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="t_cs_person_nationality")
@NamedQuery(name="TCsPersonNationality.findAll", query="SELECT t FROM TCsPersonNationality t")
public class TCsPersonNationality implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCsPersonNationalityPK id;

	@Column(name="IS_FIRST_SYNC_DONE")
	private String isFirstSyncDone;

	@Column(name="MIGRATION_SHEETNAME")
	private String migrationSheetname;

	@Column(name="MIGRATION_SRNO")
	private int migrationSrno;

	@Column(name="NATIONAL_ID_NUM")
	private String nationalIdNum;

	@Column(name="NATIONAL_ID_TYPE")
	private int nationalIdType;

	@Column(name="NATIONALITY_CD")
	private int nationalityCd;

	@Column(name="ORIGINAL_RECORD")
	private int originalRecord;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PASSPORT_ISSUE_DT")
	private Date passportIssueDt;

	@Column(name="PASSPORT_ISSUE_PLC")
	private String passportIssuePlc;

	@Column(name="PERSON_CODE")
	private BigInteger personCode;

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



}