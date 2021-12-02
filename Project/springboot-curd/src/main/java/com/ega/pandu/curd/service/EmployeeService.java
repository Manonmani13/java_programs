package com.ega.pandu.curd.service;

import java.util.List;

import com.ega.pandu.curd.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee,Long id);
	void deleteEmployee(long id);

}
