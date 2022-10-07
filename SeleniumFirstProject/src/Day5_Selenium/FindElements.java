package Day5_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coffee mug");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> results = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		int sizeOfResults = results.size();
		System.out.println("Number of results is: " + sizeOfResults);
		
		if(sizeOfResults == 60) {
			System.out.println("Test Pass.");
		} else {
			System.out.println("Test Fail");
		}
		
	}

}
