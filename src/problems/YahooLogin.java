package problems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=ym&.intl=us&"
				+ ".lang=en-US&.done=https%3a//mail.yahoo.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("saifulssqae");
		driver.findElement(By.xpath(".//*[@id='login-passwd']")).sendKeys("s123456789");
		driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
	
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='yui_3_10_3_1_1375219693637_127']/b[2]")));
		
		
		WebElement element =driver.findElement(By.xpath(".//*[@id='yui_3_10_3_1_1375219693637_127']/b[2]"));
		Actions action =new Actions (driver);
		//action.moveToElement(element).click().perform();;
		action.moveToElement(element).perform();;
		
		WebDriverWait wait1 = new WebDriverWait (driver,20);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='yui_3_10_3_1_1375219693637_127']/b[2]")));
		
		driver.findElement(By.xpath(".//*[@id='yui_3_10_3_1_1375219693637_127']/b[2]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath(".//*[@id='yucs-signout']")).click();
		
		WebDriverWait wait2 = new WebDriverWait (driver,20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("yucs-signout")));
		driver.findElement(By.id("yucs-signout")).click();
	}
}