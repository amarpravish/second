package com.example.valak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.valak.model.Registraton;
import com.example.valak.service.HomeService;



@RestController
//@RequestMapping("/")
public class HomeController {
    @Autowired
	private HomeService service;
	
	@GetMapping("/get")
	public Iterable<Registraton> getHome() {
		return service.listAll();
	}

	////// save the values through postman
	@PostMapping("/save")
	private int saveHome(@RequestBody Registraton home) {
		service.save(home);
		return home.getStudentId();
		
	}	
}
