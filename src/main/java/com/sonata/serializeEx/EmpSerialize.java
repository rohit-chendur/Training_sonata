package com.sonata.serializeEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpSerialize {

	public static void main(String[] args) throws IOException {
		
		Employee obj = new Employee(123, "Sharan", "Basavanagudi");
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		Employee ob = null;
		//Serialization of the object and creating a file with that
		try {
			fos = new FileOutputStream("D:\\Employee.ser");
			
			oos = new ObjectOutputStream(fos);
				oos.writeObject(obj);
		} finally {
				fos.close();
				oos.close();
		}
		
		System.out.println("Serialization Done");
	
		//Desrialization of the employee object
		FileInputStream fis = new FileInputStream("D:\\Employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			ob = (Employee)ois.readObject();
			ois.close();
			fis.close();
		}catch (ClassNotFoundException s) {System.out.println(s);}
		System.out.println("Employee ID is " + ob.getEmpId());
		System.out.println("Employee Address is " + ob.getEmpAddr());
	}
	
	
	
	
	

}
