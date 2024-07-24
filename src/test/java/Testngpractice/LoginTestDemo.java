package Testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class LoginTestDemo extends CommonDataSetup{

	@BeforeMethod
	public void connectdb()
	{
		System.out.println("connect to DB");
	}
	@AfterMethod
	public void disconnectdb()
	{
		System.out.println("disconnect from db");
	}
	@BeforeTest
	public void LogintoApplication()
	{
		System.out.println("Loginto application");
	}

	@AfterTest
	public  void LogoutApplication () {
		System.out.println("Logout from  application");

	}

	@Test(priority = 1, description = "Login test")
	public void atest1()
	{
		System.out.println("test1 successfull");
	}

	@Test(priority = 1, description = "Logout test")
	public void btest2() {
		System.out.println("test2 successfully");
	}
}
