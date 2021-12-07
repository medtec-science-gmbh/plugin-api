package de.customed.diag.shared.enums;

/**
 * Created with IntelliJ IDEA.
 * User: Bothmann
 * Date: 14.11.13
 * Time: 14:59
 */
public enum PatientVisitInsuranceType {
   	UNKNOWN,
	PRIVATE,  //!< Patient ist ein Privatpatient
	PUBLIC,  //!< Patient ist ein Krankenkassen-Patient
	PRIVATE_CHIEF,  //!< Patient ist ein Chefarztbehandlung-Patient mit Privat(versicherung)
	PUBLIC_CHIEF, //!< Patient ist ein Chefarztbehandlung-Patient mit Krankenkassen-Versicherung
	SELF_PAYER, //!< Patient ist ein Selbstzahler
}
