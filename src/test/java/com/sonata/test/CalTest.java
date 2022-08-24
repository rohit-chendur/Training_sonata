package com.sonata.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.sonata.dayfour.Calculator;

public class CalTest {
	Calculator c1 = new Calculator();
	
	@Test
	public void addTest() {
		assertEquals(4, c1.add(2, 2));
	}
	@Test
	public void divTest() {
		assertThrows(ArithmeticException.class,()->c1.divide(1,0),"it is an error");
	}
	
	
	
}