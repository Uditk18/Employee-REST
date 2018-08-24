package com.cg.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.pojo.Employee;
import com.cg.rest.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public List<Employee> viewAllEmployees() {
		return repo.findAll();
	}

	@Override
	public void addNewEmployee(Employee employee) {
		repo.save(employee);
	}

	
	public Employee getEmployeeById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void updateEmployee(Employee employee, int id) {
		repo.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}


}
