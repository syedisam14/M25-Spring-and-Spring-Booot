package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	
	
	//private data members
		private int rollno;
		private String name;
		
		
		/*public int getRollno() {
			return rollno;
		}*/
		//DI using Setters
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		/*public String getName() {
			return name;
		}*/
		public void setName(String name) {
			this.name = name;
		}
		
		//user defined method
		public void print()
		{
			System.out.println("Welcome to M25 batch");
			
			
		}
		public Student() {
			super();
			System.out.println("Welcome To TNS INDIA Foundation!");
		}
		
		
		
		
		

}
