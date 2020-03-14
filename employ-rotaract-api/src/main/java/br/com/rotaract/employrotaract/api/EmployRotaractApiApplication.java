package br.com.rotaract.employrotaract.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "br.com.rotaract.employrotaract")
@EnableMongoRepositories(basePackages = "br.com.rotaract.employrotaract")
public class EmployRotaractApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployRotaractApiApplication.class, args);
	}

}
