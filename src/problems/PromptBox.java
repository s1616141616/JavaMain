package problems;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		driver.findElement(By.id("prompt")).click();

		Alert alert =driver.switchTo().alert();
		
		Thread.sleep(3000);
		//alert.getText();
		System.out.println("Alert text is : " + alert.getText());
		alert.sendKeys("Saiful");
		Thread.sleep(3000);
		alert.accept();

		driver.switchTo().defaultContent();
	}

}
