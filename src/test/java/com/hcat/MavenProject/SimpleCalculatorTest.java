package com.hcat.MavenProject;

import org.junit.Test;

import junit.framework.TestCase;

public class SimpleCalculatorTest extends TestCase
{
	@Test
	public void testAdd()
	{
		SimpleCalculator sc = new SimpleCalculator();
		
		int result = sc.add(5, 3);
		assertEquals(8,result);
	}
	
	public void testSub()
	{
		SimpleCalculator sc = new SimpleCalculator();
		
		int result = sc.sub(5, 3);
		assertEquals(2,result);
	}
	
	public void testMultiply()
	{
		SimpleCalculator sc = new SimpleCalculator();
		
		int result = sc.multiply(10, 3);
		assertEquals(30,result);
	}
	
	public void testDivide()
	{
		SimpleCalculator sc = new SimpleCalculator();
		
		int result = sc.divide(10, 2);
		assertEquals(5,result);
	}
	
	/* @Test
	    public void testDivisionByZero()
	 {
	        SimpleCalculator sc = new SimpleCalculator();
	        
	        // This test should throw an IllegalArgumentException
	        
	        assertThrows(IllegalArgumentException.class, () -> sc.divide(10, 0));
	 }*/
}

