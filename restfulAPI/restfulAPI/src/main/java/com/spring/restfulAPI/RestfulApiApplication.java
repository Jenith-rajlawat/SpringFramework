package com.spring.restfulAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApiApplication.class, args);
	}

}

/*
* @SpringBootApplicaiton : @Configuration(Source of beans)+ @EnableAutoConfiguration(Adds beans to classpath setting)
* + @ComponentScan(Scans all the components form the root directory with the run class of Spring.)
* */
