package com.kazachenko.lansoft.lansofttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class LansoftTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LansoftTestApplication.class, args);
	}

}
