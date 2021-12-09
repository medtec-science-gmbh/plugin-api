package de.customed.diag.shared.dto;

import de.customed.diag.evaluation.exportpool.ExportElement;
import de.customed.diag.evaluation.exportpool.ExportElementType;
import de.customed.diag.shared.enums.EvaluationType;
import de.customed.diag.shared.enums.OrderState;

import java.util.Date;
import java.util.UUID;

/**
 * @author David Weisgerber
 *         Date: 1/15/14
 *         Time: 9:13 AM
 */
public class WorklistOrderDTO {
	private long id;
	private UUID guid;
	private Long patientVisit;
	private String orderID;
	private String originalMessage;
	private String alternateOrderID;
	private String orderControlCodeReason;
	private Date orderStartDate;
	private Date orderFinishDate;
	private Date orderResetDate;
	private Date scheduledDate;
	private EvaluationType evaluationType;
	private Long evaluationSubtype;
	private OrderState status;
	private int priority;
	private String priorityDescription;
	private String freeText1;
	private String freeText2;
	private String location;
	private String serviceIdentifier;
	private String serviceIdentifierText;
	private String orderingFacilityName;
	private Long device;
	private Date modifiedDate;
	private String additionalData;
	private String workstationName;

	public WorklistOrderDTO(long id, UUID guid, Long patientVisit, String orderID, String originalMessage, String alternateOrderID, String orderControlCodeReason, Date orderStartDate, Date orderFinishDate, Date orderResetDate, Date scheduledDate, EvaluationType evaluationType, Long evaluationSubtype, OrderState status, int priority, String priorityDescription, String freeText1, String freeText2, String location, String serviceIdentifier, String serviceIdentifierText, String orderingFacilityName, Long device, Date modifiedDate, String additionalData, String workstationName) {
		this.id = id;
		this.guid = guid;
		this.patientVisit = patientVisit;
		this.orderID = orderID;
		this.originalMessage = originalMessage;
		this.alternateOrderID = alternateOrderID;
		this.orderControlCodeReason = orderControlCodeReason;
		this.orderStartDate = orderStartDate;
		this.orderFinishDate = orderFinishDate;
		this.orderResetDate = orderResetDate;
		this.scheduledDate = scheduledDate;
		this.evaluationType = evaluationType;
		this.evaluationSubtype = evaluationSubtype;
		this.status = status;
		this.priority = priority;
		this.priorityDescription = priorityDescription;
		this.freeText1 = freeText1;
		this.freeText2 = freeText2;
		this.location = location;
		this.serviceIdentifier = serviceIdentifier;
		this.serviceIdentifierText = serviceIdentifierText;
		this.orderingFacilityName = orderingFacilityName;
		this.device = device;
		this.modifiedDate = modifiedDate;
		this.additionalData = additionalData;
		this.workstationName = workstationName;
	}

	public WorklistOrderDTO() {
	}

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

	public Long getPatientVisit() {
		return patientVisit;
	}

	public void setPatientVisit(Long patientVisit) {
		this.patientVisit = patientVisit;
	}

	@ExportElement(key = "EVAL_ORDER", description = "Order ID of evaluation", type = ExportElementType.GENERAL_DATA)
	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOriginalMessage() {
		return originalMessage;
	}

	public void setOriginalMessage(String originalMessage) {
		this.originalMessage = originalMessage;
	}

	public Long getEvaluationSubtype() {
		return evaluationSubtype;
	}

	public void setEvaluationSubtype(Long evaluationSubtype) {
		this.evaluationSubtype = evaluationSubtype;
	}

	public String getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}

	public String getAlternateOrderID() {
		return alternateOrderID;
	}

	public void setAlternateOrderID(String alternateOrderID) {
		this.alternateOrderID = alternateOrderID;
	}

	public String getOrderControlCodeReason() {
		return orderControlCodeReason;
	}

	public void setOrderControlCodeReason(String orderControlCodeReason) {
		this.orderControlCodeReason = orderControlCodeReason;
	}

	public Date getOrderStartDate() {
		return orderStartDate;
	}

	public void setOrderStartDate(Date orderStartDate) {
		this.orderStartDate = orderStartDate;
	}

	public Date getOrderFinishDate() {
		return orderFinishDate;
	}

	public void setOrderFinishDate(Date orderFinishDate) {
		this.orderFinishDate = orderFinishDate;
	}

	public Date getOrderResetDate() {
		return orderResetDate;
	}

	public void setOrderResetDate(Date orderResetDate) {
		this.orderResetDate = orderResetDate;
	}

	public Date getScheduledDate() {
		return scheduledDate;
	}

	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public EvaluationType getEvaluationType() {
		return evaluationType;
	}

	public void setEvaluationType(EvaluationType evaluationType) {
		this.evaluationType = evaluationType;
	}

	public OrderState getStatus() {
		return status;
	}

	public void setStatus(OrderState status) {
		this.status = status;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getPriorityDescription() {
		return priorityDescription;
	}

	public void setPriorityDescription(String priorityDescription) {
		this.priorityDescription = priorityDescription;
	}

	public String getFreeText1() {
		return freeText1;
	}

	public void setFreeText1(String freeText1) {
		this.freeText1 = freeText1;
	}

	public String getFreeText2() {
		return freeText2;
	}

	public void setFreeText2(String freeText2) {
		this.freeText2 = freeText2;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getServiceIdentifier() {
		return serviceIdentifier;
	}

	public void setServiceIdentifier(String serviceIdentifier) {
		this.serviceIdentifier = serviceIdentifier;
	}

	public String getOrderingFacilityName() {
		return orderingFacilityName;
	}

	public void setOrderingFacilityName(String orderingFacilityName) {
		this.orderingFacilityName = orderingFacilityName;
	}

	public Long getDevice() {
		return device;
	}

	public void setDevice(Long device) {
		this.device = device;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getWorkstationName() {
		return workstationName;
	}

	public void setWorkstationName(String workstationName) {
		this.workstationName = workstationName;
	}

	public String getServiceIdentifierText() {
		return serviceIdentifierText;
	}

	public void setServiceIdentifierText(String serviceIdentifierText) {
		this.serviceIdentifierText = serviceIdentifierText;
	}
}
