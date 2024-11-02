package com.example.myServiceServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class MyServiceServerApplication {

	private static final Logger logger = LoggerFactory.getLogger(MyServiceServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyServiceServerApplication.class, args);
	}

}
