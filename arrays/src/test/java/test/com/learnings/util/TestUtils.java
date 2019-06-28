package test.com.learnings.util;

import org.junit.Assert;
import org.junit.Test;

import com.learnings.util.Utils;

public class TestUtils {

	Utils utils = new Utils();
	
	@Test
	public void gcd18And45() {
		Assert.assertEquals(9, utils.getGCD(18, 45));
	}
	
	@Test
	public void gcd50And100() {
		Assert.assertEquals(50, utils.getGCD(50, 100));
	}
	
	@Test
	public void gcd12And30() {
		Assert.assertEquals(6, utils.getGCD(12, 30));
	}
	
	@Test
	public void gcd1And7() {
		Assert.assertEquals(1, utils.getGCD(1, 7));
	}
	
	@Test
	public void gcd3And8() {
		Assert.assertEquals(1, utils.getGCD(3, 8));
	}
}
