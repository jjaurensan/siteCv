package com.sandbox.site.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Date startDate;
	private Date endDate;
	
	@OneToOne
	private Entreprise entreprise;
	private String post;
	private String description;
	
	@ManyToOne
	private Person person;
	
	public Job() {}
	
	
	/**
	 * @param startDate
	 * @param endDate
	 * @param entreprise
	 * @param post
	 * @param description
	 */
	public Job(Date startDate, Date endDate, Entreprise entreprise, String post, String description) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.entreprise = entreprise;
		this.post = post;
		this.description = description;
	}


	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
