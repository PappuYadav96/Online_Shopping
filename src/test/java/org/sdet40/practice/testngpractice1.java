package org.sdet40.practice;

import org.testng.annotations.Test;

public class testngpractice1 {
	@Test(groups = "smoke")
	public void teststep1test1() {
		System.out.println("test1");
	}
	@Test(groups = "sanity")
	public void teststep2test2() {
		System.out.println("test2");
		
	}
}
