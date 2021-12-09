package de.customed.plugins.api;

import de.customed.diag.shared.dto.*;
import org.pf4j.ExtensionPoint;

import java.util.List;

public interface WorklistOrderQuery extends ExtensionPoint {

    WorklistOrderDTO query(EvaluationDTO evaluation, PatientVisitDTO patientVisit, DeviceDTO device, DeviceStartDTO deviceStart, List<PatientAttributeDTO> patientAttributes, List<EvaluationAttributeDTO> evaluationAttributes);

}
