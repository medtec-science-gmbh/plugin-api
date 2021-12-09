package de.customed.diag.shared.enums;

/**
 * Created with IntelliJ IDEA.
 * User: Bothmann
 * Date: 14.11.13
 * Time: 15:47
 */
public enum OrderState {
    UNKNOWN,
	ACCEPTED,
    STARTED,
    FINISHED,
    COULD_NOT_BE_STARTED,
    MANUALLY_DELETED,
    ONLY_REQUESTED,
    RESET_MEASUREMENT,
    CANCELLED_BY_KIS,		// wird gesetzt wenn das KIS-System die Untersuchungsanforderung storniert
	UPDATED,
	EVALUATION_DELETED
}
