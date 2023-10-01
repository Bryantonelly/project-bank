package com.nttdata.escuela.java.projectbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProjectBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBankApplication.class, args);
	}

}
