package com.pc.cloud.businessTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BusinessTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessTwoApplication.class, args);
	}
}
