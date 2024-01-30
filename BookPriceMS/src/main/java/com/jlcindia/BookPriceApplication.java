package com.jlcindia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BookPriceApplication implements WebMvcConfigurer {
	static Logger log = LoggerFactory.getLogger(BookPriceApplication.class);

	public static void main(String args[]) {
		log.info(" BookPriceMS - Begin ");
		SpringApplication.run(BookPriceApplication.class, args);
		log.info(" BookPriceMS - End ");
	}

}