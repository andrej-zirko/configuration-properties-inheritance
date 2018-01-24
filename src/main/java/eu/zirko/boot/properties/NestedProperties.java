package eu.zirko.boot.properties;

public class NestedProperties extends InheritedProperties {
	private String nestedProperty;

	public String getNestedProperty() {
		return nestedProperty;
	}

	public void setNestedProperty(String nestedProperty) {
		this.nestedProperty = nestedProperty;
	}
}
