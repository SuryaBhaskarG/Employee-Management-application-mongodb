package com.surya;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}

	public Employee updateEmployee(String id, Employee employee) {
		
		if(employeeRepository.findById(id)!=null)
		{
			Employee e=new Employee();
			e.setId(e.getId());
			e.setFirstName(e.getFirstName());
			e.setLastName(e.getLastName());
			e.setEmailId(e.getEmailId());
			return employeeRepository.save(e);
		}
		return null;
	}
	
}
