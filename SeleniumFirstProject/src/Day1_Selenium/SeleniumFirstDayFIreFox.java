package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstDayFIreFox {

	public static void main(String[] args) {

	// For this to work you need to have FireFox installed
			
			// Setting the property of file and telling the location
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\geckodriver.exe"); 
			
			// I want to use the methods in ChromeDriver class extending to the webdriver as a parent
			// Creating an object of browser class of your choice in system property
			WebDriver driver = new FirefoxDriver(); 
			
			driver.get("https://google.com");
			
			
		
	}

}
