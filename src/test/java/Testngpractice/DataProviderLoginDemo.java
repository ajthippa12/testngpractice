package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderLoginDemo {

	@Test(dataProvider = "create")
	public void test(String username, String password) throws InterruptedException {
	System.out.println(username+":"+password);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();


	}
	@DataProvider(name = "create")
	public Object[][] dataset() {

		return new Object[][] 
				{ 
			{ "standard_user ", "secret_sauce"},
			{ "locked_out_user", "secret_sauce"},	
			{ "problem_user", "secret_sauce" }, 
			{ "performance_glitch_user","secret_sauce"}, 
			{"error_user","secret_sauce"},
			{"visual_user","secret_sauce"}

				};


	}
}

