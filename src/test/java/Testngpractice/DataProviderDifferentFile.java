package Testngpractice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class DataProviderDifferentFile {
	@DataProvider(name = "create")
	public Object[][] dataset1(Method m) 
	{
		Object[][] testdata = null;

		if(m.getName().equals("test"))
		{
			testdata = new Object[][]
					{ 
				{ "Ajay ", "abc123"}, 
				{ "Yuvan", "abc123"},
				{ "Vijay", "abc123"}, 
				{ "sanvi", "abc123"} 
					};


		}
		else if(m.getName().equals("test1"))
		{
			testdata = new Object[][]
					{ 
				{ "Ajay ", "abc123","third1"}, 
				{ "Yuvan", "abc123","third2"},
				{ "Vijay", "abc123","third3"}, 
				{ "sanvi", "abc123","third4"} 
					};
		}
		
		
		else if(m.getName().equals("test2"))
		{
			testdata = new Object[][]
					{ 
				{ "Ajay ", "abc123","third1","Descrption1"}, 
				{ "Yuvan", "abc123","third2","Descrption2"},
				{ "Vijay", "abc123","third3","Descrption3"}, 
				{ "sanvi", "abc123","third4","Descrption4"} 
					};
		}
		return testdata;
	}



}
