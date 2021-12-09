package de.customed.diag.shared.enums;

/**
 * @author David Weisgerber
 */
public enum DataTransferStatus {
	UNKNOWN, // Either status is not known or there is just not DFÜ in play
    SENT, // Evaluation was sent to "Reporting Service" or was copied to a friend for whatever reason. If there was no analysis (so that was the send reason) I should display a dialog telling me that
    RECEIVED_ANALYSIS, // Evaluation was received back from "Reporting Service". You can do everything with the evaluation what you want
    INCOMING, // The evaluation was received at the "Reporting Service" and shall be reported
    INCOMING_ANALYZED, // The evaluation was analyzed at the "Reporting Service" and can be sent back to the customer
    INCOMING_DOWNLOADED, // The evaluation was downloaded by the customer
	RECEIVED_AND_FINISHED, //Evaluation was received and set to finished whatever the customer defines as such
}
