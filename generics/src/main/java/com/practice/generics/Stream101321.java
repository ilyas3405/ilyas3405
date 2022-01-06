package com.practice.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.*;
import org.apache.commons.lang3.StringUtils;

public class Stream101321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeData employeeData = new EmployeeData();
		
		List<Employee> employees = employeeData.createCompany();
		
		Employee oneEmployee = employees.get(1);
		
		System.out.println(oneEmployee.toString());

		List<Employee> mathingemp = new ArrayList<Employee>();
		
	//	mathingemp = employees.stream().filter(e -> e.getFirstName().contains("John")).collect(Collectors.toList());
		
	//	List<Employee> unmodifylist = Collections.unmodifiableList(mathingemp);
		
		mathingemp.add(new Employee("Zakir","Hussain",Position.DEV_OPS,100));
		
		String somestring = null;
		
		//Recommended way of comparing strings. This will avoid null pointer exception if value not present
		if ("Line".equalsIgnoreCase(somestring)) {
			System.out.println("Matching string name");
		}
			else {
			System.out.println("Not matching");
		}
		
		if (StringUtils.isBlank(somestring)) {
			System.out.println("blank value in variable somestring");
			
		}
 		
	}

	// Countries // Cities // Population
	
}
