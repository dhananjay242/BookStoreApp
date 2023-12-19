package com.jlcindia.bookstoreweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@SpringBootApplication
//@EnableSwagger2
public class BookStoreWebApplication implements WebMvcConfigurer {
	static Logger log = LoggerFactory.getLogger(BookStoreWebApplication.class);

	public static void main(String args[]) {
		log.info(" BookStoreWeb - Begin ");
		SpringApplication.run(BookStoreWebApplication.class, args);
		log.info(" BookStoreWeb - End ");
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

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/myjsps/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/");
		registry.addResourceHandler("/mycss/**").addResourceLocations("classpath:/METAINF/resources/mycss/");
	}

}