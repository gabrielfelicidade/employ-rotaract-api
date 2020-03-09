package br.com.rotaract.employrotaract.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.rotaract.employrotaract")
public class EmployRotaractApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployRotaractApiApplication.class, args);
	}

}
