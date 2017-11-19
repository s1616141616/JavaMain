package problems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

		public static void main(String[] args) throws Exception {
		WebDriver driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#password");
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("s1616141616@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("nafisaSAMIYAH77");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		
	//	Thread.sleep(3000);
		
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id=':3c']")));
		driver.findElement(By.xpath(".//*[@id=':3c']")).click();

	}

}