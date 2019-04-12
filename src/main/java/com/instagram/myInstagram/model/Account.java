package com.instagram.myInstagram.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Account {
	
	@Id	
	private String emailAddress;
	private String password;
	@OneToOne
	@JoinColumn(name="person_id")
	private Person person;
	
	public String getEmail() {
		return emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public Person getPerson() {
		return person;
	}
	public void setEmail(String email) {
		this.emailAddress = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
