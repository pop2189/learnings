package com.harsh.arrays;

public class RotateArray {

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
		return new int[0];
	}
}
