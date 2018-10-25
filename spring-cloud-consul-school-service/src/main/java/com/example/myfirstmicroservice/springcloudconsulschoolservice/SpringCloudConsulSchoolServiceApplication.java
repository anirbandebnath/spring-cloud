package com.example.myfirstmicroservice.springcloudconsulschoolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulSchoolServiceApplication.class, args);
	}
}
