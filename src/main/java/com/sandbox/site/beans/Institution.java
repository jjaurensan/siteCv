package com.sandbox.site.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity
public class Institution extends Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public Institution() {
		// TODO Auto-generated constructor stub
	}

	public Institution(String name, String location, String webSite) {
		super(name, location, webSite);
		// TODO Auto-generated constructor stub
	}

}
