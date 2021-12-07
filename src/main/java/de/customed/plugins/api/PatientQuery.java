package de.customed.plugins.api;

import de.customed.diag.shared.dto.PatientQueryRequestDTO;
import de.customed.diag.shared.dto.PatientVisitDTO;
import org.pf4j.ExtensionPoint;

import java.util.List;

public interface PatientQuery extends ExtensionPoint {

	List<PatientVisitDTO> query(PatientQueryRequestDTO query);
}
