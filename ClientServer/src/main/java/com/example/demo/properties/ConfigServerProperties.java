package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "app")
public class ConfigServerProperties {
	private final String env;

	public ConfigServerProperties(String env) {
		this.env = env;
	}

	public String getEnv() {
		return env;
	}
}
