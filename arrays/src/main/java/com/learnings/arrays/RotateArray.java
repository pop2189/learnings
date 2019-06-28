package com.learnings.arrays;

import com.learnings.util.Utils;

public class RotateArray {

	private Utils utils = new Utils();
	
	public int[] rotateArrayUsingTempArray(int[] input, int shiftOrder) {
		int[] tempArray = new int[shiftOrder];
		int length = input.length;
		
		for(int i=0; i<shiftOrder; i++) {
			tempArray[i] = input[i];
		}
		
		for(int i=shiftOrder; i<length; i++) {
			input[i-shiftOrder] = input[i];
		}
		
		for(int i=length-shiftOrder, j=0; i<length; i++,j++) {
			input[i] = tempArray[j];
		}
		
		return input;
	}
	
	/**
	 * This method involves GCD calculation
	 * @param input
	 * @param shiftOrder
	 * @return rotatedArray by the shiftOrder
 	 */
	public int[] rotateArrayUsingJugglingAlgorithm(int[] input, int shiftOrder) {
		int length = input.length;
		int gcd = utils.getGCD(shiftOrder, length);
		int temp = 0;
		int currentIndex = -1;
		int nextIndex = -1;
		 
		for(int i=0; i<gcd; i++) {
			temp = input[i];
			currentIndex = i;
			while(true) {
				nextIndex = currentIndex + shiftOrder;
				if(nextIndex >= length) {
					nextIndex -= length;
				}
				if(nextIndex == i) {
					break;
				}
				input[currentIndex] = input[nextIndex];
				currentIndex = nextIndex;
			}
			input[currentIndex] = temp;
		}
		
		return input;
	}
}
