package de.customed.diag.shared.dto;

import de.customed.common.BirthDate;
import de.customed.diag.evaluation.exportpool.ExportElement;
import de.customed.diag.evaluation.exportpool.ExportElementType;
import de.customed.diag.shared.enums.Ethnos;
import de.customed.diag.shared.enums.PatientVisitCreationType;
import de.customed.diag.shared.enums.PatientVisitInsuranceType;
import de.customed.diag.shared.enums.Sex;

import java.util.Date;
import java.util.UUID;

/**
 * @author David Weisgerber
 *         Date: 12/3/13
 *         Time: 9:45 AM
 */
public class PatientVisitDTO {
	private long id;
	private UUID guid;
	private String externalID;
	private String socialSecurityNumber;
	private String visitNumber;
	private String lastName;
	private String secondName;
	private String firstName;
	private String title;
	private String suffix;
	private BirthDate birthDate;
	private String mobilePhoneNumber;
	private String address;
	private String zip;
	private String town;
	private String region;
	private String country;
	private Double weight;
	private Double height;
	private Sex sex;
	private Ethnos ethnos;
	private String information;
	private PatientVisitCreationType creationType;
	private PatientVisitInsuranceType insuranceType;
	private String stationPointOfCare;
	private String stationRoom;
	private String stationBed;
	private String stationFacilityNamespaceID;
	private String stationFacilityUniversalID;
	private String stationFacilityUniversalIDType;
	private String stationLocationStatus;
	private String stationBuilding;
	private String stationFloor;
	private String stationLocationDescription;
	private boolean deleted;
	private Date modifiedDate;
	private Date dischargeDate;

	public PatientVisitDTO(long id, UUID guid, String externalID, String socialSecurityNumber, String visitNumber, String lastName, String secondName, String firstName, String title, String suffix, BirthDate birthDate, String mobilePhoneNumber, String address, String zip, String town, String region, String country, Double weight, Double height, Sex sex, Ethnos ethnos, String information, PatientVisitCreationType creationType, PatientVisitInsuranceType insuranceType, String stationPointOfCare, String stationRoom, String stationBed, String stationFacilityNamespaceID, String stationFacilityUniversalID, String stationFacilityUniversalIDType, String stationLocationStatus, String stationBuilding, String stationFloor, String stationLocationDescription, boolean deleted, Date modifiedDate, Date dischargeDate) {
		this.id = id;
		this.guid = guid;
		this.externalID = externalID;
		this.socialSecurityNumber = socialSecurityNumber;
		this.visitNumber = visitNumber;
		this.lastName = lastName;
		this.secondName = secondName;
		this.firstName = firstName;
		this.title = title;
		this.suffix = suffix;
		this.birthDate = birthDate;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.address = address;
		this.zip = zip;
		this.town = town;
		this.region = region;
		this.country = country;
		this.weight = weight;
		this.height = height;
		this.sex = sex;
		this.ethnos = ethnos;
		this.information = information;
		this.creationType = creationType;
		this.insuranceType = insuranceType;
		this.stationPointOfCare = stationPointOfCare;
		this.stationRoom = stationRoom;
		this.stationBed = stationBed;
		this.stationFacilityNamespaceID = stationFacilityNamespaceID;
		this.stationFacilityUniversalID = stationFacilityUniversalID;
		this.stationFacilityUniversalIDType = stationFacilityUniversalIDType;
		this.stationLocationStatus = stationLocationStatus;
		this.stationBuilding = stationBuilding;
		this.stationFloor = stationFloor;
		this.stationLocationDescription = stationLocationDescription;
		this.deleted = deleted;
		this.modifiedDate = modifiedDate;
		this.dischargeDate = dischargeDate;
	}

	public PatientVisitDTO() {
	}

	@ExportElement(key = "P_PRAXNUM", description = "External ID of patient", type = ExportElementType.GENERAL_DATA)
	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@ExportElement(key = "P_FALLID", description = "Visit number of patient", type = ExportElementType.GENERAL_DATA)
	public String getVisitNumber() {
		return visitNumber;
	}

	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}

	@ExportElement(key = "P_NAME", description = "Last name of patient", type = ExportElementType.GENERAL_DATA)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@ExportElement(key = "P_VNAME", description = "First name of patient", type = ExportElementType.GENERAL_DATA)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@ExportElement(key = "P_GEB", description = "Date of birth of patient", type = ExportElementType.GENERAL_DATA)
	public BirthDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Ethnos getEthnos() {
		return ethnos;
	}

	public void setEthnos(Ethnos ethnos) {
		this.ethnos = ethnos;
	}

	@ExportElement(key = "P_BEM", description = "Additional information of patient", type = ExportElementType.GENERAL_DATA)
	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public PatientVisitCreationType getCreationType() {
		return creationType;
	}

	public void setCreationType(PatientVisitCreationType creationType) {
		this.creationType = creationType;
	}

	public PatientVisitInsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(PatientVisitInsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getStationPointOfCare() {
		return stationPointOfCare;
	}

	public void setStationPointOfCare(String stationPointOfCare) {
		this.stationPointOfCare = stationPointOfCare;
	}

	public String getStationRoom() {
		return stationRoom;
	}

	public void setStationRoom(String stationRoom) {
		this.stationRoom = stationRoom;
	}

	public String getStationBed() {
		return stationBed;
	}

	public void setStationBed(String stationBed) {
		this.stationBed = stationBed;
	}

	public String getStationFacilityNamespaceID() {
		return stationFacilityNamespaceID;
	}

	public void setStationFacilityNamespaceID(String stationFacilityNamespaceID) {
		this.stationFacilityNamespaceID = stationFacilityNamespaceID;
	}

	public String getStationFacilityUniversalID() {
		return stationFacilityUniversalID;
	}

	public void setStationFacilityUniversalID(String stationFacilityUniversalID) {
		this.stationFacilityUniversalID = stationFacilityUniversalID;
	}

	public String getStationFacilityUniversalIDType() {
		return stationFacilityUniversalIDType;
	}

	public void setStationFacilityUniversalIDType(String stationFacilityUniversalIDType) {
		this.stationFacilityUniversalIDType = stationFacilityUniversalIDType;
	}

	public String getStationLocationStatus() {
		return stationLocationStatus;
	}

	public void setStationLocationStatus(String stationLocationStatus) {
		this.stationLocationStatus = stationLocationStatus;
	}

	public String getStationBuilding() {
		return stationBuilding;
	}

	public void setStationBuilding(String stationBuilding) {
		this.stationBuilding = stationBuilding;
	}

	public String getStationFloor() {
		return stationFloor;
	}

	public void setStationFloor(String stationFloor) {
		this.stationFloor = stationFloor;
	}

	public String getStationLocationDescription() {
		return stationLocationDescription;
	}

	public void setStationLocationDescription(String stationLocationDescription) {
		this.stationLocationDescription = stationLocationDescription;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@ExportElement(key = "P_DBNUM", description = "Internal database ID of patient", type = ExportElementType.GENERAL_DATA)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UUID getGuid() {
		return guid;
	}

	public void setGuid(UUID guid) {
		this.guid = guid;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Date getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
}
