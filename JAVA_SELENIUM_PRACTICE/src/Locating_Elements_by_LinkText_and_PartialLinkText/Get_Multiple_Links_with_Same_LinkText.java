package Locating_Elements_by_LinkText_and_PartialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Multiple_Links_with_Same_LinkText {
	
	public static void main(String[] args) {								
        String baseUrl = "http://demo.guru99.com/test/newtours/";					
        System.setProperty("webdriver.chrome.driver","/Users/Diego/Downloads/chromedriver");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();		
        System.out.println(theLinkText);							
    
        theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
        
        System.out.println(theLinkText);					

        driver.quit();			

    }

}
