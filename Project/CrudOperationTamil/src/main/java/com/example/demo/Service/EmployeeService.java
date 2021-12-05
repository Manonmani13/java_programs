package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Employee;


@Service
public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> create(Employee employee){
        if (employeeRepository.existsById(employee.getId())){
            return Optional.empty();
        }else{
            return Optional.of(employeeRepository.save(employee));
        }
    }

    public List<Employee> retrieve(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> retrieveOne(int empid){
        return employeeRepository.findById(empid);
    }
    
    public Optional<Employee> update(Employee employee){
        if (employeeRepository.existsById(employee.getId())){
            return Optional.of(employeeRepository.save(employee));
        }else{
            return Optional.empty();
        }
    }   

    public String delete(int empid){
        if (employeeRepository.existsById(empid)){
            employeeRepository.deleteById(empid);
            return empid + " deleted successfully!";
        }else{
            return "The employee data does not exist in records!";
        }
        
    }
}
