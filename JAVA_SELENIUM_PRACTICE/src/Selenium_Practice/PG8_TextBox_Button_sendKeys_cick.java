package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG8_TextBox_Button_sendKeys_cick {
	
	public static void main(String[] args) {
		
		// declaring and instantiating objects/variables
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/login.html";
		driver.get(baseURL);
		
		// Getting email address WebElement(TextField)
		WebElement email = driver.findElement(By.id("email"));
		
		// Getting password WebElement(PasswordField)
		WebElement password = driver.findElement(By.name("passwd"));
		
		email.sendKeys("diego_hni@icloud.com");
		password.sendKeys("superSecretPassword");
		
		System.out.println("Text Field all set!");
		
		//	Deleting the values in the textbox 
		email.clear();
		password.clear();
		
		System.out.println("email and password text field all clear!");
		
		//	Finding the submit button 
		WebElement loginBtn = driver.findElement(By.id("SubmitLogin"));
		
		// Using click method to submit form
		email.sendKeys("hnogales@outlook.com");
		password.sendKeys("superDuperSecretPassword");
		loginBtn.click();
		
		System.out.println("Login done with click");
		
		//Using submit method to submit the form. Submit used on password field 
		
		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("idk@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("This Is a super loooong password");
		driver.findElement(By.id("SubmitLogin")).submit();
		System.out.println("Login done using submit method");
		
		driver.quit();
		
		// TROUBLE SHOOTING
		
		/*
		 * If you encounter NoSuchElementException() while finding elements, 
		 * it means that the element is not found in the page at the point the Web driver accessed the page.
		 * 
		 * 1. Check your locator again using Firepath or Inspect Element in Chrome.
		 * 2. Check whether the value you used in the code is different from the one for the element in Firepath now.
		 * 3. Some properties are dynamic for few elements. In case, you find that the value is different and is changing dynamically, 
		 * 	  consider using By.xpath() or By.cssSelector() which are more reliable but complex ways.
		 * 4. Sometimes, it could be a wait issue too i.e., the Web driver executed your code even before the page loaded completely, etc.
		 * 5. Add a wait before findElement() using implicit or explicit waits.
		 * 
		 */
		
	}

}
