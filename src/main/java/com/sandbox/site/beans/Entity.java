package com.sandbox.site.beans;

abstract class Entity {
	private String name;
	private String location;
	private String webSite;
	
	public Entity() {
	}
	
	
	/**
	 * @param name
	 * @param location
	 * @param webSite
	 */
	public Entity(String name, String location, String webSite) {
		super();
		this.name = name;
		this.location = location;
		this.webSite = webSite;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	
	
}
