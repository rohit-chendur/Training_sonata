package com.sonata.serializeEx;

public class Employee implements java.io.Serializable{
	private int empId;
	private String empName;
	private transient String empAddr;
	private static double empSal;
	
	public Employee(int empId, String empName, String empAddr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public static double getEmpSal() {
		return empSal;
	}

	public static void setEmpSal(double empSal) {
		Employee.empSal = empSal;
	}
	
}
