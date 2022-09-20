package org.sdet40.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice2 {

	@Test
	public void test1() 
	{
		SoftAssert soft = new SoftAssert();
		String actual = "HiHello";
		String expected = "hii";
		Reporter.log("test1", true);
		soft.assertEquals(actual, expected);
		Reporter.log("test11", true);
		soft.assertTrue(1==4 && actual.contains(expected) && actual.equals(expected),
				"Verifying 1 with 4 and wheather actual contains expected");

		soft.assertAll();
		soft.assertEquals('A', 'B');
		Reporter.log("test12", true);	
	}
}