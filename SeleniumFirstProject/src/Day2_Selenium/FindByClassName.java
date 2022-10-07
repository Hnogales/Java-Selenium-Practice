package Day2_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassName {
	
	public static void main(String[] args) {
		
		// for reference: https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/package-summary.html
		
		// --------------- By.ClassName -----------------
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		// finds element and types Automation (CLASS is used for grouping)
		driver.findElement(By.className("inputtext")).sendKeys("Automation"); 
		
		
	}

}
