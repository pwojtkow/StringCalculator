package com.capgemini.stringCalculatorUser.test;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.stringCalculator.CalculatorUser;

public class CalculatorTest {
	
	@Test
	public void shouldReturnZeroInputNull() {
		// given
		String input = "";

		// when
		int result = CalculatorUser.count(input);

		// then
		Assert.assertEquals(0, result);
	}

	@Test
	public void shouldReturnZeroInputZero() {
		// given
		String input = "0";

		// when
		int result = CalculatorUser.count(input);

		// then
		Assert.assertEquals(0, result);
	}

	@Test
	public void shouldReturnOne() {
		// given
		String input = "1";

		// when
		int result = CalculatorUser.count(input);

		// then
		Assert.assertEquals(1, result);
	}

	@Test
	public void shouldReturnThree() {
		// given
		String input = "1+2";

		// when
		int result = CalculatorUser.count(input);

		// then
		Assert.assertEquals(3, result);
	}

	@Test
	// Not checking six, because factorial of 3 (3!) giving the same result as
	// 1+2+3
	public void shouldReturnSeven() {
		// given
		String input = "1+2+4";

		// when
		int result = CalculatorUser.count(input);

		// then
		Assert.assertEquals(7, result);
	}

	@Test
	public void shouldReturn15() {
		// given
		String input = "1+2+3+4+5";

		// when
		int result = CalculatorUser.count(input);

		// then
		Assert.assertEquals(15, result);
	}

	@Test
	public void shouldReturnMinusThree() {
		// given
		String input = "-3";

		// when
		int result = CalculatorUser.count(input);

		// then
		Assert.assertEquals(-3, result);
	}

	@Test
	public void shouldReturnMinusFive() {
		// given
		String input = "-1+(-4)";

		// when
		int result = CalculatorUser.count(input);

		// then
		Assert.assertEquals(-5, result);
	}
	
	@Test
	public void shouldReturnMinusSeven(){
		//given
		String input = "-2+(-1)+(-4)";
		
		//when
		int result = CalculatorUser.count(input);
		
		//then
		Assert.assertEquals(-7, result);
	}
}
