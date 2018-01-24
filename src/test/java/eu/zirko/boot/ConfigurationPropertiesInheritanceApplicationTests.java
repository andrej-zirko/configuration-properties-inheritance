package eu.zirko.boot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import eu.zirko.boot.properties.BaseProperties;
import eu.zirko.boot.properties.NestedProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationPropertiesInheritanceApplicationTests {
	@Autowired
	private BaseProperties baseProperties;
	
	@Test
	public void should_mapNestedAndInheritedProperty() {
		NestedProperties nestedProperties = baseProperties.getNestedProperties();
		
		assertThat(nestedProperties.getNestedProperty()).isEqualTo("dummyNestedValue");
		assertThat(nestedProperties.getInheritedProperty()).isEqualTo("dummyInheritedValue");
	}

}
