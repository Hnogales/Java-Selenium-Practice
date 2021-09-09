package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1_Actual_vs_Expected_Titles{
	
	public static void main(String[] args) {
		
		/*
		 * driver.get() : 	   It's used to go to the particular website , But it doesn't maintain the browser History and cookies so, 
		 * 				       we can't use forward and backward button , if we click on that , page will not get schedule
		 * driver.navigate() : it's used to go to the particular website , but it maintains the browser history and cookies,
		 * 					   so we can use forward and backward button to navigate between the pages during the coding of Testcase
		 */
		
		// https://www.guru99.com/first-webdriver-script.html
		
		// Declaring and initiating objects/variables 
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver"); 
		 
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.seleniumeasy.com/test/"; 
		String expectedTitle = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
		String actualTitle = "";
		
		// Launching Chrome 
		driver.get(baseURL);
		
		// Getting current page title of loaded page
		actualTitle = driver.getTitle(); 
		
		// Comparing actual with expected and printing as passed or failed
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		driver.quit(); // All windows will close
		
	}

}
