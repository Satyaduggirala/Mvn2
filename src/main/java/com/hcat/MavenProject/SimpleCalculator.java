package com.hcat.MavenProject;

import java.util.ArrayList;
import java.util.List;

public class SimpleCalculator
{
	public int add(List<Integer> numberList)
	{
		int sum = 0;
		for (int num : numberList)
		{
			sum += num;
		}
		return sum;
	}
	
	public int sub(List<Integer> numberList)
	{
		int dif = 0;
		for (int num : numberList)
		{
			dif -= num;
		}
		return dif;
	}
	
	public int multiply(List<Integer> numberList)
	{
		int product = 1;
		for (int num : numberList)
		{
			product *= num;
		}
		return product;
	}

	public  List<Double> divide(List<Double> numbers, double divisor)
	{
		{
			List<Double> result = new ArrayList<>();
			for (double number : numbers)
			{
				if (divisor != 0)
				{
					result.add(number / divisor);
				}
				else
				{
					// Handle division by zero
					throw new ArithmeticException("Division by zero");
				}
			}
			return result;
		}
	}
}

			