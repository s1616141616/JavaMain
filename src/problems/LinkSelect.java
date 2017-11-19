package problems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkSelect {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver ();
		
		driver.manage().timeouts().implicitlyWait(3000L, TimeUnit.SECONDS);
		driver.get("http://www.wikipedia.org");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));

		for (int i =0;i<links.size();i++){

		System.out.println(links.get(52).getAttribute ("href"));
		break;
		
		}
	}
}
