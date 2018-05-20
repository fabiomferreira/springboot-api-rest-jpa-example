package com.fabioferreira.Employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabioferreira.Employee.models.Employee;
import com.fabioferreira.Employee.repository.EmployeeRepository;


@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee findOne(Long empid) {
		return employeeRepository.getOne(empid);
	}
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}

