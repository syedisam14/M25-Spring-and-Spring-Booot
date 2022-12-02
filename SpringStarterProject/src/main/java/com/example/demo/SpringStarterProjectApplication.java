package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterProjectApplication.class, args);
		
		
		/*int x=100;
		System.out.println("The value of x is: "+x);*/
		
		/*Employee e=new Employee();
		e.print();*/
		
		ConfigurableApplicationContext c=SpringApplication.run(SpringStarterProjectApplication.class, args);
		Student e=c.getBean(Student.class);
		e.print();
	}

}
