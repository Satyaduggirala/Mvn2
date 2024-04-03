package com.hcat.MavenProject;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleCalculatorTest extends TestCase {
	@Test
	public void testAdd() {
		SimpleCalculator sc = new SimpleCalculator();

		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);

		int result = sc.add(numbers);
		assertEquals(30, result);
	}

	public void testSub() {
		SimpleCalculator sc = new SimpleCalculator();
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);

		int result = sc.sub(numbers);
		assertEquals(-30, result);
	}

	public void testMultiply() {
		SimpleCalculator sc = new SimpleCalculator();
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);

		int result = sc.multiply(numbers);
		assertEquals(750, result);
	}

	public void testDivide() {
		SimpleCalculator sc = new SimpleCalculator();
		List<Double> numbers = new ArrayList<>();
		numbers.add(5.0);
		numbers.add(10.0);
		numbers.add(15.0);

		List<Double> result = sc.divide(numbers, 2.0);
		assertEquals(Arrays.asList(2.5,5.0,7.5), result);
	}
}

