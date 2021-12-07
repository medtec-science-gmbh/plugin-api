package de.customed.diag.shared.dto;

import de.customed.diag.shared.enums.DataTypes;

public class ConfigValueDTO {

	String name;
	String description;
	DataTypes type;
	String value;

	public ConfigValueDTO(String name, String description, DataTypes type, String value){
		this.name = name;
		this.description = description;
		this.type = type;
		this.value = value;
	}

	public ConfigValueDTO(String name, DataTypes type, String value){
		this.name = name;
		this.type = type;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DataTypes getType() {
		return type;
	}

	public void setType(DataTypes type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ConfigValueDTO{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", type=" + type + ", value='" + value + '\'' + '}';
	}
}
