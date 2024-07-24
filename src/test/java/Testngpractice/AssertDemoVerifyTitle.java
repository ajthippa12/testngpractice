package Testngpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssertDemoVerifyTitle extends CommonDataSetup{
	
	@Test
	
	public void verifytitle()
	{
		
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle);
		
		
		
		
		
	}

}
