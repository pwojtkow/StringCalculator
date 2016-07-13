package com.capgemini.stringCalculator;

public class CalculatorUser implements Calculator{

	public static int count(String input) {
		if (input.isEmpty() || input==null)
			return 0;
		String[] values = input.replace("(", "").replace(")", "").split("\\+");
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			result += Integer.parseInt(values[i]);
		}
		return result;

	}

	
}
