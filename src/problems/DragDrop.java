package problems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get ("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000L,TimeUnit.SECONDS);
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		Actions action =new Actions(driver);
		
		action.dragAndDrop(drag, drop).build().perform();
			
		System.out.println("Successfully Done!!!");
	}

}