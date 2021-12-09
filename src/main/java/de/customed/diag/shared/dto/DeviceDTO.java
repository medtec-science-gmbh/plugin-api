package de.customed.diag.shared.dto;

import de.customed.diag.shared.enums.DeviceState;
import de.customed.diag.shared.enums.DeviceType;
import de.customed.diag.shared.enums.EvaluationType;

/**
 * @author David Weisgerber
 *         Date: 1/13/14
 *         Time: 5:35 PM
 */
public class DeviceDTO {
	private long id;
	private String serial;
	private String alternativeSerial;
	private DeviceType type;
	private Long subType;
	private String additionalData;
	private String description;
	private DeviceState status;
	private EvaluationType evaluationType;
    private Long workstationId;

	public DeviceDTO(long id, String serial, String alternativeSerial, DeviceType type, Long subType, String additionalData, String description, DeviceState status, EvaluationType evaluationType, Long workstationId) {
        this.id = id;
        this.serial = serial;
        this.alternativeSerial = alternativeSerial;
        this.type = type;
        this.subType = subType;
        this.additionalData = additionalData;
        this.description = description;
        this.status = status;
        this.evaluationType = evaluationType;
        this.workstationId = workstationId;
    }

    public DeviceDTO(long id, String serial, String alternativeSerial, DeviceType type, long subType, String additionalData, String description, DeviceState status, EvaluationType evaluationType) {
        this.id = id;
        this.serial = serial;
        this.alternativeSerial = alternativeSerial;
        this.type = type;
        this.subType = subType;
        this.additionalData = additionalData;
        this.description = description;
        this.status = status;
        this.evaluationType = evaluationType;
        this.workstationId = null;
    }

    public DeviceDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public DeviceType getType() {
		return type;
	}

	public void setType(DeviceType type) {
		this.type = type;
	}

	public Long getSubType() {
		return subType;
	}

	public void setSubType(Long subType) {
		this.subType = subType;
	}

	public String getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DeviceState getStatus() {
		return status;
	}

	public void setStatus(DeviceState status) {
		this.status = status;
	}

	public EvaluationType getEvaluationType() {
		return evaluationType;
	}

	public void setEvaluationType(EvaluationType evaluationType) {
		this.evaluationType = evaluationType;
	}

	public String getAlternativeSerial() {
		return alternativeSerial;
	}

	public void setAlternativeSerial(String alternativeSerial) {
		this.alternativeSerial = alternativeSerial;
	}

    public Long getWorkstationId() {
        return workstationId;
    }

    public void setWorkstationId(Long workstationId) {
        this.workstationId = workstationId;
    }
}
