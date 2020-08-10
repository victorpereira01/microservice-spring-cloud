package com.victorpereira.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Microservices1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices1Application.class, args);
	}

}
