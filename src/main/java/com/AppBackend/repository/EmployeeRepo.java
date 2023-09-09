package com.AppBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AppBackend.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
