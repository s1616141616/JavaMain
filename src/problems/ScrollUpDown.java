package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpDown {

public static void main (String[]args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/");
	
	WebElement element = driver.findElement(By.cssSelector("body"));
	element.sendKeys(Keys.PAGE_DOWN);
	//element.sendKeys(Keys.END);
	
	Thread.sleep(3000);
	
	WebElement element1 = driver.findElement(By.cssSelector("body"));
	element1.sendKeys(Keys.PAGE_UP);
	//element1.sendKeys(Keys.HOME);
	Thread.sleep(7000);
	
	driver.close();
	
	}
}