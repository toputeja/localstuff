package com.localstuff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.localstuff.dao")
public class LocalstuffApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalstuffApplication.class, args);
	}

}
