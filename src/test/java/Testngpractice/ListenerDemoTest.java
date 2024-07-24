package Testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerDemoTest extends BaseTest {

	@Test
	public void lunchapp() {

		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		Assert.assertTrue(false);
	}

}
