package com.practise.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practise.entities.LoginData;
import com.practise.dao.*;

@RestController
public class MyController {
	
	@Autowired
	LoginDataRepository loginDataRepository;

@RequestMapping(value = "/about",method = RequestMethod.GET)	
public String about(Model model)
{
	System.out.println("inside about handler");
	model.addAttribute("name", "Juhi");
	model.addAttribute("currdate", new Date().toString());
	return "about";
	
}

@GetMapping("/forms")
public Iterable<LoginData> openForm() {
	
	 Iterable<LoginData> findAll = loginDataRepository.findAll();
	

	System.out.println(findAll);
		return findAll;
	
	
}

@GetMapping("/form/{username}")
public LoginData returnForm(@PathVariable("username") String username) {
	
	 LoginData findByName = loginDataRepository.findByUsername(username);
	

	System.out.println(findByName);
		return findByName;
	
	
}

@PostMapping("/form")
public LoginData returnLoginData(@RequestBody LoginData logindata) {
	
	LoginData save = loginDataRepository.save(logindata);
	

	//System.out.println(findByName);
		return save;
	
	
}

@PostMapping("/process")
public String processForm(@ModelAttribute("loginData") LoginData loginData)
{
	System.out.println(loginData);
	return "success";
}
}
