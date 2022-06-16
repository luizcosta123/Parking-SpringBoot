package com.project.parkingspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingSpringBootApplication.class, args);
	}

}
