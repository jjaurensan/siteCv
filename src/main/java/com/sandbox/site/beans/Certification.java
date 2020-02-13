package com.sandbox.site.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Certification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Date obtained;
	//private Institution institution;
	private String title;
	private String description;
	
	@ManyToOne(targetEntity = Person.class)
	private Person person;
	
	public Certification() {
		// TODO Auto-generated constructor stub
	}
	
	public Date getObtained() {
		return obtained;
	}
	public void setObtained(Date obtained) {
		this.obtained = obtained;
	}
//	public Institution getInstitution() {
//		return institution;
//	}
//	public void setInstitution(Institution institution) {
//		this.institution = institution;
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
