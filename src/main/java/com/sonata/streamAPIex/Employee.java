package com.sonata.streamAPIex;

public class Employee {
	private int empID;
	private String empName;
	private String dept;
	private double empSal;
	
	public Employee (int empId, String empName, String dept, double empSal) {
		this.empID = empId;
		this.empName = empName;
		this.dept = dept;
		this.empSal = empSal;
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	

}
