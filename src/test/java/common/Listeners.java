package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilites.TestUtils;

public class Listeners extends TestUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is :" + result.getName());
		System.out.println("Testcase:is starting");
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("status of excution is" + result.getStatus());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test-Failed: screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {

			e.printStackTrace();
		}
		Reporter.log("<a href=\"C:\\Users\\ajayk\\eclipse-workspace\\TestNG\\shot\\Tue-Feb-06-11-53-06-IST-2024\"> Test Results</a>");
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

}
