package Day2_Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Function_Indeed {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://indeed.com");
		
	//  ----------------- clear() ---------------------------
		
//		driver.findElement(By.id("text-input-where")).clear();
		
		driver.get("https://google.com");
		
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("SDET");
		Thread.sleep(2000);					// holds action for seconds
		element.clear();
		
	}

}
