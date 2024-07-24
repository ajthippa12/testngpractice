package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private int Retrycount =0;
	private static final int maxRetrycount =5;

	public boolean retry (ITestResult result) {

		if(Retrycount<maxRetrycount)
		{
			Retrycount++;
			return true;

		}
		return false;


	}

}
