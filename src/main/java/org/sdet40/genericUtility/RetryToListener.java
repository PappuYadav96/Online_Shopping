package org.sdet40.genericUtility;

import java.lang.reflect.Constructor;

import org.testng.annotations.ITestAnnotation;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class RetryToListener {

	
	
public void transform(ITestAnnotation annotation ,@SuppressWarnings("rawtypes") Class testClass,
		@SuppressWarnings("rawtypes") Constructor testConstructor, Method testMethods) {
	
	
	annotation.setRetryAnalyzer(org.sdet40.genericUtility.RetryImplementation.class);
}	
}
