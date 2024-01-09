package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowiredApplication {

	public static void main(String[] args) {
		ApplicationContext context =	SpringApplication.run(AutowiredApplication.class, args);
		
		  Object obj = context.getBean("employeeValues", Employee.class); 
		  Employee emp = (Employee)obj;
		  System.out.println(emp.getId()); System.out.println(emp.getName());
		  System.out.println(emp.getPhonenumber());
		  System.out.println(emp.getAddress().getArea());
			
			  System.out.println(emp.getAddress().getFlatnum());
			  System.out.println(emp.getAddress().getZipcode());
			  
			  Object obj1 = context.getBean("employeeValues", Employee.class); 	 
		 Employee emp2 = (Employee)obj1;
		 System.out.println(emp2.getId()); System.out.println(emp.getName());
		  System.out.println(emp2.getPhonenumber());
		  System.out.println(emp2.getAddress().getArea());
			
			  System.out.println(emp2.getAddress().getFlatnum());
			  System.out.println(emp2.getAddress().getZipcode());

	    
	    
	}

}
