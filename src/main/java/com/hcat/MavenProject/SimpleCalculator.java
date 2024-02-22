package com.hcat.MavenProject;

public class SimpleCalculator 
{
	public int add(int numberA, int numberB)
	{
		return numberA + numberB;
	}
	
	public int sub(int numberA, int numberB)
	{
		return numberA - numberB;
	}
	
	public int multiply(int numberA, int numberB)
	{
		return numberA * numberB;
	}

	public int divide(int numberA, int numberB)
	{
		if (numberB == 0)
		{
			throw new ArithmeticException("Division by zero");
		}
		return numberA / numberB;
	}
	
}

			