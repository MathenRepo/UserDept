package com.eureka.registryhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaregistryMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaregistryMsApplication.class, args);
	}

}
