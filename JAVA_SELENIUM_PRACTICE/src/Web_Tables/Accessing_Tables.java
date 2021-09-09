package Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accessing_Tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseURL);
		
		String innerText = driver.findElement(By.xpath("//table/tbody/tr/td[2]" + "//table/tbody/tr[4]/td/" + "table/tbody/tr/td[2]/"
		+ "table/tbody/tr[2]/td[1]/" + "table[2]/tbody/tr[3]/td[2]/font")).getText();
		
		System.out.println(innerText);
		
		driver.quit();
		
		
	}

}
