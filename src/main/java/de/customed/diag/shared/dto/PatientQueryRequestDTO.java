package de.customed.diag.shared.dto;

import de.customed.common.BirthDate;

import java.util.Date;
import java.util.List;

/**
 * Query object for defining how to query a patient. Empty fields are not used for filtering.
 * @author David Weisgerber
 *         Date: 12/3/13
 *         Time: 10:33 AM
 */
public class PatientQueryRequestDTO {
	private String externalID;
	private String visitNumber;
	private String lastName;
	private String firstName;
	private BirthDate birthDate;
	private long groupID;
	private List<Long> doctorIDs;
	private List<String> doctorExternalIDs;
	private boolean groupOnExternalIDs;
	private String orderColumn;
	private boolean orderDescending;

	private Date createdAfter;
	private boolean adminQuery;

	private Integer offset;
	private Integer limit;
	private Long lastID;
	private Date dischargeDate;

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

	public BirthDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}

	public List<Long> getDoctorIDs() {
		return doctorIDs;
	}

	public void setDoctorIDs(List<Long> doctorIDs) {
		this.doctorIDs = doctorIDs;
	}

	public List<String> getDoctorExternalIDs() {
		return doctorExternalIDs;
	}

	public void setDoctorExternalIDs(List<String> doctorExternalIDs) {
		this.doctorExternalIDs = doctorExternalIDs;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Long getLastID() {
		return lastID;
	}

	public void setLastID(Long lastID) {
		this.lastID = lastID;
	}

	public boolean isGroupOnExternalIDs() {
		return groupOnExternalIDs;
	}

	public void setGroupOnExternalIDs(boolean groupOnExternalIDs) {
		this.groupOnExternalIDs = groupOnExternalIDs;
	}

	public String getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}

	public boolean isOrderDescending() {
		return orderDescending;
	}

	public void setOrderDescending(boolean orderDescending) {
		this.orderDescending = orderDescending;
	}

	public long getGroupID() {
		return groupID;
	}

	public void setGroupID(long groupID) {
		this.groupID = groupID;
	}

	public boolean isAdminQuery() {
		return adminQuery;
	}

	public void setAdminQuery(boolean adminQuery) {
		this.adminQuery = adminQuery;
	}

	public Date getCreatedAfter() {	return createdAfter; }

	public void setCreatedAfter(Date createdAfter) {this.createdAfter = createdAfter; }

	public Date getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
}
