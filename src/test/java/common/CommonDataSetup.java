package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {

	
	@BeforeSuite
	public void datasetup() {
		System.out.println("common datasetup");
	}
	
	@AfterSuite
	public void teardown() {
		System.out.println("common data cleanup");
	}

}
