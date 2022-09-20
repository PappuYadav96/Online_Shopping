package org.sdet40.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementation implements IRetryAnalyzer
{
	//IRetryAnalyzer is an inbuilt class in testng helps us to execute the failed testcases

	int count=0;
	int maxRetries =4;
	public boolean retry(ITestResult result)
	{
		if(count<maxRetries)
		{
			count++;
			return true;
		}
		return false;	
	}
}
