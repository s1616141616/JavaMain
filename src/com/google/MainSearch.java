package com.google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MainSearch {
	
	@Test
	public void selectFromSearchList() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Samsung");;
	//	driver.findElement(By.id("sbse4")).click();
		
		//WebElement search =driver.findElement(By.id("lst-ib"));
		
		/*Select search_list =new Select (search);
		
		List<WebElement> search_lst =search_list.getOptions();
		int total =search_lst.size();
		System.out.println();
		*/Thread.sleep(3000);
		driver.close();
		
		
	}

}
