package com.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootMongodbApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.deleteAll();

		Employee emp1 = new Employee(1, "Narayana", 75000d);
		Employee emp2 = new Employee(2, "Venkat", 72000d);
		Employee emp3 = new Employee(3, "Reddy", 50000d);

		List<Employee> empList = new ArrayList<>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		employeeRepository.saveAll(empList);

		/*
		 * employeeRepository.save(emp1); employeeRepository.save(emp2);
		 * employeeRepository.save(emp3);
		 */
	}

}
