package com.example.ForeignerRegistration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_cs_foreigner_pre_visit_details database table.
 * 
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="t_cs_foreigner_pre_visit_details")
@NamedQuery(name="TCsForeignerPreVisitDetail.findAll", query="SELECT t FROM TCsForeignerPreVisitDetail t")
public class TCsForeignerPreVisitDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCsForeignerPreVisitDetailPK id;

	@OneToOne(mappedBy = "preVisitDetail")
	private TCsForeignerRegistration foreignerNum;

	@Column(name="DUMMY_COLUMN_1")
	private String dummyColumn1;

	@Column(name="DUMMY_COLUMN_2")
	private String dummyColumn2;

	@Column(name="IS_FIRST_SYNC_DONE")
	private String isFirstSyncDone;

	@Column(name="ORIGINAL_RECORD")
	private int originalRecord;

	@Column(name="PREV_RESIDING_ADDR")
	private BigInteger prevResidingAddr;

	@Column(name="PREV_RESIDING_PLC")
	private String prevResidingPlc;

	@Column(name="PREV_VISA_TYPE")
	private String prevVisaType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PREV_VISIT_FRM_DT")
	private Date prevVisitFrmDt;

	@Column(name="PREV_VISIT_PURPOSE")
	private String prevVisitPurpose;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PREV_VISIT_TO_DT")
	private Date prevVisitToDt;

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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VISA_APPL_DT")
	private Date visaApplDt;


}