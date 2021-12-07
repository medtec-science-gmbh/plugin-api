package de.customed.diag.shared.dto;

import java.util.ArrayList;
import java.util.List;

public class PluginDTO {

	String id;
	String version;
	String description;
	String path;
	List<PluginExtensionDTO> extensions = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<PluginExtensionDTO> getExtensions() {
		return extensions;
	}

	public void setExtensions(List<PluginExtensionDTO> extensions) {
		this.extensions = extensions;
	}
}
