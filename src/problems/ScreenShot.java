package problems;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShot {
					
		@Test
		 public void captureScreenshot() throws Exception {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.youtube.com/watch?v=zNTU94GZgbU");
			TakesScreenshot ts =(TakesScreenshot)driver;
			File src= ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File ("./Screenshots/test.png"));
			System.out.println("Screenshot Taken");
			Thread.sleep(2000);
			driver.quit();
		}
		
	}