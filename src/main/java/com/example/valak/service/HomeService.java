package com.example.valak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.valak.model.Registraton;
import com.example.valak.repositry.JpaRepo;

@Service
public class HomeService {
   
	
	@Autowired
	private JpaRepo repo;
	
	
	
/////find all list from id what we saving	
	public Iterable<Registraton>listAll(){
		return this.repo.findAll();
	}
	
	
	///////saving values to database
	
	public void save(Registraton home) {
		repo.save(home);
	}
	
	/////find saved values from id
	public Registraton getHomeById(int id) {
		return repo.findById(id).get();
	}
}
