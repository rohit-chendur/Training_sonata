package com.sonata.model;

public class Employee {

	private int empID;
	private String empName;
	private double empSal;
	
	//Getter-setter methods
	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	
	//toString() method
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	
	//Main() method
	public static void main(String[] args) {
	}
}
