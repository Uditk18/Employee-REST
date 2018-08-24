package com.cg.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.pojo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
