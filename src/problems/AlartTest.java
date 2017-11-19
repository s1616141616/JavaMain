package problems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlartTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver ();
		driver.manage().timeouts().implicitlyWait(3000L, TimeUnit.SECONDS);
		driver.get("http://www.rediff.com");
		
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click ();
		driver.findElement(By.name("proceed")).click ();
		Thread.sleep(3000L);
		
		Alert alert =driver.switchTo().alert();
		System.out.println ("Shows up " + alert.getText());
		alert.accept ();
		Thread.sleep(3000L);
	
		driver.close();
	
	}

}
