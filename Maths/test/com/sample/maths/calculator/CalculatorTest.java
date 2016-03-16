package com.sample.maths.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	/*
	 * Calculate squares of number like
	 * 1- 1*1=1
	 */
	@Test
	public void testSquares(){
		Calculator calc=new Calculator();
		assertEquals(calc.square(5),5*5);
		assertEquals(calc.square(25),25*25);
	}
	
	
}
