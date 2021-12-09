package de.customed.diag.shared.dto;

/**
 * @author David Weisgerber
 *         Date: 1/7/14
 *         Time: 3:56 PM
 */
public class EvaluationAttributeDTO {
	private long evaluation;
	private String key;
	private String value;

	public EvaluationAttributeDTO(long evaluation, String key, String value) {
		this.evaluation = evaluation;
		this.key = key;
		this.value = value;
	}

	public EvaluationAttributeDTO() {
	}

	public long getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(long evaluation) {
		this.evaluation = evaluation;
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
}
