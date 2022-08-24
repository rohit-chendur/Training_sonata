package com.sonata.daythree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata.dayfour.Calculator;

@SpringBootTest
class TrainingSonataApplicationTests {
	
Calculator c1 = new Calculator();
	
	//@Test
	public void addTest() {
		assertEquals(4, c1.add(2, 2));
	}
	//@Test
	public void divTest() {
		assertThrows(ArithmeticException.class,()->c1.divide(1,0),"it is an error");
	}
	@Test
	void contextLoads() {
	}

}
