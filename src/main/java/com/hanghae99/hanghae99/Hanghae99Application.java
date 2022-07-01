package com.hanghae99.hanghae99;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Hanghae99Application {

	public static void main(String[] args) {
		SpringApplication.run(Hanghae99Application.class, args);
	}

}
