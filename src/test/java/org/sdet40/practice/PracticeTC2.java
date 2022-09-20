package org.sdet40.practice;
import org.sdet40.genericUtility.BaseClass;
import org.testng.annotations.Test;

public class PracticeTC2 extends  BaseClass

{
	@Test
	public void Testcase1() throws InterruptedException
	{

		userCommonPage.userLoginLogButton();
		userSignup.signIn(username, password);
	
	}
}
