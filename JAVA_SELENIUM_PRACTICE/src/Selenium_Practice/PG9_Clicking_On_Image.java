package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG9_Clicking_On_Image {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		
		// Clicking on the "Facebook" logo on the upper left portion 
		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
		
		// Verifying we are now back on Facebook's Homepage
		
		if(driver.getTitle().equals("//*[@id=\"content\"]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]/a/svg")) { // ERROR no element located
			System.out.println("We are back at FB homepage");
		} else {
			System.out.println("We are NOT back at FB homepage");
		}
		
		driver.quit();
	}

}
