package com.dl.SpringBootRestTestConnections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan("com.dl")
public class SpringBootRestTestConnectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestTestConnectionsApplication.class, args);
	}

}


