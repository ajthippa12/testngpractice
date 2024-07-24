package Testngpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SoftAssertionDemo extends CommonDataSetup {
	
	@Test
	
	public void verifytitle()
	{
		SoftAssert softassert = new SoftAssert();
		String expectedtitle="Electronics, 122Cars, Fashion, Collectibles & More | eBay";
		String expectedtext="Search";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		String actualtitle = driver.getTitle();
		System.out.println("verifying title");
		softassert.assertEquals(expectedtitle, actualtitle);
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("verifying text");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		driver.close();
		softassert.assertAll();
		
		
	}

}
