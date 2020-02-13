package com.sandbox.site.controleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sandbox.site.beans.Person;
import com.sandbox.site.service.PersonService;

@RestController
public class PersonController {

	private PersonService personService;
	
	@GetMapping(path = "/person/")
	public Iterable<Person> getAll(){
		return this.personService.getAll();
	}
//	
//	@GetMapping(path = "/person/{personName}")
//	public Iterable<Person> getByName(@PathVariable Name personName){
//		return this.personService.getByName(personName);
//	}
//	
	
	
}
