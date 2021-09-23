package com.project1.Project1Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Project1ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project1ServerApplication.class, args);
	}

}
