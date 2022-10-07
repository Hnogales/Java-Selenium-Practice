package Java_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
	//tageName "a"
		
		Thread.sleep(1000);
		
		//This is how you practice list in selenium (ex. finding links, finding buttons, etc.)
// 										list of WebElements
		List<WebElement> links = driver.findElements(By.tagName("a"));  // tagName "a" represents link
		System.out.println(links.size());												
	
		for(WebElement element : links) {
			System.out.println(element.getText());
		}

		driver.quit();
	}
}
