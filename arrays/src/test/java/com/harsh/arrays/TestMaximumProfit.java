package com.harsh.arrays;

import org.junit.Assert;
import org.junit.Test;

import com.harsh.arrays.MaximumProfit;


public class TestMaximumProfit {

	private MaximumProfit maximumProfit = new MaximumProfit();
	
	@Test
	public void testComputeMaximumProfitOne() {
		int[] inputArray = {100, 110, 50, 75, 90, 100};
		Assert.assertEquals(50, maximumProfit.computeMaximumProfit(inputArray));
	}
	
	@Test
	public void testComputeMaximumProfitTwo() {
		int[] inputArray = {100, 110, 50, 40, 90, 100};
		Assert.assertEquals(60, maximumProfit.computeMaximumProfit(inputArray));
	}
	
	@Test
	public void testComputeMaximumProfitThree() {
		int[] inputArray = {120, 110, 50, 40, 30, 20};
		Assert.assertEquals(0, maximumProfit.computeMaximumProfit(inputArray));
	}
}
