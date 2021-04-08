package com.loan.houseloan.admin;

import java.util.Scanner;

import com.loan.houseloan.controller.UserValidation;
import com.loan.houseloan.doa.HouseLoanApplication;

///base class
public class EmployeesignIn {

	//default constructor
//	public EmployeesignIn() {
//		//super();
//		//Validatesignin();
//		//System.out.println("super class default constructor");
//	}
	
	// parameterized constructor
//	public EmployeesignIn(int empID, String empname) {
//		System.out.println("super class parameterized constructor");
//		//Validatesignin();
//	}
	
	// My Original Method
	public void Validatesignin() {
		Scanner sc = new Scanner(System.in);

		UserValidation usr = new UserValidation();
		HouseLoanApplication hsr = new HouseLoanApplication();

		System.out.println("*******************");
		System.out.println("Enter employee userID:");
		String userId = sc.nextLine();

		System.out.println("Enter employee Password:");
		String password = sc.nextLine();
//		int result = usr.signIn(userId, password);

		//EmployeesignIn emp = new EmployeesignIn();
		
		
		
		int result = (int) usr.signIn(userId, password);
		if (result == 1) {
			System.out.println("Welcome");
			System.out.println("Let's start the application process....");
			System.out.println("Here are the few questions with which we will evaluate");

			hsr.mainMethod();
		}
		sc.close();
	}
}
