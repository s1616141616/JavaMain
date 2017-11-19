package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main (String[]args){
	
WebDriver driver= new FirefoxDriver();
driver.get("file:///C:/Users/Saiful/Desktop");

Actions action =new Actions (driver);
action.moveToElement(driver.findElement(By.xpath("//input[@name='submit']"))).doubleClick().perform();

	}
}
