package com.sonata.streamAPIex;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {
	
	public static List<Employee>getEmployee() {
		List<Employee>list = new ArrayList();
		list.add(new Employee(123,"Rohan","Media",5000));
		list.add(new Employee(456,"Mahesh","IT",7000));
		list.add(new Employee(789,"Raman","Civil",3000));
		list.add(new Employee(159,"Gaurav","Defence",8000));
		list.add(new Employee(753,"Sheela","Social",6000));
		return list;
	}
}
