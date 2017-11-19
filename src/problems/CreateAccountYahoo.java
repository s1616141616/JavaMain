package problems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountYahoo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.intl=us&"
				+ ".lang=en-US&.done=https%3a//mail.yahoo.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='login-signup']")).click();
		Thread.sleep(3000);
			
		
		driver.findElement(By.xpath(".//*[@id='first-name']")).sendKeys("Mohammad");
		driver.findElement(By.xpath(".//*[@id='last-name']")).sendKeys("Islam");
		driver.findElement(By.xpath(".//*[@id='user-name']")).sendKeys("saifulssqae");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("s123456789");
		driver.findElement(By.xpath(".//*[@id='mobile']")).sendKeys("3235577295");
		
		Select month =new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		month.selectByIndex(3);
		
		Select day =new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		day.selectByIndex(20);
		
		Select year =new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		year.selectByVisibleText("1977");
		
		driver.findElement(By.xpath(".//*[@id='gender-wrapper']/fieldset/div/label[1]")).click();
		driver.findElement(By.xpath(".//*[@id='info-form']/div/div[9]/input")).click();
		
		Thread.sleep(50000);
		driver.findElement(By.xpath(".//*[@value='Submit code']")).click();
	}
}