package com.instagram.myInstagram.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private String personId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;	
	@OneToOne
	private Account account;
	public String getPersonId() {
		return personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public Account getAccount() {
		return account;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
