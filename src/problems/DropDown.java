package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://edit.yahoo.com/registration?.lang=en-US&.intl=us&.src=ym&"
				+ ".done=https%3A%2F%2Fmail.yahoo.com&fsredirect=1&fs="
				+ ".W3Lb7OHafAzwbc0KQFS9KDbTmLEDPgeW9gauozRyeukaKSRHAlHIn45pTyipZhjd2qsZIhZ");
		
		Select month =new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		month.selectByValue("5");
		
		Select year =new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		//year.selectByValue("5");
		//year.selectByIndex(5);
		year.selectByVisibleText("2000");
		Thread.sleep(3000);
	}}