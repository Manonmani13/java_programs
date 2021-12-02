package com.ega.pandu.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ega.pandu.curd.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
