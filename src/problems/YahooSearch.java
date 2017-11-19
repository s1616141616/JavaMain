package problems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearch
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get ("http://www.yahoo.com/");
		//driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			
		driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("AK-47");
		
		driver.findElement(By.xpath(".//*[@id='uh-search-button']")).click();
		//Thread.sleep(3000);
			
		WebElement element = driver.findElement(By.xpath("//*[starts-with(@id,'uh-search-box']"));
		List <WebElement> list =element.findElements(By.xpath("//*[starts-with(@id,'uh-search-box']"));
			
		System.out.println("Total number of item showing is : " +list.size());
			
			for (int i =0; i<list.size();i++)
			{
				String value=list.get(i).getText();
				System.out.println(value);
			}
			list.get(3).click();
			driver.findElement(By.partialLinkText("Images")).click();
		}
}