package eu.zirko.boot;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import eu.zirko.boot.properties.BaseProperties;

@Configuration
@EnableConfigurationProperties(BaseProperties.class)
public class PropertiesConfiguration {
}
