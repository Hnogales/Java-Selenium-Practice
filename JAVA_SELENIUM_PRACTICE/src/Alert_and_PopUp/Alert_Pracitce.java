package Alert_and_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pracitce {
	
	/*
	 * What is Alert? - is a small message box which appears on screen to give the user some information or notification.
	 * 
	 * Types of alerts:
	 * 
	 * 			Simple Alert -  Simple alert class in Selenium displays some information or warning on the screen.
	 * 		
	 * 			Promp Alert  -	This Prompt Alert asks some input from the user and Selenium webdriver 
	 * 							can enter the text using sendkeys(” input…. “).
	 * 
	 * 			Confirmation Alert - This confirmation alert asks permission to do some type of operation.
	 * 
	 * 
	 * How to handle alert in Selenium (methods) 
	 * 
	 * 		1. void dismiss() // To click on the ‘Cancel’ button of the alert.
	 * 
	 * 		Example: 	driver.switchTo().alert().dismiss();
	 * 
	 * 		2. void accept() // To click on the ‘OK’ button of the alert.
	 * 
	 * 		Example: 	driver.switchTo().alert().accept();
	 * 
	 * 		3. String getText() // To capture the alert message.
	 * 
	 * 		Example: 	driver.switchTo().alert().getText();
	 * 
	 * 		4. void sendKeys(String stringToSend) // To send some data to alert box.
	 * 
	 * 		Example: 	driver.switchTo().alert().sendKeys("Text");
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		
		// Alert message handling 
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		
		driver.findElement(By.name("submit")).submit();
		
		//Switching to Alert
		
		Alert alert = driver.switchTo().alert();
		
		// Capturing alert message.
		
		String alertMessage = driver.switchTo().alert().getText();
		
		// Displaying alert message 
		
		System.out.println(alertMessage);
		
		Thread.sleep(3000);
		
		// Accepting the alert 
		
		alert.accept();
		
		driver.quit();
		
		
		
		
	}
}
