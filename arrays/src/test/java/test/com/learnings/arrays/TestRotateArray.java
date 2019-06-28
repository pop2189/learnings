package test.com.learnings.arrays;

import org.junit.Assert;
import org.junit.Test;

import com.learnings.arrays.RotateArray;

public class TestRotateArray {

	private RotateArray rotateArray = new RotateArray();
	
	@Test
	public void testRotateArrayUsingTempArrayBy2() {
		int[] input = {1,2,3,4,5,6,7};
		int[] expectedOutPut = {3,4,5,6,7,1,2};
		Assert.assertArrayEquals(expectedOutPut, rotateArray.rotateArrayUsingTempArray(input, 2));
	}
	
	@Test
	public void testRotateArrayUsingTempArrayBy3() {
		int[] input = {1,2,3,4,5,6,7};
		int[] expectedOutPut = {4,5,6,7,1,2,3};
		Assert.assertArrayEquals(expectedOutPut, rotateArray.rotateArrayUsingTempArray(input, 3));
	}
	
	@Test
	public void testRotateArrayUsingTempArrayBy10() {
		int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int[] expectedOutPut = {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,1,2,3,4,5,6,7,8,9,10};
		Assert.assertArrayEquals(expectedOutPut, rotateArray.rotateArrayUsingTempArray(input, 10));
	}
}
