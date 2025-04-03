package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.MyEnvironment;
import com.utility.JSONUtility;


public class MyRetryAnalyzer implements IRetryAnalyzer{

	//private static final int Max_NUMBER_OF_ATTEMPTS=Integer.parseInt(com.utility.PropertiesUtil.readProperty(MyEnvironment.DEV,"Max_NUMBER_OF_ATTEMPTS"));
	//private static final int Max_NUMBER_OF_ATTEMPTS=3;
	private static final int Max_NUMBER_OF_ATTEMPTS=JSONUtility.readJSON(MyEnvironment.QA).getMax_NUMBER_OF_ATTEMPTS();
	private static int currentAttenmps=1;
	
	@Override
	public boolean retry(ITestResult result) {
		if(currentAttenmps<=Max_NUMBER_OF_ATTEMPTS)
		{
			currentAttenmps++;
			return true;
		}
		
		return false;
	}

	
}
