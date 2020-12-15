package com.tavant.collection.dao;

import java.util.List;

import com.tavant.collection.models.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee emp);
	public Employee updateEmployee(String empId , Employee employee);
	public List<Employee> getEmployees();
	public Employee deleteEmploye(String empid);
	public Employee getEmployeeById(String empid);
	public boolean isExists(String empId);
}
