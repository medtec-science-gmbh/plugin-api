package de.customed.diag.shared.enums;

/**
 * Created with IntelliJ IDEA.
 * User: Bothmann
 * Date: 14.11.13
 * Time: 15:34
 * @deprecated HOLTER, BLOOD_PRESSURE, MULTIDAY_HOLTER, KYBE, GLUCOSE
 */
public enum DeviceType {
    UNKNOWN,
    /** Do not use for automatic device management*/
    HOLTER,
    /** Do not use for automatic device management*/
    BLOOD_PRESSURE,
    /** Do not use for automatic device management*/
    MULTIDAY_HOLTER,
    /** Do not use for automatic device management*/
    KYBE,
    /** Do not use for automatic device management*/
    GLUCOSE,

    COM_RF,
    GUARD,

    SPIROMETRY,

    SCREEN,

    FLASH,
    MS500,
    COR,
    EDAN,
    WATCH,

    CARDIO,
    CARD_M
}
