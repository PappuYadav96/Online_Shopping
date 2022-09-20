package org.sdet40.practice;

import org.testng.annotations.Test;

public class testngpractice2 {
@Test(groups = "smoke")
	public void Teststep3test3() {
		System.out.println("step3");
	}
@Test(groups = {"smoke","sanity"})
public void testngstep4test() {
	System.out.println();
}
}
