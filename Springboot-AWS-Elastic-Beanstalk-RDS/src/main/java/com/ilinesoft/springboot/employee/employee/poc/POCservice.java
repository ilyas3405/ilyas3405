package com.ilinesoft.springboot.employee.employee.poc;

import java.util.List;
import java.util.Optional;


public interface POCservice {

	public List<Employee> getEmployees();
	public Optional<Employee> getEmployeeById(int empid);
	public Employee addNewEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public void deleteEmployeeById(int empid);
	public void deleteAllEmployees();
	
}
