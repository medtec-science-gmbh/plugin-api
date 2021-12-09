package de.customed.diag.shared.enums;

/**
 * The project types
 *
 * @author David Weisgerber (c) M&S GmbH
 */
public enum EvaluationType {
	UNKNOWN,
	ALL,
	RESTING_ECG,
	HOLTER,
	STRESS_ECG,
	REHAB,
	KYBE,
	BLOODPRESSURE,
	SPIROMETRY,
	ERGOSPIROMETRY,
    DIABETES,
	ABPM_STUDY,
	EXTERNAL;

	public String getEnglishName() {
		switch (this) {
			case RESTING_ECG:
				return "Resting ECG";
			case HOLTER:
				return "Holter";
			case STRESS_ECG:
				return "Stress ECG";
			case REHAB:
				return "Rehab";
			case KYBE:
				return "Telemedicine/Holter";
			case BLOODPRESSURE:
			case ABPM_STUDY:
				return "ABPM";
			case SPIROMETRY:
				return "Spirometry";
			case ERGOSPIROMETRY:
				return "Ergo Spirometry";
			case DIABETES:
				return "Diabetes";
			case EXTERNAL:
				return "External";
			default:
				return "Unknown";
		}
	}
}
