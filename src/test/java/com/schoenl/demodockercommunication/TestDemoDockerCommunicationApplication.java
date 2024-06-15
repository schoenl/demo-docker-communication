package com.schoenl.demodockercommunication;

import org.springframework.boot.SpringApplication;

public class TestDemoDockerCommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoDockerCommunicationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
