package de.customed.diag.shared.dto;

import java.util.List;

/**
 * @author David Weisgerber
 *         Date: 12/3/13
 *         Time: 10:38 AM
 */
public class PatientQueryResponseDTO {
	private int totalCount;
	private List<PatientVisitSearchDTO> patients;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<PatientVisitSearchDTO> getPatients() {
		return patients;
	}

	public void setPatients(List<PatientVisitSearchDTO> patients) {
		this.patients = patients;
	}
}
