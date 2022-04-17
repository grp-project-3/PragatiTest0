package com.sample.FlightProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.controller","com.model","com.Dao"})
@EntityScan("com.model")
@EnableJpaRepositories({"com.Dao"})
public class FlightProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightProjectApplication.class, args);
	}

}
