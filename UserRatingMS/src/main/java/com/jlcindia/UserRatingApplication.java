package com.jlcindia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UserRatingApplication implements WebMvcConfigurer {
	static Logger log = LoggerFactory.getLogger(UserRatingApplication.class);

	public static void main(String args[]) {
		log.info(" UserRatingMS - Begin ");
		SpringApplication.run(UserRatingApplication.class, args);
		log.info(" UserRatingMS - End ");
	}

}