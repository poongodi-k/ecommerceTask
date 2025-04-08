package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	public static String getScreenshot(WebDriver driver, String testname) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
		String screenshotPath = ("D:\\testcase\\") + testname + ".jpg";
		try {
			FileUtils.copyFile(screenshotFile, new File(screenshotPath), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenshotPath;

	}

}