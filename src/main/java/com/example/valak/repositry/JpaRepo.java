package com.example.valak.repositry;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.valak.model.Registraton;

public interface JpaRepo extends JpaRepository<Registraton, Integer> {

}
