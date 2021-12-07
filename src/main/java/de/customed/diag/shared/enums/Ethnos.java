package de.customed.diag.shared.enums;

public enum Ethnos {
	UNKNOWN (0),
	CAUCASIAN (1),
	AFRO_AMERICAN (2),
	LATIN_AMERICAN (3),
	ASIAN (4),
	SOUTH_EAST_ASIAN (5),
	NORTH_EAST_ASIAN (6),
	OTHER_MIXED (7);
	
	private final int integerValue;
	
	Ethnos (int integerValue) {
		this.integerValue = integerValue;
	}
	
	public int toInt() {
		return this.integerValue;
	}
	
	public static Ethnos fromInt(int integerValue) {
		for (Ethnos type : Ethnos.values()) {
			if (type.toInt() == integerValue) {
				return type;
			}
		}
		
		return UNKNOWN;
	}
}
