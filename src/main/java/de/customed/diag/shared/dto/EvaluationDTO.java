package de.customed.diag.shared.dto;

import de.customed.diag.evaluation.exportpool.ExportElement;
import de.customed.diag.evaluation.exportpool.ExportElementType;
import de.customed.diag.shared.enums.DataTransferStatus;
import de.customed.diag.shared.enums.EvaluationType;

import java.util.Date;
import java.util.UUID;

/**
 * @author David Weisgerber
 *         Date: 1/7/14
 *         Time: 3:01 PM
 */
public class EvaluationDTO {
	private long id;
	private UUID guid;
	private long patient;
	private Long doctor;
	private Long order;
	private String user;
	private EvaluationType type;
	private Long subtype;
	private Date date;
	private DataTransferStatus dataTransferStatus;
	private boolean reported;
	private boolean prepared;
	private boolean printed;
	private boolean indelible;
	private boolean archived;
	private boolean deleted;
	private Date modifiedDate;
	private Date creationDate;

	public EvaluationDTO(long id, UUID guid, long patient, Long doctor, Long order, String user, EvaluationType type, Long subtype, Date date, DataTransferStatus dataTransferStatus, boolean reported, boolean prepared, boolean printed, boolean indelible, boolean archived, boolean deleted) {
		this.id = id;
		this.guid = guid;
		this.patient = patient;
		this.doctor = doctor;
		this.order = order;
		this.user = user;
		this.type = type;
		this.subtype = subtype;
		this.date = date;
		this.dataTransferStatus = dataTransferStatus;
		this.reported = reported;
		this.prepared = prepared;
		this.printed = printed;
		this.indelible = indelible;
		this.deleted = deleted;
		this.archived = archived;
	}

	public EvaluationDTO() {
	}

	@ExportElement(key = "EVAL_DBNUM", description = "Internal database ID of evaluation", type = ExportElementType.GENERAL_DATA)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPatient() {
		return patient;
	}

	public void setPatient(long patient) {
		this.patient = patient;
	}

	public Long getDoctor() {
		return doctor;
	}

	public void setDoctor(Long doctor) {
		this.doctor = doctor;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@ExportElement(key = "AKT_ART", description = "Type of evaluation", type = ExportElementType.GENERAL_DATA)
	public EvaluationType getType() {
		return type;
	}

	public void setType(EvaluationType type) {
		this.type = type;
	}

	public Long getSubtype() {
		return subtype;
	}

	public void setSubtype(Long subtype) {
		this.subtype = subtype;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DataTransferStatus getDataTransferStatus() {
		return dataTransferStatus;
	}

	public void setDataTransferStatus(DataTransferStatus dataTransferStatus) {
		this.dataTransferStatus = dataTransferStatus;
	}

	public boolean isPrepared() {
		return prepared;
	}

	public void setPrepared(boolean prepared) {
		this.prepared = prepared;
	}

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean printed) {
		this.printed = printed;
	}

	public boolean isIndelible() {
		return indelible;
	}

	public void setIndelible(boolean indelible) {
		this.indelible = indelible;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public UUID getGuid() {
		return guid;
	}

	public void setGuid(UUID guid) {
		this.guid = guid;
	}

	public boolean isReported() {
		return reported;
	}

	public void setReported(boolean reported) {
		this.reported = reported;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}
}
