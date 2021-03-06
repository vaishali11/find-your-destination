package com.fyd.hobohunt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FYDApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(FYDApplication.class, args);
	}
}
