package com.practise.Configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration

@Profile (value={"default"})
public class JavaDefaultConfig {
	
	@Value("${spring.message:Hello from Spring Tool suite}") 
	String test;
	
	@Bean(name="mytest")
	public String test()
	{
		return test;
	}

}
