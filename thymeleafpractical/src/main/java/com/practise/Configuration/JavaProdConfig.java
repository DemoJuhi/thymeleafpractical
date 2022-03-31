package com.practise.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class JavaProdConfig {
	
	@Bean("mytest")
	public String test(@Value("${spring.message:Hello from JavaProdConfig}") String message)
	{
		return message;
		
	}

}
