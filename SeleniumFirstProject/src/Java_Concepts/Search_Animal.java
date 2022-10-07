package Java_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Animal {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty(Config.getProperty("browser"),Config.getProperty("path"));
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Config.getProperty("url"));
		
		driver.findElement(By.xpath("//a[@href='/cams/polar-cam']")).click();
		
		Thread.sleep(10000);
		
		driver.quit();

		System.out.println(Config.getProperty("morning")); // null is given when property is not in the file
		
	}

}
