package com.sonata.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.sonata.collectex.ArrayListDemo;

public class ArrayListTest {

	@Test
	public void addtest() {
		ArrayListDemo arrobj1 = new ArrayListDemo();
		arrobj1.add(1);
		arrobj1.add(2);
		arrobj1.add(3);
		arrobj1.add(4);
		arrobj1.add(5);
		arrobj1.add(6);
		
		int size = arrobj1.getsize();
		System.out.println("Arraylist size: " + size);
		assertEquals(6,size);
	}
	
	
	@Test
	public void deletetest() {
		ArrayListDemo arrobj2 = new ArrayListDemo();
		arrobj2.add(1);
		arrobj2.add(2);
		arrobj2.add(3);
		arrobj2.delete(2);
		arrobj2.delete(1);
		
		int size = arrobj2.getsize();
		System.out.println("Arraylist size: " + size);
		assertEquals(1,size);
	}
	
	public static void main(String[] args) {
		
		
	}

}
