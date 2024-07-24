package Testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
@Test(groups ="user-registration")
public class GroupTestDemo2 {
	@BeforeClass
	public void beforeclass() {
		System.out.println("run this test before class");
	}
	@AfterClass
	public void classAfter() {
		System.out.println("run this test After class");
	}


	@BeforeGroups(value = "regression")
	public void beforegroup() {
		System.out.println("Run this method before regression");
	}

	@AfterGroups(value = "regression")
	public void Aftergroup() {
		System.out.println("Run this method after regression");
	}

	@Test(groups = "regression")
	public void atest1() {
		System.out.println("test1");
	}
	@Test(groups = "regression")
	public void btest2()
	{
		System.out.println("test2");
	}
	@Test(groups = {"regression","bvt"})
	public void btest3()
	{
		System.out.println("test3");
	}
	@Test(groups = "bvt")
	public  void btest4()
	{
		System.out.println("test4");
	}


}


