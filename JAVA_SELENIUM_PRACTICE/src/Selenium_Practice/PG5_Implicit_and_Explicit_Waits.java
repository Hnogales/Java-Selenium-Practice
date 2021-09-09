package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PG5_Implicit_and_Explicit_Waits {
	
	/*
	 *  There are two kinds of waits.
	 *  
	 *  1. Implicit Wait - used to set the default waiting throughout the program
	 *  
	 *  2. Explicit Wait - Used to set waiting time for a particular instance only
	 */
	
	/*
	 * Implicit Wait 
	 * 
	 * 	- Simpler to code than explicit waits
	 * 	- Usually declared in the instantiation part of the code
	 * 	- You will only need one additional package to import. 
	 * 
	 * To start using implicit wait, this package has to be imported -> import java.util.concurrent.TimeUnit;
	 * 
	 * 		Code: driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * ------------------------------------------------------------------------------------------------------
	 * 
	 * Explicit Wait 
	 * 
	 * 	- Are done using WebDriverWait and ExpectedCondition classes. 
	 * 
	 * To start using explicit wait, these packages have to be imported 
	 * 
	 *  -> import org.openqa.selenium.support.ui.ExpectedConditions;
	 *  -> import org.openqa.selenium.support.ui.WebDriverWait;
	 *  
	 */
	// Example of explicit
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWaitVar = new WebDriverWait(driver, 10); // driver is instance that will be used and 10 is seconds
		
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))); // driver explicitly waits until user-name is present
		driver.findElement(By.id("username")).sendKeys("tutorial"); // if user-name is present then we sendKeys 
		
	// Methods that are used in conditions or loops 
		
		/*
		 * 	- isEnabled(); 	- to verify if certain element is enabled or not before executing.
		 */
			//	EXAMPLE 
		
		WebElement txtbox_username = driver.findElement(By.id("username"));
		
			if(txtbox_username.isEnabled()) {
				txtbox_username.sendKeys("tutorial");
			}
			
		/*
		 *   - isDisplayed(); - to verify whether an element is displayed or not before executing. 
		 */
			//	EXAMPLE
			
		do {
			//doing something here
		} while(driver.findElement(By.id("username")).isDisplayed()); 
		
		
		/*
		 *  - isSelected(); - to verify whether a certain check box, radio button, or option in a drop-down box is selected.
		 * 					  (does not work on other elements)
		 */
		
			// EXAMPLE
		
		//"one-way" and "two-way" are radio buttons
		if(driver.findElement(By.id("one-way")).isSelected()) {
			
			driver.findElement(By.id("two-way"));
		}
			
// -------------------------------------------------------------------------------------------------------------------------------	
	// ExpectedConditions class 
		
		/*
		 * 	- alertIsPresent(); - waits until an alert box is displayed
		 */
		
			// EXAMPLE
		
		if(myWaitVar.until(ExpectedConditions.alertIsPresent()) != null) {
			
			System.out.println("alert is present!");
		}
		
		/*
		 * 	- elementToBeClickable(); - waits until element is visible and at the same time enabled. 
		 */
		
			// EXAMPLE
// This code will wait until the element with id="username" to become visible and enabled first before assigning that element as WebElement
		WebElement txtUserName = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("username")));
	
		
		/*
		 *  - frameToBeAvaialableAndSwitchToIt() - Waits until the given frame is already available, and then automatically switches to it. 
		 */
	
			// EXAMPLE
	
		myWaitVar.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("viewFRAME"));
	}
}
