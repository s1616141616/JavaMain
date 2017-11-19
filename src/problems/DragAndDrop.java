package problems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://api.checklist.com/login");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("s1616141616@gmail.com");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div[2]/input")).sendKeys("selenium1234");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div[3]/button")).click();
		
		Thread.sleep(5000);
		
		WebElement dragdrop= driver.findElement(By.xpath(".//*[@id='userChecklists']/li[3]"));
		Actions builder =new Actions(driver);
		
		builder.dragAndDropBy(dragdrop,0,-66).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='myProfile']/i")).click();
		driver.findElement(By.xpath(".//*[@id='profileMenuUl']/li[4]/a")).click();
		
		driver.close();
		
	}

}