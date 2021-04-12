package com.hystrix.fallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FallBackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FallBackServiceApplication.class, args);
	}

}
