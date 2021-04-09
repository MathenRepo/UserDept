package com.eureka.registryhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApiApplication.class, args);
	}

}
