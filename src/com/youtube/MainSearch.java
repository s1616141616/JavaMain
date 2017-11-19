package com.youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class MainSearch {
	
	public void mainSearchTest() {
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Java");
		
		WebElement search = driver.findElement(By.name("q"));
		
		//WebElement month_droop_down = driver.findElement(By.id("month"));
		
		Select search1= new Select(search);
		
		List<WebElement> search_select =search1.getOptions();
		int size=search_select.size();
		System.out.println(size);
		//driver.findElement(By.name("q")).click();
		//driver.findElement(By.id("sbse4")).click();
		//driver.findElement(By.className("sbqs_c")).click();
		//driver.findElement(By.tagName("b")).click();
		
	}

}
