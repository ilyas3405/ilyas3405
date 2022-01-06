package com.practice.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Employee extends Object{


	private String firstName;
	private String lastName;
	private Position position;
	private List<String> skills;
	private int salarly;


	public Employee() {

	}
	

	public Employee(String firstName, String lastName, Position position, int salarly) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.salarly = salarly;
	}


	public List<String> getSkills() {
		return skills;
	}


	public void setSkills(String... skills) {
		//this.skills = Arrays.asList(skills);
		//this.skills = Arrays.asList(skills).stream().collect(Collectors.toList());
		//this.skills = Arrays.stream(skills).collect(Collectors.toList());
		//all of the above ways of creating a list out of arrays
		this.skills = Stream.of(skills).collect(Collectors.toList());
		
	}

	

	public String getName()
	{
		return this.firstName + " " + this.lastName;
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


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	public int getSalarly() {
		return salarly;
	}


	public void setSalarly(int salarly) {
		this.salarly = salarly;
	}


	@Override
	public String toString() {
		return String.format("Employee [firstName=%s, lastName=%s, position=%s, skills=%s, salarly=%s]", firstName,
				lastName, position, skills, salarly);
	}
	
	
	
}
