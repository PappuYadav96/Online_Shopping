package org.sdet40.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionPractice1{
	
	@Test
	public void test1() {
	String actual = "Hello";
	String expected = "hii";
	Reporter.log("test1", true);
	
	Assert.assertEquals(actual, expected);
	Reporter.log("test11",true);
	Reporter.log(expected);
	}
	@Test
	public void test2() {
		Reporter.log("test2", true);
	}	
}
