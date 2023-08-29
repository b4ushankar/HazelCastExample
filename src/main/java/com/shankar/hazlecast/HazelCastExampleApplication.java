package com.shankar.hazlecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HazelCastExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazelCastExampleApplication.class, args);
	}

}
