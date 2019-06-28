package com.learnings.arrays;

public class MaximumProfit {

	public int computeMaximumProfit(int[] sharePrices) {

		int minValueIndex = 0;
		int arrayLength = sharePrices.length;
		for(int i=1; i<arrayLength; i++) {
			if(sharePrices[minValueIndex] > sharePrices[i]) {
				minValueIndex = i;
			}
		}
		
		int minPrice = sharePrices[minValueIndex];
		int maximumProfit = 0;
		int currentProfit = 0;
		for(int i=minValueIndex+1; i<arrayLength; i++) {
			currentProfit = sharePrices[i] - minPrice;
			 if(currentProfit > maximumProfit) {
				 maximumProfit = currentProfit;
			 }
		}
		
		return maximumProfit;
	}
}
