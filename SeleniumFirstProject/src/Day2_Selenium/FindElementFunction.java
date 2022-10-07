package Day2_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementFunction {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://ebay.com");
		
	//  ----------------- id() and name() ---------------------------
		
		// finding an element by the element ID of search bar 
		// .sendKey is your input on search bar
//		driver.findElement(By.id("gh-ac")).sendKeys("Coffee Mug");
		
		//find search button and clicking on it
//		driver.findElement(By.id("gh-btn")).click();
		
		//finding element by name and inputting with sendKeys "Coffee Mug"
//		driver.findElement(By.name("_nkw")).sendKeys("coffee mug");
		
		//finding search button by id and clicking on it
//		driver.findElement(By.id("gh-btn")).click();
		
		//  ----------------- LinkText() ---------------------------
		
		//find the Motors link using linkText and click on it
//		driver.findElement(By.linkText("Motors")).click();
		
		// find the link text with Sell and click on it
		driver.findElement(By.linkText("Sell")).click();
		
		
		//  ----------------- partialLinkText() ---------------------------
		
		// find the link text Learn More partially by putting just Learn and click on it
				driver.findElement(By.partialLinkText("Learn")).click();
		
		
		
	}

}
