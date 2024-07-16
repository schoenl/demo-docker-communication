package com.schoenl.demodockercommunication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfigProperties.class)
public class DemoDockerCommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerCommunicationApplication.class, args);
	}

}
