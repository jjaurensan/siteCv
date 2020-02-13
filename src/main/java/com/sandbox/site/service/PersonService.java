package com.sandbox.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandbox.site.beans.Person;
import com.sandbox.site.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Iterable<Person> getAll() {
		return this.personRepository.findAll();
	}

	
	
}
