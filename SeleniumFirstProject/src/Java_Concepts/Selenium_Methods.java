package Java_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Methods {
	
	WebDriver driver;
	
	public void startAutomation() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Initializing the driver");
	}
	
	public void startAutomation(String URL) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	public void startAutomation(String URL, int timeout) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		Thread.sleep(timeout * 1000);
	}


}
