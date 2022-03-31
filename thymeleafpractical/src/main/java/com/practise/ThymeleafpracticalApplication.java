package com.practise;

import java.util.List;
import java.util.Optional;

import javax.persistence.Cacheable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practise.dao.LoginDataRepository;
import com.practise.entities.LoginData;

@SpringBootApplication
@EnableCaching
public class ThymeleafpracticalApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ThymeleafpracticalApplication.class, args);
		/*LoginDataRepository bean = context.getBean(LoginDataRepository.class);
	/*	Object bean = context.getBean("mytest");
		String s=(String) bean;
		System.out.println(s);*/
		/*LoginData login=new LoginData();
		login.setEmail("juhi12@gmail.com");
		login.setUsername("juhi12");
		
		LoginData login1=new LoginData();
		login1.setEmail("shubham12@gmail.com");
		login1.setUsername("shubham12");
		
		LoginData login2=new LoginData();
		login2.setEmail("juhi@gmail.com");
		login2.setUsername("juhi");
		
		LoginData login3=new LoginData();
		login3.setEmail("shubham@gmail.com");
		login3.setUsername("shubham");
		
		List<LoginData> list=List.of(login,login1,login3);
		Iterable<LoginData> saveAll = bean.saveAll(list);
		saveAll.forEach(s->System.out.println(s));*/
		/*Optional<LoginData> findById = bean.findById(48);
		LoginData loginData = findById.get();
	
		System.out.println(loginData);
		
		Optional<LoginData> findById1 = bean.findById(48);
		LoginData loginData1 = findById1.get();
		System.out.println(loginData1);*/
		
		
		
		
	}

}
