package Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Attributes {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseURL);
		
		String innerText = driver.findElement(By.xpath("//table[@width=\"198\"]/tbody/tr[4]/td")).getText(); // ERROR 
		
		System.out.println(innerText);
		
		// driver.quit();
		
		
	}

}
