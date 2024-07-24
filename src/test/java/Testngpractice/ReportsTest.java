package Testngpractice;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class ReportsTest extends BaseTest {

	@Test
	public void reporttest1() {


		System.out.println("This is test1");
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);
	}

	@Test
	public void reporttest2() {
		System.out.println("This is test2");
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
