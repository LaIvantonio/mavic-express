package com.nuf_tech.mavic_express;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MavicExpressApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavicExpressApiApplication.class, args);
	}

}
