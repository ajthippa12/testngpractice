package Testngpractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCasesDemo {

	Boolean datasetup = false;

	@Test
	public void skiptest1() {
		System.out.println("skip testcase Forcefully");
		throw new SkipException("skipping this test");

	}
	@Test
	public void skiptest2() {
		System.out.println("skip testcase Based ipon condition");

		if(datasetup== true)
		{
			System.out.println("Excute the test");
		}
		else {
			System.out.println("Do not excute further steps");
			throw new SkipException("skipping this test");
		}

	}
	@Test(enabled=false)	
	public void skiptest3() {
		System.out.println("skip this test as it not completed");
	}


}
