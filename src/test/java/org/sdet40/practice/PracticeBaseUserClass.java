package org.sdet40.practice;

import org.sdet40.genericUtility.BaseClass;
import org.testng.annotations.Test;

public class PracticeBaseUserClass extends  BaseClass

{
	@Test
	public void Testcase1() throws InterruptedException
	{
		
		userCommonPage.userLoginLogButton();
		userAccountCreate.UserSignup("Ram", "ram11@123gmail.com", "7389379150", "ram123", "ram123");
		
	}
}
