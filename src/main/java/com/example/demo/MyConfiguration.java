package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
	
	  @Bean public Address addressValues() { Address add = new Address();
	  add.setArea("Shanthinagar"); add.setFlatnum(172); add.setZipcode(64468);
	  return add; }
	 

    @Bean
    @Scope("prototype")
    public Employee employeeValues() {
        Employee emp = new Employee();
        emp.setId(123);
        emp.setName("Anju");
        emp.setPhonenumber(6605281); // Assuming phoneNumber is a long, adjust accordingly
        return emp;
    }
}
