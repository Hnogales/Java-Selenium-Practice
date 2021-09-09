package Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/write-xpath-table.html";

		driver.get(baseURL);
		
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		
		System.out.println(innerText);
		
		driver.quit();
		
	}
}
