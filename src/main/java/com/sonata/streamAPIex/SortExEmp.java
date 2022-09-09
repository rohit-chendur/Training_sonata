package com.sonata.streamAPIex;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1,Employee o2) {
		return (int)(o1.getEmpSal() - o2.getEmpSal()); //ascending order
	}
}
public class SortExEmp {
	
	public static void main(String[] args) {
		List<Employee> employee = DataBaseEmp.getEmployee();
		
		//traditional way
		Collections.sort(employee, new MyComparator());
		System.out.println(employee);
		
		//with lambda expression
		//()->{}
		
		Collections.sort(employee,(o1,o2)->(int)(o1.getEmpSal() - o2.getEmpSal()));
		System.out.println(employee);
		
		//using with streamAPI sort method
		
		employee
		.stream()
		.sorted((o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()))
		.forEach(System.out::println);
		//if want in descendign order, change o1 to o2
		
		//still more optimization can be done with the comparator call in sort method.
	}

}
