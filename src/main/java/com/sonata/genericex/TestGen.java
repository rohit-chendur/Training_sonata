package com.sonata.genericex;

import java.util.ArrayList;

public class TestGen {

	public static <E> void simpleArray(E[] elements) {
		for (E element:elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		EmpGen<Integer> gm = new EmpGen<Integer>();
		gm.display(12);
		
		EmpGen<String> gm1 = new EmpGen<String>();
		System.out.println(gm.get());
		Integer[] a1 = {10,20,30,40};
		simpleArray(a1);
	}
}
