package com.duanying.access;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class CorsConfigurerAdapter extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		super.addCorsMappings(registry);
		//http://localhost:8080
		registry.addMapping("http://localhost:8080/*").allowedOrigins("*");
		
	}

	
	
}
