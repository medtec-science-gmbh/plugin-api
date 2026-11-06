package de.customed.plugins.api;

import de.customed.diag.shared.dto.EvaluationDTO;
import de.customed.diag.shared.dto.PatientVisitDTO;
import de.customed.diag.shared.dto.WorklistOrderDTO;

/** Read-only server data available during a server export. */
public interface ServerExportContext {

    long getEvaluationId();

    String getWorkstationName();

    /** ID of the user who requested the export, or null for system exports. */
    Long getUserId();

    EvaluationDTO getEvaluation();

    PatientVisitDTO getPatient();

    /** The evaluation's order, or null if it has none. */
    WorklistOrderDTO getOrder();
}
