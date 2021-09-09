package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG9_RadioButton_CheckBox {
	
	public static void main(String[] args) {
		
		//Declaring and instantiating of objects/variables
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		// Radio button 1 is selected 
		
		radio1.click();
		System.out.println("Radio button 1 is selected");
		
		// Radio button 1 de-selected and radio button 2 selected
		
		radio2.click();
		System.out.println("Radio button 2 is selected");
		
		// Selecting CheckBox
		
		WebElement opt1 = driver.findElement(By.id("vfb-6-0"));
		
		// This will toggle the check box 
		
		opt1.click();
		
		// Checking whether the check box is toggled or not 
		
		if(opt1.isSelected()) {
			
			System.out.println("Check box is selected");
		} else {
			
			System.out.println("Check box is toggled off");
		}
		
		
		//Selecting Checkbox and using isSelected Method		
        driver.get("http://demo.guru99.com/test/facebook.html");		
        
        // checking if check box is persisiting 
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
       
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+ chkFBPersist.isSelected());							
        }
		
        driver.quit();
	}

}
