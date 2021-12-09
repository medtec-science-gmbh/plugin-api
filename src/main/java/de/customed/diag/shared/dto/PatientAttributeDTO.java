package de.customed.diag.shared.dto;

import java.util.Date;

/**
 * @author David Weisgerber Date: 12/4/13 Time: 10:10 AM
 */
public class PatientAttributeDTO {
	private long patient;
	private String key;
	private String value;
	private Date modifiedDate;

	public PatientAttributeDTO(long patient, String key, String value, Date modifiedDate) {
		this.patient = patient;
		this.key = key;
		this.value = value;
		this.modifiedDate = modifiedDate;
	}

	public PatientAttributeDTO() {
	}

	public long getPatient() {
		return patient;
	}

	public void setPatient(long patient) {
		this.patient = patient;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "PatientAttributeDTO [patient=" + patient + ", key=" + key + ", value=" + value + ", modifiedDate=" + modifiedDate + "]";
	}

}
