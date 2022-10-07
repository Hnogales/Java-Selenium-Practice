package Day2_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFunctions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
//		String beforeSearchTitle = driver.getTitle();
//		System.out.println("Before search title is: " + beforeSearchTitle);
//		
//		String beforeSearchURL = driver.getCurrentUrl();
//		System.out.println("Before search URL is: " + beforeSearchURL);
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee Mug");
//		driver.findElement(By.id("nav-input nav-progressive-attribute")).click();
//		
//		String title = driver.getTitle();
//		System.out.println("After search title is: " + title);
		
//		String afterSearchURL = driver.findElement(By)
//		
		
		
		String getText = driver.findElement(By.linkText("Customer Service")).getText();
		System.out.println("Get text method returns " + getText);
		
		// close() - closes current window after done
		
		driver.close();
		
		// quit() - quits the whole browser session
	}

}
