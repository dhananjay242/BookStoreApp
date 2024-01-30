package com.jlcindia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableFeignClients
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class BookSearchApplication implements WebMvcConfigurer {
	static Logger log = LoggerFactory.getLogger(BookSearchApplication.class);

	public static void main(String args[]) {
		log.info(" BookSearchMS - Begin ");
		SpringApplication.run(BookSearchApplication.class, args);
		log.info(" BookSearchMS - End ");
	}

}