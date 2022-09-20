package org.sdet40.practice;

import org.testng.Reporter;
import org.testng.annotations.Test; 

public class TestNGTest {
@Test
public void step1Test() {
	Reporter.log("script1",true);
}
	@Test
	public void step2Test()
	{
		Reporter.log("script2",true);
	}
}
