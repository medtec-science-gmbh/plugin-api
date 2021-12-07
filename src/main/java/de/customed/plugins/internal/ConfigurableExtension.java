package de.customed.plugins.internal;

import de.customed.diag.shared.dto.ConfigValueDTO;
import de.customed.diag.shared.enums.DataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
* Extension class to allow Extensions to be configurable by PluginService.
 */
public class ConfigurableExtension {

	List<ConfigValueDTO> config = new ArrayList<>();
	{
		config.add(new ConfigValueDTO("debug", "Debug", DataTypes.BOOLEAN, "false"));
	}

	public ConfigurableExtension(ConfigValueDTO ... args){
		config.addAll(Arrays.asList(args));
	}

	public void setConfig(List<ConfigValueDTO> config) {
		this.config = config;
	}

	public List<ConfigValueDTO> getConfig() {
		return config;
	}

	public boolean isDebug(){
		Optional<ConfigValueDTO> debugConfig = config.stream().filter(c->c.getName().equals("debug")).findFirst();
		return debugConfig.isPresent() && debugConfig.get().getValue().equalsIgnoreCase("true");
	}

}
