package org.sdet40.practice;

import org.testng.annotations.Test;

public class Customer {
	@Test(priority=1)
	public void createCustomerTest() {
		System.out.println("execute HDFC createCustomerTest");
	}
		@Test(priority=2)
	public void modifyCustomerTest() {
		System.out.println("execute modify HDFC to AIRTEL CustomerTest");	
		}
		@Test(priority=3)
		public void deleteCustomerTest() {
			System.out.println("execute delete AIRTEL CustomerTest");
	}	
}
