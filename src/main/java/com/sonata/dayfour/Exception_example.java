package com.sonata.dayfour;

public class Exception_example {
	public void divide (int a,int b) {
		try {
			int c=a/b;
			System.out.println(c);
			int d[] = {1,2,3};
			System.out.println(d[2]);
		} catch (ArithmeticException e1) {
			System.out.println(e1);
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		finally {
			System.out.println("finally block");
		}
	}
	
	public void show( ) {
		System.out.println("this is my program");
	}
	
	public static void main(String[] args) {
		Exception_example e1 = new Exception_example();
		e1.divide(10, 10);
		e1.show();
	}

}
