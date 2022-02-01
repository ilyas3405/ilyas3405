package com.ilinesoft.springboot.employee.employee.poc;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

@Component

// Spring jpa jars.
@Entity
@Table(name= "employee")

// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate

public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String work_location_city;
	private String technology;
	private String department;
	private double salary;
	private Date date_of_joining;

	public Employee() { }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//First Name
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	//Last Name
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	//Work location city
		public String getWorkLocationCity() {
			return work_location_city;
		}
		public void setWorkLocationCity(String work_location_city) {
			this.work_location_city = work_location_city;
		}
	//Technology
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	//Department 
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//Salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//Date of Joining
	public Date getDOJ() {
		return date_of_joining;
	}
	public void setDOJ(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", technology=" + technology + ", department=" + department + ", salary=" + salary + ", date_of_joining=" + date_of_joining + "]";
	}
}
