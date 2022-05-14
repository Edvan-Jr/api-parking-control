package com.eddev.apiparkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiParkingControlApplication.class, args);
	}

	@GetMapping("/")
	public String saudacao(){
		return "Olá, Mundo!";
	}
}
