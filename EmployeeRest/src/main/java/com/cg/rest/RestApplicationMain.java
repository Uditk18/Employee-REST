//Main method

package com.cg.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.rest.pojo.Employee;
import com.cg.rest.service.EmployeeService;

@SpringBootApplication // Calls IOC Container
/*
 * It is made up of 3 annotations 1. @ComponentScan 2. @Configuration
 * 3. @EnableAutoConfiguration
 */
public class RestApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(RestApplicationMain.class, args);
		/*
		 * This method do the following things 1. Sets up the default spring
		 * configuration 2. Starts the tomcat server 3. Performs the class path scan 4.
		 * Creates spring application context (like ApplicationContext in spring .xml
		 * file) 5. Contains all the annotations and beans
		 */

	}

	@Bean
	public CommandLineRunner loadData(EmployeeService service) {
		return (args) -> {
			service.addNewEmployee(new Employee("1001", "Udit"));
			service.addNewEmployee(new Employee("1002", "Alok"));
			service.addNewEmployee(new Employee("1003", "Rahul"));
			service.addNewEmployee(new Employee("1004", "Ripu"));

		};

	}

}
