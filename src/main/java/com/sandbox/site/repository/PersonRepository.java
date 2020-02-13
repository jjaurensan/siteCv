package com.sandbox.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sandbox.site.beans.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
