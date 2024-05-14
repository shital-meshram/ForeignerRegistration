package com.example.ForeignerRegistration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_cs_foreigner_registration database table.
 * 
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="t_cs_foreigner_registration")
@NamedQuery(name="TCsForeignerRegistration.findAll", query="SELECT t FROM TCsForeignerRegistration t")
public class TCsForeignerRegistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCsForeignerRegistrationPK id;

	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumns({
			@JoinColumn(name = "FK_PERSON_CODE_NUM",referencedColumnName = "PERSON_CODE"),
			@JoinColumn(name = "FK_PERSON_LANG_CD", referencedColumnName = "LANG_CD")
	})
	private TCsPersonInfo personCode;


	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumns({
			@JoinColumn(name = "FK_TRAVEL_SRNO",referencedColumnName = "TRAVEL_SRNO"),
			@JoinColumn(name = "FK_TRAVEL_LANG_CD", referencedColumnName = "LANG_CD")
	})
	private TCsForeignerTravelDetail travelDetail;

	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumns({
			@JoinColumn(name = "FK_VISIT_SRNO",referencedColumnName = "VISIT_SRNO"),
			@JoinColumn(name = "FK_VISIT_LANG_CD", referencedColumnName = "LANG_CD")
	})
	private TCsForeignerPreVisitDetail preVisitDetail;


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="APPLICATION_DT")
	private Date applicationDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="APPLICATION_RECV_DT")
	private Date applicationRecvDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ARRIVAL_DT")
	private Date arrivalDt;

	@Column(name="ARRIVAL_PLACE")
	private String arrivalPlace;

	@Column(name="COMPANY_ADDR")
	private BigInteger companyAddr;



	@Nationalized
	@Column(name="COMPANY_NAME")
	private String companyName;

	@Column(name="COMPANY_PHONE")
	private String companyPhone;

	@Column(name="CURR_PASSPORT_NUM")
	private String currPassportNum;

	@Column(name="DISTRICT_CD")
	private int districtCd;

	@Column(name="DUMMY_COLUMN_1")
	private String dummyColumn1;

	@Column(name="DUMMY_COLUMN_2")
	private String dummyColumn2;

	@Column(name="EMERG_ADDR_ABROAD")
	private BigInteger emergAddrAbroad;

	@Column(name="EMERG_ADDR_INDIA")
	private BigInteger emergAddrIndia;

	@Column(name="EMERG_NAME_ABROAD")
	private String emergNameAbroad;

	@Column(name="EMERG_NAME_INDIA")
	private String emergNameIndia;

	@Column(name="EMERG_PHONE_ABROAD")
	private String emergPhoneAbroad;

	@Column(name="EMERG_PHONE_INDIA")
	private String emergPhoneIndia;

	@Column(name="EMP_DESIGNATION")
	private String empDesignation;

	@Column(name="EMPLOYEE_ID")
	private String employeeId;

	@Column(name="FOREIGN_ADDR_CD")
	private BigInteger foreignAddrCd;

	@Column(name="FOREIGN_PHONE")
	private String foreignPhone;

	@Column(name="FOREIGNER_PERS_CD")
	private BigInteger foreignerPersCd;

	@Column(name="FOREIGNER_REG_ACTION")
	private String foreignerRegAction;

	@Column(name="FOREIGNER_REG_REMRK")
	private String foreignerRegRemrk;

	@Column(name="INDIAN_ADDR_CD")
	private BigInteger indianAddrCd;

	@Column(name="INDIAN_PHONE_NUM")
	private String indianPhoneNum;

	@Column(name="IS_FIRST_SYNC_DONE")
	private String isFirstSyncDone;

	@Column(name="IS_FRESH_RENEW")
	private String isFreshRenew;

	@Column(name="IS_INDIAN_ORIGIN")
	private String isIndianOrigin;

	@Column(name="IS_LINKED")
	private String isLinked;

	@Column(name="LINKED_REQ_NUM")
	private BigInteger linkedReqNum;

	@Column(name="MILITARY_RANK")
	private String militaryRank;

	@Column(name="NATIONALITY_ACQUIRED_BY")
	private String nationalityAcquiredBy;

	@Column(name="OLD_PASSPORT_NUM")
	private String oldPassportNum;

	@Column(name="ORIGINAL_RECORD")
	private int originalRecord;

	@Column(name="OWNER_ADDR_CD")
	private BigInteger ownerAddrCd;

	@Column(name="OWNER_PHONE_NUM")
	private String ownerPhoneNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PASSPORT_EXPIRY_DT")
	private Date passportExpiryDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PASSPORT_ISSUE_DT")
	private Date passportIssueDt;

	@Column(name="PASSPORT_ISSUE_PLC")
	private String passportIssuePlc;

	@Column(name="PREV_NATIONALITY")
	private int prevNationality;

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

	@Column(name="REQUEST_STATUS")
	private String requestStatus;

	@Column(name="RUN_SRNO")
	private int runSrno;

	@Column(name="SCAN_DOC_UPLOAD")
	private String scanDocUpload;

	@Column(name="SR_TYPE_CD")
	private int srTypeCd;

	@Column(name="SR_YEAR")
	private int srYear;

	@Column(name="STATE_CD")
	private int stateCd;

	@Column(name="TRAVEL_TYPE")
	private String travelType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VISA_APPL_DT")
	private Date visaApplDt;

	@Column(name="VISA_CATEGORY")
	private String visaCategory;

	@Column(name="VISA_ENTRIES_CNT")
	private int visaEntriesCnt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VISA_EXPIRY_DT")
	private Date visaExpiryDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VISA_ISSUE_DT")
	private Date visaIssueDt;

	@Column(name="VISA_ISSUE_PLACE")
	private String visaIssuePlace;

	@Column(name="VISA_NUM")
	private String visaNum;

	@Column(name="VISA_PIO_CARD")
	private String visaPioCard;

	@Column(name="VISA_SPL_ENDORSEMENT")
	private String visaSplEndorsement;

	@Column(name="VISA_TYPE")
	private String visaType;

	@Column(name="VISIT_PURPOSE")
	private String visitPurpose;




}