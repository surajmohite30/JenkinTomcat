package com.jenkins.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApplicationLuncher extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationLuncher.class, args);
		}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringBootApplicationLuncher.class);
	}
	
}
