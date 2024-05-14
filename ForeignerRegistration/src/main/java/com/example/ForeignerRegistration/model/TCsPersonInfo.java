package com.example.ForeignerRegistration.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the t_cs_person_info database table.
 * 
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="t_cs_person_info")
@NamedQuery(name="TCsPersonInfo.findAll", query="SELECT t FROM TCsPersonInfo t")
public class TCsPersonInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCsPersonInfoPK id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumns({
			@JoinColumn(name = "FK_PERSON_CD",referencedColumnName = "PERSON_CODE"),
			@JoinColumn(name = "FK_PERSON_LANG_CD", referencedColumnName = "LANG_CD")
	})
	private List<TCsPersonAddress> foreignerAddr;

	private int age;

	@Column(name="AGE_FROM_YRS")
	private int ageFromYrs;

	@Column(name="AGE_MONTHS")
	private int ageMonths;

	@Column(name="AGE_PROOF_REQ")
	private String ageProofReq;

	@Column(name="AGE_TO_YRS")
	private int ageToYrs;

	private String alias1;

	private String alias2;

	@Column(name="ARMS_MISSING")
	private int armsMissing;

	@Column(name="BEARD_TYPE")
	private int beardType;

	@Column(name="BLOOD_GROUP_CD")
	private int bloodGroupCd;

	@Column(name="BOW_LEG")
	private int bowLeg;

	@Column(name="BUILD_TYPE")
	private int buildType;

	private int caste;

	private int category;

	@Column(name="CHEEK_TYPE")
	private int cheekType;

	@Column(name="CHIN_TYPE")
	private int chinType;

	@Column(name="COMPLEXION_TYPE")
	private int complexionType;

	@Column(name="DEAF_DUMB")
	private int deafDumb;

	private String dialects;

	@Column(name="DISTRICT_CD")
	private int districtCd;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;

	@Column(name="DRESS_ACCESSORY_BOT_CD")
	private int dressAccessoryBotCd;

	@Column(name="DRESS_ACCESSRY_TOP_CD")
	private int dressAccessryTopCd;

	@Column(name="DRESS_FOOTWEAR_CD")
	private int dressFootwearCd;

	@Column(name="DRESS_HABITS")
	private int dressHabits;

	@Column(name="DRESS_INNER_BOT_CD")
	private int dressInnerBotCd;

	@Column(name="DRESS_INNER_TOP_CD")
	private int dressInnerTopCd;

	@Column(name="DRESS_LOWER_COLOR_CD")
	private int dressLowerColorCd;

	@Column(name="DRESS_OUTER_BOT_CD")
	private int dressOuterBotCd;

	@Column(name="DRESS_OUTER_TOP_CD")
	private int dressOuterTopCd;

	@Column(name="DRESS_UPPER_COLOR_CD")
	private int dressUpperColorCd;

	@Column(name="DUMMY_COLUMN_1")
	private String dummyColumn1;

	@Column(name="DUMMY_COLUMN_2")
	private String dummyColumn2;

	@Column(name="EAR_LOBES")
	private int earLobes;

	@Column(name="EARS_DEFORMED")
	private int earsDeformed;

	@Column(name="EARS_MISSING")
	private int earsMissing;

	@Column(name="EDU_QUAL")
	private int eduQual;

	private String email;

	@Column(name="EYE_BLIND")
	private int eyeBlind;

	@Column(name="EYE_BLINKING")
	private int eyeBlinking;

	@Column(name="EYE_BROW_SHAPE")
	private int eyeBrowShape;

	@Column(name="EYE_BROW_THICKNESS")
	private int eyeBrowThickness;

	@Column(name="EYE_COLOR")
	private int eyeColor;

	@Column(name="EYE_SPECS_TYPE")
	private int eyeSpecsType;

	@Column(name="EYE_SQUINT")
	private int eyeSquint;

	@Column(name="EYE_TYPE")
	private int eyeType;

	@Column(name="EYE_USING_SPECS")
	private int eyeUsingSpecs;

	@Column(name="FACE_TYPE")
	private int faceType;

	@Column(name="FINGER_EXTRA")
	private int fingerExtra;

	@Column(name="FINGER_MISSING")
	private int fingerMissing;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="FOREHEAD_TYPE")
	private int foreheadType;

	@Column(name="FULL_NAME")
	private String fullName;

	private int gender;

	@Column(name="HABITS_CD")
	private int habitsCd;

	@Column(name="HAIR_COLOR")
	private int hairColor;

	@Column(name="HAIR_CUT")
	private int hairCut;

	@Column(name="HAIR_DYE")
	private int hairDye;

	@Column(name="HAIR_LENGTH")
	private int hairLength;

	@Column(name="HAIR_STRAIGHTNESS")
	private int hairStraightness;

	@Column(name="HAIR_STYLE")
	private int hairStyle;

	@Column(name="HAIR_TYPE")
	private int hairType;

	@Column(name="HEIGHT_FROM_CM")
	private String heightFromCm;

	@Column(name="HEIGHT_TO_CM")
	private String heightToCm;

	@Column(name="HUNCH_BACK")
	private int hunchBack;

	@Lob
	@Column(name="ID_PROOF")
	private byte[] idProof;

	@Column(name="INCOME_GROUP")
	private int incomeGroup;

	@Column(name="IS_FIRST_SYNC_DONE")
	private String isFirstSyncDone;

	@Column(name="IS_GOITRE")
	private int isGoitre;

	@Column(name="IS_POXPITTED")
	private int isPoxpitted;

	@Column(name="IS_USING_WIG")
	private int isUsingWig;

	@Column(name="KNOCK_KNEE")
	private int knockKnee;

	@Column(name="LANGUAGES_KNOWN")
	private String languagesKnown;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="LEGS_MISSING")
	private int legsMissing;

	private int limping;

	@Column(name="LIPS_TYPE")
	private int lipsType;

	@Column(name="LIVING_STATUS")
	private String livingStatus;

	@Column(name="MARITAL_STATUS")
	private String maritalStatus;

	@Column(name="MIDDLE_NAME")
	private String middleName;

	@Column(name="MOBILE_1")
	private BigInteger mobile1;

	@Column(name="MOBILE_2")
	private BigInteger mobile2;

	@Column(name="MOUSTACHES_TYPE")
	private int moustachesType;

	@Column(name="NATIONAL_ID_NUM")
	private String nationalIdNum;

	@Column(name="NATIONAL_ID_TYPE")
	private int nationalIdType;

	@Column(name="NATIONALITY_CD")
	private int nationalityCd;

	@Column(name="NOSE_TYPE")
	private int noseType;

	private int occupation;

	@Column(name="OFFICE_PHONE")
	private String officePhone;

	@Column(name="ORIGINAL_RECORD")
	private int originalRecord;

	@Column(name="OTH_IDENTITY_MARKS")
	private String othIdentityMarks;

	@Column(name="OTHER_ID_NAME")
	private String otherIdName;

	@Column(name="OTHER_ID_NUM")
	private String otherIdNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PASSPORT_ISSUE_DT")
	private Date passportIssueDt;

	@Column(name="PASSPORT_ISSUE_PLC")
	private String passportIssuePlc;

	@Column(name="PERSON_TYPE_CD")
	private int personTypeCd;

	@Column(name="PLACE_OF_BIRTH")
	private String placeOfBirth;

	@Column(name="PS_ID")
	private int psId;

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

	@Column(name="REG_YEAR")
	private int regYear;

	@Column(name="RELATIVE_ALIAS")
	private String relativeAlias;

	@Column(name="RELATIVE_NAME")
	private String relativeName;

	@Column(name="RELATIVE_TYPE")
	private int relativeType;

	private int religion;

	@Column(name="RUN_SRNO")
	private int runSrno;

	@Column(name="SPEAKS_PET_WORDS")
	private String speaksPetWords;

	@Column(name="STATE_CD")
	private int stateCd;

	@Column(name="TEETH_TYPE")
	private int teethType;

	private String telephone;

	@Column(name="TOE_EXTRA")
	private int toeExtra;

	@Column(name="TOE_MISSING")
	private int toeMissing;

	@Column(name="UID_NUM")
	private String uidNum;

	private int voice;

	@Column(name="WEIGHT_KG")
	private int weightKg;

	private int yob;



}