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

public class Class_Homework_2 {
	
//	Homework 2.
//	go to https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
//	Click on the second Alert, verify text equals “Press a button!” then Dismiss.
	
	String url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
	String verificationAlert = "Press a button!";
	
	BrowserUtils utils = new BrowserUtils();
	WebDriver driver;
	
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println("Before method executed");
  }

  @AfterMethod
  public void afterMethod() {
	driver.quit();
	System.out.println("After method executed");
  }

  @Test
  public void homework2() throws InterruptedException {
	  driver.get(url);
	  WebElement alertBtn = driver.findElement(By.xpath("//button[contains(@onclick, 'myConfirmFunction()')]"));
	  alertBtn.click();
	  Thread.sleep(4000);
	  
	  // Verifying text 
	  Alert alertBox = driver.switchTo().alert();
	  
	  String alertText = alertBox.getText();
	  System.out.println(alertText);
	  
	  Assert.assertEquals(alertText, verificationAlert);
	  
	  alertBox.dismiss();
	  
	  
  }
}
