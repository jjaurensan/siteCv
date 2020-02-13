package com.sandbox.site.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String firstName;
	private String lastName;

	private Date birth;

	@OneToMany(mappedBy = "person")
	private List<Skill> skills;

	@OneToMany(mappedBy = "person")
	private List<Job> jobs;

	@OneToMany(mappedBy = "person")
	private List<Diploma> diplomas;

	@OneToMany(mappedBy = "person")
	private List<Certification> certifications;

	@OneToMany(mappedBy = "person")
	private List<Diverse> diverses;

	@OneToMany(mappedBy = "person")
	private List<Project> projects;

	public Person() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public List<Job> getJobs() {
		return jobs;
	}
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	public List<Diploma> getDiplomas() {
		return diplomas;
	}
	public void setDiplomas(List<Diploma> diplomas) {
		this.diplomas = diplomas;
	}
	public List<Certification> getCertifications() {
		return certifications;
	}
	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}
	public List<Diverse> getDiverses() {
		return diverses;
	}
	public void setDiverses(List<Diverse> diverses) {
		this.diverses = diverses;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	

}
