package Day2_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Test_Cases {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Test case 1
		 * 
		 * 	Go to facebook.com
		 * find the Email or phone number field and type automation
		 * find the password field and type automation
		 * find the Login button and click on it
		 */
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://facebook.com");  // Go to facebook.com
//		
//		
//		driver.findElement(By.id("email")).sendKeys("automation"); // find the Email or phone number field and type automation
//		
//		driver.findElement(By.id("pass")).sendKeys("automation");  // find the password field and type automation
//		
//		driver.findElement(By.id("login")).click();				   // find the Login button and click on it
//		
		
		
		
		/*
		 *  Test case 2
		 *  
		 *  Go to facebook.com
		 *  find the Create New Acocunt button and click on it
		 *  find the FirstName, LastName, Email and Password fields and type Automation
		 *  find the Sign Up button and click on it.
		 *  
		 *  
		 */
		
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create New Account")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Automation");
		driver.findElement(By.name("lastname")).sendKeys("Automation");
		driver.findElement(By.name("reg_email__")).sendKeys("Automation");
		driver.findElement(By.id("password_step_input")).sendKeys("Automation");
		driver.findElement(By.name("submit")).sendKeys("Automation");
		
		

		
		
	}

}
