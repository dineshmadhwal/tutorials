package com.baeldung.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.baeldung.spring.controller")
@Configuration
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter{
	
	 @Bean
	    public InternalResourceViewResolver jspViewResolver() {
	        InternalResourceViewResolver bean = new InternalResourceViewResolver();
	        bean.setPrefix("/WEB-INF/");
	        bean.setSuffix(".jsp");
	        return bean;
	    }
}
