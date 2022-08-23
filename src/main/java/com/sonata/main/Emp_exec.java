package com.sonata.main;

import com.sonata.model.Employee;
import com.sonata.impl.Empl_Impl;

public class Emp_exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmpID(789);
		e1.setEmpName("Rohit");
		e1.setEmpSal(20000);
		
		Empl_Impl e2 = new Empl_Impl();
		System.out.println("Yearly salary: " + e2.yearlySal(e1));
		System.out.println("Appraisal salary: " + e2.apprSal(e1));
	}

}
