package com.example.Krishna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages="com")
@EnableJpaRepositories(basePackages="com")
@ComponentScan(basePackages="com")
public class KrishnaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KrishnaApplication.class, args);
	}

}
