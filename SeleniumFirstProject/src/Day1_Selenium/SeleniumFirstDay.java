package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstDay {

	public static void main(String[] args) {
		
		// Setting the property of file and telling the location
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe"); 
		
		// I want to use the methods in ChromeDriver class extending to the webdriver as a parent
		// Creating an object of browser class of your choice in system property
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://google.com"); // can also go to ANY website
		
		
	}

}
