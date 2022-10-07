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
import org.testng.annotations.AfterMethod;


//Homework 3.
//go to https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
//Click on the last Alert, verify text equals “Please enter your name”
//Enter a name then Accept.

public class Class_Homework_3 {
	
	String url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
	
	BrowserUtils utils = new BrowserUtils();
	WebDriver driver;
	
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println("Before Method Executed");
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();
	  System.out.println("After method executed");
  }
  
  @Test
  public void homework3() throws InterruptedException {
	  driver.get(url);
	  WebElement lastBtn = driver.findElement(By.xpath("//button[contains(@onclick, 'myPromptFunction()')]"));
	  lastBtn.click();
	  Thread.sleep(4000);
	  
	  Alert promptBox = driver.switchTo().alert();
	  System.out.println(promptBox.getText());
	  
	  promptBox.sendKeys("Harold"); // NOT WORKING
	  Thread.sleep(2000);
	  
	  System.out.println("This is the prompt box after: " + promptBox.getText());
	  
	  promptBox.accept();
  }

}
