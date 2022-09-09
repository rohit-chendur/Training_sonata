package com.sonata.empMain;

import com.sonata.empDAO.EmpImpl;
import com.sonata.empBean.Employee;

public class EmpApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpID(156);
		e1.setEmpName("Ravinder");
		e1.setEmpSal(45682.54);
		
		EmpImpl ei = new EmpImpl();
		int a1 = ei.save(e1);
		System.out.println(a1);
		
		
//		List<Employee> e2 = ei.getData();
//		for(int i=0;i<e2.size();i++) {
//			System.out.println(e2.get(i).getEmpID());
//			System.out.println(e2.get(i).getEmpName());
//		}
	}

}
