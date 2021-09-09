package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG7_FindElement_vs_FindElements {
	
	/*
	 * Find Element 
	 * 
	 * 	- Returns the first most web element if there are multiple web elements found with the same locator	
	 * 	- Throws exception NoSuchElementException if there are no elements matching the locator strategy
	 * 	- Find element by XPath will only find one web element	
	 * 	
	 * 
	 * Find Elements 
	 * 
	 * 	- Returns a list of web elements
	 * 	- Returns an empty list if there are no web elements matching the locator strategy
	 * 	- It will find a collection of elements whose match the locator strategy.
	 * 	- Each Web element is indexed with a number starting from 0 just like an array
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Find element example 
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximizing windows
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		driver.findElement(By.id("no")).click(); // Finding radio button by id and clicking on it
		
		driver.findElement(By.id("buttoncheck")).click();
		
		
// ------------------------------------------------------------------------------------------------------
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("Number of elements: " + elements.size());
		
		for(int i=0; i<elements.size(); i++) {
			
			System.out.println("Radio button text: "+ elements.get(i).getAttribute("value"));
		}
		
		
		driver.quit();
		
		
		
	}

}
