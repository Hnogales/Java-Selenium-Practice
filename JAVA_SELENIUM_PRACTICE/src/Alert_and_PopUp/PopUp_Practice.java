package Alert_and_PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Practice {
	
	/*
	 * How to handle Selenium Pop-up window using Webdriver
	 * 
	 * In Selenium web driver there are methods through which we can handle multiple windows.
	 * 
	 * 	Driver.getWindowHandles(); - To handle all opened windows by web driver, we can use “Driver.getWindowHandles()” 
	 * 								and then we can switch window from one window to another in a web application. 
	 * 								Its return type is Iterator<String>.
	 * 
	 * Driver.getWindowHandle(); - 	When the site opens, we need to handle the main window by driver.getWindowHandle().
	 * 								This will handle the current window that uniquely identifies it within this driver instance. 
	 * 								Its return type is String.
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver(); 
		
		String baseURL = "http://demo.guru99.com/popup.php";
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		// This handles all NEW opened window. 
				
		Set<String> s1 = driver.getWindowHandles();	
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()){
			
			String ChildWindow = i1.next();
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				
				// Switching to child window
				
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("diego_hni@hotmail.com");
				
				driver.findElement(By.name("btnLogin")).click();
				
				//Closing the child window
				
				driver.close();
			}
		}
		
		// Switching to main window 
		
		driver.switchTo().window(MainWindow);
		
		driver.quit();
	}

}
