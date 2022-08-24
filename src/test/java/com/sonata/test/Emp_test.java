
package com.sonata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sonata.impl.Empl_Impl;
import com.sonata.model.Employee;

public class Emp_test {

	Employee e1 = new Employee();
	Empl_Impl e2 = new Empl_Impl();

	@Test
	public void ySalTest() {
		e1.setEmpSal(20000);
		assertEquals(240000.0, e2.yearlySal(e1));
	}
	
	
	@Test
	public void WithdrawTest() {
		e1.setEmpSal(20000);
		assertEquals(1000.0, e2.apprSal(e1));
	}
	
}



//e2.yearlySal(e1.setEmpSal(10))