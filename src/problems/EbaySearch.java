package problems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EbaySearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.get ("https://www.ebay.com/");
		Thread.sleep(3000);
		
		WebElement cat_drop_Down =driver.findElement(By.id("gh-cat"));
		
		Select cat_dd =new Select(cat_drop_Down);
		List<WebElement> list = cat_dd.getOptions();
		int total_cat =list.size();
		System.out.println(total_cat);
		
		for (WebElement el :list) {
			String cat_name=el.getText();
			System.out.println(cat_name);
		}
		
		Assert.assertEquals("All Categories","All Categories");
		
		driver.close();
	}	
	
}