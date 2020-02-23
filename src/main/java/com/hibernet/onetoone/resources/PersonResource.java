package com.hibernet.onetoone.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernet.onetoone.entities.Address;
import com.hibernet.onetoone.entities.Person;
import com.hibernet.onetoone.repositry.PersonRepositry;

@RestController
@RequestMapping("/person")
public class PersonResource {
	
	@Autowired
	PersonRepositry personRepositry;
	
	@GetMapping("/message")
	public String message() {
		return "Mapping Success .............";
	}
	
	@GetMapping("/insertPerson")
	public Person insertPerson() {
		Person p=new Person();
		p.setName("Pintu Kumar");
		p.setMobileNo("8983847589");
		
		Address address=new Address();
		address.setAddressLine1("Usrawan");
		address.setCity("Sasaram");
		address.setCountry("India");
		p.setAddress(address);
		
		return personRepositry.save(p);
	}
	
	@GetMapping("/getPersons")
	public List<Person> getPerson(){
		return personRepositry.findAll();
	}

}
