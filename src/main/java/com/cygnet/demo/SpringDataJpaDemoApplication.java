package com.cygnet.demo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cygnet.demo.entity.Department;
import com.cygnet.demo.entity.Employee;
import com.cygnet.demo.repository.DepartmentRepository;
import com.cygnet.demo.repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaDemoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringDataJpaDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemoApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		log.info("Application context has been loaded succesfully.");

//		// Read and Create
		
//		Department dept = new Department("Development");
//		departmentRepository.save(dept);
		
//		Department department = departmentRepository.findByName("Development");
//		log.info("Persistence state entity:{}", department);
//
//		department.setName("Development1");
//		
//		Employee employee = new Employee("John Snow", "CA", department);
//		employeeRepository.save(employee);
//
//		// Read
//		List<Employee> employees = employeeRepository.findAll();
//		log.info("All the Employees:{}", employees);
//
//		// Read one
//		Optional<Employee> employee1 = employeeRepository.findById(25L);
//		log.info("Found employee by id:{}", employee1);
//
//		// Update
//		if (employee1.isPresent()) {
//			employee1.get().setCity("Vatican");
//			employeeRepository.save(employee1.get());
//		}

//		// Delete
//		Employee employeeToBeDeleted = new Employee();
//		employeeToBeDeleted.setId(25);
//		employeeRepository.delete(employeeToBeDeleted);

//		// Native query
		List<Employee> byDepartmentId = (List<Employee>) employeeRepository.findByEmpId(22L);
		log.info("Employees by id:{}", byDepartmentId);

	}

}
