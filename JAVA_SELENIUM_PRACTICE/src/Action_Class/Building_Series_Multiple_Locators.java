package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Building_Series_Multiple_Locators {
	
	public static void main(String[] args) {
		
		// https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		String baseURL = "http://www.facebook.com/";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		WebElement textUsername = driver.findElement(By.id("email"));
		
		// Actions Class Called 
		
		Actions builder = new Actions(driver);
		
		// This will type "hello" in uppercase
		Action seriesOfActions = builder.moveToElement(textUsername).click().keyDown(textUsername, Keys.SHIFT)
				.sendKeys(textUsername, "hello")
				.keyUp(textUsername, Keys.SHIFT)
		
				.doubleClick(textUsername) // This will highlight the text "Hello"
			
				.contextClick() // This will bring up the context menu 
				.build();
		
		seriesOfActions.perform();
		
		driver.quit();
		
	}

}
