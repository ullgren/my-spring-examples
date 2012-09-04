package com.mycompany.myapp;

import java.util.Date;

public class Author {
	private int id;
	private String firstName;
	private String middleName;
	private String sirName;
	
	private String cMyName;
	
	public String getcMyName() {
		return cMyName;
	}
	
	public void setcMyName(String cMyName) {
		this.cMyName = cMyName;
	}
	
	
	private Date dateOfBirth;
	private Date dateOfDeath;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSirName() {
		return sirName;
	}
	public void setSirName(String sirName) {
		this.sirName = sirName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfDeath() {
		return dateOfDeath;
	}
	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}
	public boolean isAlive() {
		return (this.dateOfDeath==null);
	}
	
	
}
