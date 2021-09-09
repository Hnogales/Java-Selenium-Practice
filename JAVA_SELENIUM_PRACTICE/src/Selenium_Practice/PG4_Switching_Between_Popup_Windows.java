package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG4_Switching_Between_Popup_Windows {
	
	public static void main(String[] args) {
		
		//https://www.guru99.com/first-webdriver-script.html
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://jsbin.com/usidix/1";
		String alertMessage = "";
		
		driver.get(baseURL);
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click(); // clicking on go 
		
		alertMessage = driver.switchTo().alert().getText(); // Switching to and getting text from alert
		
		System.out.println(alertMessage); // proof
		
		driver.switchTo().alert().accept(); // accepting alert 
		
		driver.quit();
	}

}
