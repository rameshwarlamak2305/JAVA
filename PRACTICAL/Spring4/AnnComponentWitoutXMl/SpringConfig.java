package com.springcore.SpringWithout;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.SpringWithout")
public class SpringConfig {
	@Bean
	public School school() {
		//Setting values
		/*
		 * School sc=new School( ); 
		 * sc.setPrincipal(principal()); 
		 * return sc;
		 */
		//Constructor call
		School sc=new School(principal());
		return sc;
	}
	
	
	@Bean
	public MathTeacher xyz() {
		return new MathTeacher();
	}
	@Bean
	public Principal principal() {
		
		return new Principal();
	}
	

	
}
