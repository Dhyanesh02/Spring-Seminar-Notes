package com.dhyanesh.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Xml Working...!");
		/*
		 * Student student = new Student(); MathCheating cheat = new MathCheating();
		 * student.setMathcheating(cheat); student.setId(19); student.printid();
		 * student.cheating();
		 */
	
		
		Student student = context.getBean("student",Student.class);
		student.printid();
		student.cheating();
		
		AnotherStudent anotherstudent = context.getBean("anotherstudent",AnotherStudent.class);
		anotherstudent.cheating();
	}
}
