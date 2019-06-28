package com.learnings.util;

public class Utils {

	public int getGCD(int numOne, int numTwo) {
		if(numTwo == 0)
			return numOne;
		else
			return getGCD(numTwo, numOne % numTwo);
	}
}

