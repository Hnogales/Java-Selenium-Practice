package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG3_Switching_Between_Frames {
	
	public static void main(String[] args) {
		
		// https://www.guru99.com/first-webdriver-script.html
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame"); 
		driver.findElement(By.linkText("Deprecated")).click();
	
		driver.close();
	}

}
