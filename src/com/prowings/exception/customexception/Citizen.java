package com.prowings.exception.customexception;

public class Citizen {
	
	private int voterId;
	private String name; 
	private String country;
	private String age;

	public Citizen() {
		super();
	}

	public Citizen(int voterId, String name, String country, String age) {
		super();
		this.voterId = voterId;
		this.name = name;
		this.country = country;
		this.age = age;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Citizen [voterId=" + voterId + ", name=" + name + ", country=" + country + "]";
	}
	
}
