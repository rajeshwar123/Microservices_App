package com.nt.test.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix="userapp")
public class AppProperties {
	/*public AppProperties() {
		System.out.println("AppProperties.AppProperties()");
	}*/
	Map<String, String> messages = new HashMap<String, String>();

}
