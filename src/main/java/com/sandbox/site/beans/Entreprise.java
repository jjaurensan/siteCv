package com.sandbox.site.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity
public class Entreprise extends Entity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public Entreprise() {
	}

	/**
	 * @param name
	 * @param location
	 * @param webSite
	 */
	public Entreprise(String name, String location, String webSite) {
		super(name, location, webSite);
		// TODO Auto-generated constructor stub
	}
	
	
}
