package Testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.CommonDataSetup;
@Test(groups ="user-registration")
public class GroupTestDemo extends CommonDataSetup {

	@Test(groups = "regression")
	public void atest1() {
		System.out.println("test1");
	}
	@Test(groups = "regression")
	public void btest2()
	{
		System.out.println("test2");
		Assert.assertTrue(false);
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


