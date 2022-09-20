package org.sdet40.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionPractice {
@Test
public void test1() {
	String actual = "Hello";
	String expected ="hiii";
	Assert.assertFalse(10!=11);
	//Assert.assertNotEquals(actual, expected);
}
}