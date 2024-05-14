package com.example.ForeignerRegistration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_cs_foreigner_travel_details database table.
 * 
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="t_cs_foreigner_travel_details")
@NamedQuery(name="TCsForeignerTravelDetail.findAll", query="SELECT t FROM TCsForeignerTravelDetail t")
public class TCsForeignerTravelDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCsForeignerTravelDetailPK id;

	@OneToOne(mappedBy = "travelDetail")
	private TCsForeignerRegistration foreignerNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ARRIVAL_DT")
	private Date arrivalDt;

	@Column(name="ARRIVAL_PLACE")
	private String arrivalPlace;

	@Column(name="DUMMY_COLUMN_1")
	private String dummyColumn1;

	@Column(name="DUMMY_COLUMN_2")
	private String dummyColumn2;



	@Column(name="INDIAN_ADDR_CD")
	private BigInteger indianAddrCd;

	@Column(name="INDIAN_PHONE_NUM")
	private String indianPhoneNum;

	@Column(name="IS_FIRST_SYNC_DONE")
	private String isFirstSyncDone;

	@Column(name="ORIGINAL_RECORD")
	private int originalRecord;

	@Column(name="OWNER_ADDR_CD")
	private BigInteger ownerAddrCd;

	@Column(name="OWNER_PHONE_NUM")
	private String ownerPhoneNum;

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

	@Column(name="TRAVEL_TYPE")
	private int travelType;

	@Column(name="VISIT_PURPOSE")
	private String visitPurpose;



}