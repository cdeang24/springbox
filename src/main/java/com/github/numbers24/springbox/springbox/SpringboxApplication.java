package com.github.numbers24.springbox.springbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboxApplication.class, args);
	}

}
