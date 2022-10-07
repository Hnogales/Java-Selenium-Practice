package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		return driver;
		}
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
		}
	}

}
