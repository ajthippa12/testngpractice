package utilites;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class TestUtils extends BaseTest{


	public void getScreenshot() throws IOException {

		Date currentdate = new Date();
		String screenshotFilename =currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotFilename);

		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//shot/"+screenshotFilename + ".png"));


	}
}
