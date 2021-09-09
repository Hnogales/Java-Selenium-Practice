package ToolTIp_In_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
	
	public static void main(String[] args) {
		
		/*
		 * What is ToolTip? - 	is a text that appears when a mouse hovers an object on a web page. 
		 * 						This object can be a link, image, button, text area, etc. 
		 * 						The Tooltip text often gives more information about the object on which the user 
		 * 						hovers over mouse cursor.
		 * 
		 * There are two scenarios on how to get the tooltip Text in Selenium WebDriver
		 * 
		 * Scenario 1: Tooltip is implemented using the "title" attribute.
		 * Scenario 2: Tooltip is implemented using jQuery plugin.
		 * 
		 * SUMMARY: 
		 * 
		 *  Tool Tips are implemented in different ways –
		 *  
		 *  	- The basic implementation is based on HTML’s “title” attribute. getAttribute(title) gets the value of the tooltip.
		 *  
		 *  	- Other tool tip implementation’s like JQuery, CSS tooltips require Interactions API to create mouse hover effect.
		 *  
		 *  Advanced User Interactions API - 
		 *  
		 *   - moveToElement(element) of Actions class is used to mouse hover an element.
		 *   - Build() method of Actions class builds the sequence of user actions into an Action object.
		 *   - Perform() of Action class executes all the sequence of user actions at once.
		 *   
		 *   In order to verify a tooltip, we have to first mouse-hover the element, 
		 *   then find the element that corresponds to the tool tip and get its text or other values to verify 
		 *   against the expected values.
		 *   
		 *   
		 */
		
		// Scenario 1 
		
		String url = "http://demo.guru99.com/test/social-icon.html";
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		String expectedTooltip = "Github";
		
		// Find the github icon at the top right of the header 
		
		WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
		
		// Getting the value of the "title" attribute of the github icon 
		
		String actualTooltip = github.getAttribute("title");
		
		
		// Asserting the Tooltips value is as expected 
		
		System.out.println("Actual Tool Tip: " + actualTooltip);
		
		if(actualTooltip.equals(expectedTooltip)) {
			
			System.out.println("Test case passed"); // Works but it is hard to find when hovering
		}
		
		driver.quit();
		
		/*
		 * Code Explanation: 
		 * 
		 * - Find the WebElement representing the “github” icon.
		 * - Get its “title” attribute using the getAttribute() method.
		 * - Assert the value against the expected tooltip value.
		 * 
		 */
		
		// Scenario 2

		String baseUrl = "http://demo.guru99.com/test/social-icon.html";
		String expectedTooltip1 = "What's new in 3.2";
		
		
		driver.get(baseUrl);
		
		WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
		
		Actions builder = new Actions(driver);
		
		builder.clickAndHold().moveToElement(download);
		builder.moveToElement(download).build().perform();
		
		WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a/"));
		
		String actualTooltip1 = toolTipElement.getText();
		
		System.out.println("This is the actual Tool Tip: " + actualTooltip1);
		
		if(actualTooltip1.equals(expectedTooltip1)) {
			
			System.out.println("Test Passed");
		} else {
			
			System.out.println("Test Failed");
		}
		
		driver.close();
		
	}
	
	/* 
	 * - Find the WebElement that corresponds to the element “download now” that we will mouse-hover.
	 * - Using the Interactions API, mouse hover on to the “Download now”.
	 * - Assuming the tooltip is displayed, find the WebElement that corresponds to the link inside the tooltip i.e. the “a” tag.
	 * - Verify the link’s tooltip text retrieved using the getText() against an expected value we have stored in “expectedToolTip”
	 * 
	 */

}
