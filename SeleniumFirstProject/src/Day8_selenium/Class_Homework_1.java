package Day8_selenium;

import org.testng.annotations.Test;

import utility.BrowserUtils;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


//	Homework 1.
//	go to https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
//	Click on the first Alert, verify text equals “I am an alert box!” then Accept.


public class Class_Homework_1 {
  
	String url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
	String expectedAlertVerification = "I am an alert box!";
	
	BrowserUtils utils = new BrowserUtils();
	WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println("Before Method is Executed");
	  }
	 
	 @AfterMethod
	  public void afterMethod() {
//		 driver.quit();
		 System.out.println("After Method is Executed");
	  }
	
	 
	@Test
 public void homework1() throws InterruptedException {
		
		driver.get(url);
		WebElement clickMeBtn = driver.findElement(By.xpath("//button[contains(@onclick, 'myAlertFunction()')]"));
		clickMeBtn.click();
		Thread.sleep(3000);
		
		//Declaring Alert Class
		Alert alertBox = driver.switchTo().alert();
		
		String actualAlertMessage = alertBox.getText();
		System.out.println(actualAlertMessage);  		// I am an alert box!
		
		Assert.assertEquals(actualAlertMessage, expectedAlertVerification);
		
		// Accepting
		alertBox.accept();
		
	  
  }
  
 

 

}
