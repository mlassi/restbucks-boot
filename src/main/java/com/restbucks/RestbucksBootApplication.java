package com.restbucks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.restbucks", "common"})
@EnableAutoConfiguration
public class RestbucksBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestbucksBootApplication.class, args);
	}
}
