package de.customed.diag.shared.enums;

/**
 * Created with IntelliJ IDEA.
 * User: Bothmann
 * Date: 14.11.13
 * Time: 14:48
 */
public enum PatientVisitCreationType {
    UNKNOWN,
    USERINPUT,	//!< manuelle Stammdateneingabe
    IMPORT,	//!< importiert über die PraxisEDV-Schnittstelle
    INSERT_EVAL_WITH_PAT,	//!< importiert über einen DFÜ-Import
    MC3000_IMPORT,	//!< importiert über die MC3000-Schnittstelle
    HL7_IMPORT,	//!< importiert über die HL7-Schnittstelle
    CIPC_IMPORT,	//!< importiert über die CIPC-Schnittstelle
    DBSYNC,	//!< aufgenommen durch eine Dabenbanksynchronisation
    AUTO,	//!< automatischer Patient
    EXTDATA_IMPORT,	//!< importiert über die ExternData-Schnittstelle (z.B. SCP-Dateien)
    DB_TEST,	//!< durch interne Datenbanktest entstanden
    DICOM_WORKLIST_IMPORT,	//!< importiert über die DICOM-Worklist Import-Schnittstelle
    DUMMY_PATIENT_AUTO_REMOVE_EVAL, //!< der Patient ist der interne, nicht anzuzeigen Dummypatient dessen Auswertungen automatisch entfernt werden
    DUMMY_PATIENT_PERMANENT_EVAL, //!< der Patient ist der interne, nicht anzuzeigen Dummypatient dessen Auswertungen erhalten bleiben
    DATABASE_TEST_PAT, //!< ein Datenbank-Testpatient
    CREATE_BY_TOTALIMPORT, //!< Wurde durch einen Komplettimport eingelesen (Excel-import)
    UPDATE_BY_TOTALIMPORT, //!< Wurde durch einen Komplettimport geupdated (Excel-import)
	HL7_IMPORT_TEMP,	//!< importiert über die HL7-Schnittstelle (Vorhaltepatient) - Nach ablauf der Zeit, wird evtl. dieser wieder gelöscht

}
