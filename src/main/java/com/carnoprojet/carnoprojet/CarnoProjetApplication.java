package com.carnoprojet.carnoprojet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CarnoProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarnoProjetApplication.class, args);
	}
}
