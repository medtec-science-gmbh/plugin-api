package de.customed.diag.shared.dto;

import java.util.Date;

/**
 * @author David Weisgerber
 *         Date: 1/13/14
 *         Time: 5:37 PM
 */
public class DeviceStartDTO {
	private long id;
	private Date startDate;
	private Date endDate;
	private Long plannedOrder;
	private long device;
	private Long evaluation;
	private Long patientVisit;
	private String additionalData;
	private String accessorySerial;
	private String accessoryAlternativeSerial;

	public DeviceStartDTO(long id, Date startDate, Date endDate, Long plannedOrder, long device, Long evaluation, Long patientVisit, String additionalData, String accessorySerial, String accessoryAlternativeSerial) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.plannedOrder = plannedOrder;
		this.device = device;
		this.evaluation = evaluation;
		this.patientVisit = patientVisit;
		this.additionalData = additionalData;
		this.accessorySerial = accessorySerial;
		this.accessoryAlternativeSerial = accessoryAlternativeSerial;
	}

	public DeviceStartDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getPlannedOrder() {
		return plannedOrder;
	}

	public void setPlannedOrder(Long plannedOrder) {
		this.plannedOrder = plannedOrder;
	}

	public long getDevice() {
		return device;
	}

	public void setDevice(long device) {
		this.device = device;
	}

	public Long getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Long evaluation) {
		this.evaluation = evaluation;
	}

	public Long getPatientVisit() {
		return patientVisit;
	}

	public void setPatientVisit(Long patientVisit) {
		this.patientVisit = patientVisit;
	}

	public String getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}

	public String getAccessorySerial() {
		return accessorySerial;
	}

	public void setAccessorySerial(String accessorySerial) {
		this.accessorySerial = accessorySerial;
	}

	public String getAccessoryAlternativeSerial() {
		return accessoryAlternativeSerial;
	}

	public void setAccessoryAlternativeSerial(String accessoryAlternativeSerial) {
		this.accessoryAlternativeSerial = accessoryAlternativeSerial;
	}
}
