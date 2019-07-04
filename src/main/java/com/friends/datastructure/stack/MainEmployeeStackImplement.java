package com.friends.datastructure.stack;

import java.util.Scanner;

public class MainEmployeeStackImplement {
	public static void main(String[] args) {
		
		Employee emp1= new Employee("Raj", "10001");
		Employee emp2= new Employee("Ajay", "10002");
		Employee emp3= new Employee("Vijay", "10003");

		EmployeeArrayStack stk = new EmployeeArrayStack(Employee.class);
		stk.push(emp1);
		stk.push(emp2);
		stk.push(emp3);
		
		System.out.println(stk.pop());
			 
	}

}