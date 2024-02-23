package com.infsis.generico1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Generico1Application {

	public static void main(String[] args) {
		SpringApplication.run(Generico1Application.class, args);
	}

}
