package de.customed.diag.shared.dto;

import java.util.ArrayList;
import java.util.List;

public class PluginExtensionDTO {

	String name;
	boolean configurable;
	List<ConfigValueDTO> configuration = new ArrayList<>();

	public PluginExtensionDTO(String name, boolean configurable){
		this.name = name;
		this.configurable = configurable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isConfigurable() {
		return configurable;
	}

	public void setConfigurable(boolean configurable) {
		this.configurable = configurable;
	}

	public List<ConfigValueDTO> getConfiguration() {
		return configuration;
	}

	public void setConfiguration(List<ConfigValueDTO> configuration) {
		this.configuration = configuration;
	}
}
