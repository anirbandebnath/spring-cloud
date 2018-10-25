package com.example.myfirstmicroservice.springcloudconsulstudentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulStudentServiceApplication.class, args);
	}
}
