package eu.zirko.boot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="eu.zirko.boot")
public class BaseProperties {
	private NestedProperties nestedProperties;

	public NestedProperties getNestedProperties() {
		return nestedProperties;
	}

	public void setNestedProperties(NestedProperties nestedProperties) {
		this.nestedProperties = nestedProperties;
	}
}
