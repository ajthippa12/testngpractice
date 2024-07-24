package Testngpractice;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class DependencyTest  {

	@Test
	public void userregistration() {


		System.out.println("This method for user:registration");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "userregistration",alwaysRun = true)
	public void usersearch() {
		System.out.println("This method for user:search");
		
	}

	@Test
	public void reporttest3() {
		System.out.println("This is test3");
	}

	@Test
	public void reporttest4() {
		System.out.println("This is test4");
	}
}
