package com.fabioferreira.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabioferreira.Employee.models.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}