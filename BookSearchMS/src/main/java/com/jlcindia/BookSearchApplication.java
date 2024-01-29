package com.jlcindia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@SpringBootApplication
//@EnableSwagger2
@EnableFeignClients 
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class BookSearchApplication implements WebMvcConfigurer {
	static Logger log = LoggerFactory.getLogger(BookSearchApplication.class);

	public static void main(String args[]) {
		log.info(" BookSearchMS - Begin "); 
		 SpringApplication.run(BookSearchApplication.class, args); 
		 log.info(" BookSearchMS - End "); 
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
	registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/METAINF/resources/"); 
	registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/"); 
	} 

}