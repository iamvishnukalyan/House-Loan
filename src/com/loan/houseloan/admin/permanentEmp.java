package com.loan.houseloan.admin;

//derived class
public class permanentEmp extends EmployeesignIn {

	int exp;
	
	// default constructor
//	public permanentEmp() {
//		//super(100, "Tina");
//		System.out.println("Sub Class Default Constructor...");
//	}

	// Parameterized constructor
//	public permanentEmp(int exp) {
//		this();//will call the current class default constructor
//		this.exp = exp;
//		System.out.println("Sub Class Parameterized Constructor...");
//	}
	
	public static void main(String[] args) {
		permanentEmp pemp = new permanentEmp();
		pemp.Validatesignin();
		
	}
}
