package com.fiap.exemploshift.exemploshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ExemploshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploshiftApplication.class, args);
	}
}
