package com.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringBootAzureDemoApplication {
	@GetMapping("/message")
	public String message()
	{
		return "Congrats Your first app is deployed";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureDemoApplication.class, args);
	}

}
