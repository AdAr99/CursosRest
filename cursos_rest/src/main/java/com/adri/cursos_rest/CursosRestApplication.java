package com.adri.cursos_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.adri.model")
@EnableJpaRepositories(basePackages = "com.adri.dao")
@SpringBootApplication(scanBasePackages = {"com.adri.controller" , "com.adri.service"})
public class CursosRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosRestApplication.class, args);
	}

}
