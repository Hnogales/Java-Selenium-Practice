package Broken_Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Links {
	
	/*
	 * Testing if all links present within the page are working.
	 * 
	 * By doing so we can use: 
	 * 
	 * - Java for-each loop
	 * - findElements() 
	 * - By.tagName(“a”) method.
	 * 
	 */
	
	public static void main(String[] args) {
		
		String baseURl = "http://demo.guru99.com/test/newtours/";
		String underConsTitle = "Under Construction: Mercury Tours";
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURl);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		String[] linkTexts = new String[linkElements.size()];
		
		int i = 0;
		
		//Extracting the link texts from each link element
		
		for(WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}
		
		// Testing each link 
		
		for(String t : linkTexts) {
		
			driver.findElement(By.linkText(t)).click();
			
			if(driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\""								
                        + " is under construction.");
			} else {
				System.out.println("\"" + t + "\""								
                        + " is working.");
				
			}
			
			driver.navigate().back();
		}
		
			driver.quit();
	}
}
