package com.pc.cloud.businessTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BusinessOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessOneApplication.class, args);
	}
}
