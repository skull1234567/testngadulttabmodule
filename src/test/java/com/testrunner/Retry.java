package com.testrunner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int max =3;
	int count = 1;
	@Override
	public boolean retry(ITestResult result) {
		if(count<=max) {
			count++;
			return true;
		}
		return false;
	}
	
	
	


}
