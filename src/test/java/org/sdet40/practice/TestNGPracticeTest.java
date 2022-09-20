package org.sdet40.practice;

import org.testng.annotations.Test;

public class TestNGPracticeTest {
// if you are having more than 20 steps in tc--->storing all the testcases in module wise package --->className = testcasename, testAnotationMethodName = stepName
// if you are having 5 to 10 steps in tc ----> storing all the testcases in single package---->className = modulename, testAnotationMethodName = testcaseName	
	@Test
	public void step1Test() 
	{
	System.out.println("script1");
	}
	@Test
	public void step2Test()
	{
		System.out.println("script2");
	}
}
