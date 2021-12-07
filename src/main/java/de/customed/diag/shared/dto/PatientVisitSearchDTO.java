package de.customed.diag.shared.dto;

import de.customed.common.BirthDate;
import de.customed.diag.shared.enums.Sex;

import java.util.UUID;

/**
 * Short response object for queries on patients
 *
 * @author David Weisgerber
 *         Date: 12/3/13
 *         Time: 10:39 AM
 */
public class PatientVisitSearchDTO {
	private long id;
	private UUID guid;
	private String lastName;
	private String firstName;
	private String externalID;
	private String visitNumber;
	private BirthDate birthDate;
	private String mobilePhoneNumber;
	private Sex sex;

	public PatientVisitSearchDTO(long id, UUID guid, String lastName, String firstName, String externalID, String visitNumber, BirthDate birthDate, String mobilePhoneNumber, Sex sex) {
		this.id = id;
		this.guid = guid;
		this.lastName = lastName;
		this.firstName = firstName;
		this.externalID = externalID;
		this.visitNumber = visitNumber;
		this.birthDate = birthDate;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.sex = sex;
	}

	public PatientVisitSearchDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public String getVisitNumber() {
		return visitNumber;
	}

	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}

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

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public UUID getGuid() {
		return guid;
	}

	public void setGuid(UUID guid) {
		this.guid = guid;
	}
}
