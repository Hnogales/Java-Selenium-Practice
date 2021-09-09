package Uploading_and_Downloading_Files_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading_Files {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/upload/";
		
		driver.get(baseURL);

		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		
		// Entering the file-path onto the file-selection input field 
		
		uploadElement.sendKeys("/Users/Diego/Desktop/Portfolio Website/index.html");
		
		// check the "I accept the terms of service" check box
		
		driver.findElement(By.id("terms")).click();
		
		// clicking the "uploadFile" button
		
		driver.findElement(By.name("send")).click();
		
		driver.quit();
		
	}

}
