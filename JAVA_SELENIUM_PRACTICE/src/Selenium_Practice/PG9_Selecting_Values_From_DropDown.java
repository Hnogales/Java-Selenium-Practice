package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PG9_Selecting_Values_From_DropDown {
	
	/*
	 * selectByVisibleText()/ deselectByVisibleText() - selects/deselects an option by its displayed text
	 * 
	 * selectByValue()/ deselectByValue() - selects/deselects an option by the value of its "value" attribute
	 * 
	 * selectByIndex()/ deselectByIndex() - selects/deselects an option by its index
	 * 
	 * isMultiple()	- returns TRUE if the drop-down element allows multiple selection at a time; FALSE if otherwise
	 * 
	 * deselectAll() - deselects all previously selected options
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://demo.guru99.com/test/newtours/register.php";
		
		driver.get(URL);
		
		Select dropdownCountry = new Select(driver.findElement(By.name("country")));	
		
		dropdownCountry.selectByVisibleText("BOLIVIA");
		
		// Selecting items in a multiple SELECT elements
		
		driver.get("http://jsbin.com/osebed/2");
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(2);
		
		driver.quit();
	}

}
