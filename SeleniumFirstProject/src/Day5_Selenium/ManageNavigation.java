package Day5_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageNavigation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize(); // maximizes the current window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // finding the code for 10 seconds
		
		driver.get("https://amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coffee mug");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
//		driver.navigate().to("https://indeed.com");
//		WebElement driverIndeed = driver.findElement(By.id("text-input-what"));
//		driverIndeed.sendKeys("SDET");
//		WebElement findjob = driver.findElement(By.cssSelector(".icl-Button--md.icl-WhatWhere-button"));
//		findjob.click();
//		Thread.sleep(1000);
//		driver.navigate().back();
		
		
		
		
	}

}
