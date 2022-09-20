package org.sdet40.practice;

import org.sdet40.genericUtility.BaseClass;
import org.testng.annotations.Test;

public class PracticeBaseClass extends  BaseClass

{
	@Test
	public void Testcase1() throws InterruptedException
	{
		loginPage.loginAction(username, password);
		adminCommonPage.subCategoryButton();
		subCategoryPage.Dropdown();
		subCategoryPage.subCategoryButton("white Shirts");
		
	}
}
