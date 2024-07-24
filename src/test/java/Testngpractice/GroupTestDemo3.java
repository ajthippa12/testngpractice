package Testngpractice;


import org.testng.annotations.Test;

import common.CommonDataSetup;

public class GroupTestDemo3 extends CommonDataSetup{
	@Test

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


