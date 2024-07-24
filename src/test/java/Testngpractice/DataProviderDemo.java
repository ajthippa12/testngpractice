package Testngpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider = "dataset")
	public void test(String username, String password) {
		System.out.println(username + ":" + password);
	}

	@DataProvider
	public Object[][] dataset() {
		Object[][] dataset = new Object[4][2];

		// first row

		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";

		// second row
		dataset[1][0] = "user1";
		dataset[1][1] = "pass1";

		// thrid row
		dataset[2][0] = "user1";
		dataset[2][1] = "pass1";

		// fourth row
		dataset[3][0] = "user1";
		dataset[3][1] = "pass1";

		return dataset;
	}

	// second method
	@Test(dataProvider = "create")
	public void test1(String username, String password, String test) {
		System.out.println(username + ":" + password+ ":"+test);
	}
	@DataProvider(name = "create")
	public Object[][] dataset1() {

		return new Object[][] { { "Ajay ", "abc123", "Welcome" }, { "Yuvan", "abc123", "To" },
			{ "Vijay", "abc123", "Thippani" }, { "sanvi", "abc123", "Family" } };

	}

}
