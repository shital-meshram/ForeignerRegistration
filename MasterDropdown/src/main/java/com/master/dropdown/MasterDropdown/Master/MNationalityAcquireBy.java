package com.master.dropdown.MasterDropdown.Master;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the m_nationality_acquire_by database table.
 * 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="m_nationality_acquire_by")
@NamedQuery(name="MNationalityAcquireBy.findAll", query="SELECT m FROM MNationalityAcquireBy m")
public class MNationalityAcquireBy implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MNationalityAcquireByPK id;

	@Column(name="DUMMY_COLUMN_1")
	private String dummyColumn1;

	@Column(name="DUMMY_COLUMN_2")
	private String dummyColumn2;

	@Column(name="IS_FIRST_SYNC_DONE")
	private String isFirstSyncDone;

	@Column(name="NATION_AQUR_BY")
	private String nationAqurBy;

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