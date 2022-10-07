package Day5_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_2_Indeed {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 * Go to indeed.com
		 * search for SDET
		 * verify that there are 10 results in a page
		 * Verify that all the job titles contains (SDET)
		 * 
		 */
		
		driver.get("https://indeed.com");	// go to Indeed.com
		WebElement search = driver.findElement(By.id("text-input-what"));
		search.sendKeys("SDET");
		
		driver.findElement(By.cssSelector(".icl-Button--md")).click();
		Thread.sleep(2000);
		
		List<WebElement> jobResults = driver.findElements(By.xpath("#sja0 > b")); // cant find
		int resultsSize = jobResults.size();
		System.out.println(resultsSize);
		
//		if(resultsSize == 0) {
//			System.out.println("Number of results match");
//		} else {
//			System.out.println("Fail");
//		}
		
		for(int i = 0; i < resultsSize ; i++) {
			String jobTitle = jobResults.get(i).getText();			//grabbing and then getting text
			
			if(jobTitle.contains("SDET")) {
				System.out.println(i + " Job title contains SDET, test PASSED");
			} else {
				System.out.println(i + "Job title doe not contain SDET, test FAILED");
			}
		}
		
	}

}
