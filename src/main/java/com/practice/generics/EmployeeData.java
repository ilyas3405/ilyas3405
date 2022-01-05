package com.practice.generics;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

	public List<Employee> createCompany() {

		Employee dev1 = new Employee("John", "Doe", Position.DEV, 110);
		dev1.setSkills("C#", "ASP.NET", "React", "AngularJS");
		Employee dev2 = new Employee("Peter", "Doe", Position.DEV, 120);
		dev2.setSkills("Java", "MongoDB", "Dropwizard", "Chef");
		Employee dev3 = new Employee("John", "Smith", Position.DEV, 115);
		dev3.setSkills("Java", "JSP", "GlassFish", "MySql");
		Employee dev4 = new Employee("Brad", "Johston", Position.DEV, 100);
		dev4.setSkills("C#", "MSSQL", "Entity Framework");
		Employee dev5 = new Employee("Philip", "Branson", Position.DEV, 140);
		dev5.setSkills("JavaScript", "React", "AngularJS", "NodeJS");
		Employee dev6 = new Employee("Nathaniel", "Barth", Position.DEV, 99);
		dev6.setSkills("Java", "Dropwizard");
		Employee qa1 = new Employee("Ronald", "Wynn", Position.QA, 100);
		qa1.setSkills("Selenium", "C#", "Java");
		Employee qa2 = new Employee("Erich", "Kohn", Position.QA, 105);
		qa2.setSkills("Selenium", "JavaScript", "Protractor");
		Employee devOps1 = new Employee("Harold", "Jess", Position.DEV_OPS, 116);
		devOps1.setSkills("CentOS", "bash", "c", "puppet", "chef", "Ansible");
		Employee devOps2 = new Employee("Karl", "Madsen", Position.DEV_OPS, 123);
		devOps2.setSkills("Ubuntu", "bash", "Python", "chef");

		return Arrays.asList(dev1, dev2, dev3, dev4, dev5, dev6, qa1, qa2, devOps1, devOps2);
	}
	
}
