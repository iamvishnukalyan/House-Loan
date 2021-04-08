package com.loan.houseloan.doa;

import java.util.Scanner;

import com.loan.houseloan.admin.EmployeesignIn;
//import com.loan.houseloan.controller.UserValidation;
import com.loan.houseloan.admin.permanentEmp;

public class UserGUI extends permanentEmp{
	
	UserGUI(){
		System.out.println("Happy Banking....!");
	}
	{
		System.out.println("*******************");
	}
	
	static {
		System.out.println("Welcome to our Bank");
	}
	
	public static void main(String[] args) {
		//new UserGUI();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------");
		
		System.out.println("Select the option");
		System.out.println("1. Sign in");
		System.out.println("*******************");
		System.out.println("Enter your choice:");
		int option = sc.nextInt();
		
		if(option==1) {
			System.out.println("Option 1 Selected(Sign in)");
			EmployeesignIn si = new EmployeesignIn();
			si.Validatesignin();
		}else if(option == 2) {
			System.out.println("Option doesn't exixts");
		}
		sc.close();
	}

}
