package com.hibernet.onetoone.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernet.onetoone.entities.Person;

public interface PersonRepositry extends JpaRepository<Person, Integer>{
	
	

}
