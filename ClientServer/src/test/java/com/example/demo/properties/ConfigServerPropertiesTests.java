package com.example.demo.properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigServerPropertiesTests {
	
	@Autowired
	private ConfigServerProperties configServerProperties;

	@Value("${app.env}")
	private String configEnv;
	
	@Test
	void getEnv_correct() {
		String env = configServerProperties.getEnv();
		Assertions.assertEquals(configEnv, env);
	}
}
