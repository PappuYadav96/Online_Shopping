package org.sdet40.practice;

import org.testng.annotations.Test;

public class TestNGTest1 {
@Test(invocationCount = 10)
	public void step1Test() {
	System.out.println("scrip1");
}
	@Test(priority = -1)
	public void step2Test() {
		System.out.println("script2");
	}
}
