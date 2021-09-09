package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2_Locating_Elements {
	
	/*
	 * By.className - finds elements based on the value of the "class" attribute 
	 * 		Example	- findElement(By.className("someClassName"))
	 * 
	 * By.id 		- locates elements by the value of their "id" attribute
	 * 		Example - findElement(By.id("someId"))  
	 * 
	 * By.linkText 	- finds a link element by the exact text it displays
	 *  	Example - findElement(By.linkText("REGISTRATION"))  
	 *  
	 * By.name 		- locates elements by the value of the "name" attribute
	 *  	Example - findElement(By.name("someName"))  
	 *  
	 * By.partialLinkText - locates elements that contain the given link text
	 * 		Example - findElement(By.partialLinkText("REG"))  
	 * 
	 * By.tagName	- locates elements by their tag name
	 * 		Example - findElement(By.tagName("div"))  
	 *  
	 *  By.xpath	- locates elements via XPath	
	 *  	Example - findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/ tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/ form/table/tbody/tr[5]"))
	 */	
	
	public static void main(String[] args) {
		
		// https://www.guru99.com/first-webdriver-script.html
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://www.facebook.com";
		String tagName = "";
		
		driver.get(baseURL);
		
		tagName = driver.findElement(By.id("email")).getTagName(); //extracting tagname of element who's id is 'email'
		System.out.println(tagName);
		
		driver.quit(); // All windows will close
	
	}

}
