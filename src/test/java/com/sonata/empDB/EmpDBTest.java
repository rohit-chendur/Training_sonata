package com.sonata.empDB;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sonata.empDAO.EmpImpl;
import com.sonata.empBean.Employee;

public class EmpDBTest {
	Employee e1 = new Employee();
	EmpImpl e2 = new EmpImpl();
	
	@Test
	public void execPositiveTest() {
		e1.setEmpID(541);
		e1.setEmpName("Rajesh");
		e1.setEmpSal(38782.54);
		int row = e2.save(e1);
		assertEquals(1, row );
	}
	
	@Test
	public void execNegativeTest() {
		e1.setEmpID(754);
		e1.setEmpName("Ramesh");
		e1.setEmpSal(35452.54);
		int row = e2.save(e1);
		assertEquals(0,row);
	}
	
}
