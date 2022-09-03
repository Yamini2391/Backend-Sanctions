package com.Sanctions;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Sanctions.repository.TransactionRepository;

@SpringBootApplication
public class SanctionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanctionsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(TransactionRepository transactionRepository) {
		return (args) -> {
			transactionRepository.sanctiontransactions();
		};
	}
}
