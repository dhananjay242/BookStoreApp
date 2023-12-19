package com.jlcindia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import com.google.common.base.Predicates;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@SpringBootApplication
//@EnableSwagger2
public class BookPriceApplication implements WebMvcConfigurer {
	static Logger log = LoggerFactory.getLogger(BookPriceApplication.class);

	public static void main(String args[]) {
		log.info(" BookPriceMS - Begin ");
		SpringApplication.run(BookPriceApplication.class, args);
		log.info(" BookPriceMS - End ");
	}
	


//	private ApiInfo getApiDetails() {
//		return new ApiInfo("JLC BookStore- API", "BookPrice API - part of BookStore", "1.0", "Free to use ",
//				new Contact("Srinivas Dande", "https://www.jlcindia.com", "sri@jlcindia.com"), "API Under Free Licence",
//				"https://www.jlcindia.com");
//	}
//
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
//				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build()
//				.apiInfo(getApiDetails());
//	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//enabling swagger-ui 
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/METAINF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/");
	}

}