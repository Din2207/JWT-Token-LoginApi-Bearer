package com.Dinesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SecurityConfig.class)
public class CrudExample6Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudExample6Application.class, args);
	}

}
