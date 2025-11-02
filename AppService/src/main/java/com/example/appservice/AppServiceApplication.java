package com.example.appservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppServiceApplication.class, args);
	}

}
