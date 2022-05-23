package com.atos;

import com.org.Employee;
import com.org.Manager;

public class InheritanceDemo {

	public static void main(String[] args) {
		// Employee emp1= new Employee(101,"Priya","Intern");
		// System.out.println(emp1);
		// Employee emp2 = new Employee(102,"Percy","Intern");
		// System.out.println(emp2);
		
		Manager mrg = new Manager(101,"priya","Junior developer",201);
		Manager mrg1 = new Manager (202,"SAM","Associate Consultant",301);
		System.out.println(mrg);
		System.out.println(mrg1);
		System.out.println("Welcome to Github");

	}

}
