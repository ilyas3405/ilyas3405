package com.practice.generics;

import java.time.LocalDate;

public class Person {

	public Person(String name, LocalDate birthdate, Sex gender, String emailaddress) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.emailaddress = emailaddress;
	}

	String name;
	LocalDate birthdate;
	Sex gender;
	String emailaddress;
	
	public int getAge() {
		int age = 0;
		age = LocalDate.now().getDayOfYear() -  birthdate.getYear();
		return age;
	}
	
	public void printPerson() {
		System.out.println(name);
	}
	public enum Sex {
		MALE, FEMALE
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	
	

}

