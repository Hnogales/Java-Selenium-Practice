package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hovering {
	
public static void main(String[] args) {
	
	/*
	 * Action class in Selenium 
	 * 
	 * is a built-in feature provided by the selenium for handling keyboard and mouse events. 
	 * It includes various operations such as multiple events clicking by control key, drag and drop events and many more.
	 * 
	 * METHODS: 
	 * 
	 *  1. clickAndHold() - Clicks (without releasing) at the current mouse location.
	 *  
	 *  2. contextClick() - Performs a context-click at the current mouse location. (Right Click Mouse Action)
	 *  
	 *  3. doubleClick()  - Performs a double-click at the current mouse location.
	 *  
	 *  4. dragAndDrop(source, target) - Performs click-and-hold at the location of the source element,
	 *  								 moves to the location of the target element, then releases the mouse.
	 *  			
	 *  								Parameters - source- element to emulate button down at.
	 *  											 target- element to move to and release the mouse at.
	 *  
	 *  5. dragAndDropBy(source, x-offset, y-offset) - Performs a modifier key press.
	 *  											   Does not release the modifier key - subsequent interactions may assume it's kept pressed.
	 *  
	 *  								Parameters - modifier_key - any of the modifier keys (Keys.ALT, Keys.SHIFT, or Keys.CONTROL)
	 *  
	 *  6. keyUp(modifier _key) - Performs a key release.
	 *  
	 *  								Parameters - modifier_key - any of the modifier keys (Keys.ALT, Keys.SHIFT, or Keys.CONTROL)
	 *  
	 *  7. moveByOffset(x-offset, y-offset) - Moves the mouse from its current position (or 0,0) by the given offset.
	 *  
	 *  								Parameters - x-offset- horizontal offset. A negative value means moving the mouse left.
	 *  											 y-offset- vertical offset. A negative value means moving the mouse down.
	 *  
	 *  8. moveToElement(toElement) - Moves the mouse to the middle of the element.
	 *  
	 *  								Parameters - toElement- element to move to.
	 *  
	 *  9. release()				- Releases the depressed left mouse button at the current mouse location
	 *  
	 *  10. sendKeys(onElement, charsequence) - Sends a series of keystrokes onto the element.
	 *  
	 *  								Parameters - onElement - element that will receive the keystrokes, usually a text field
	 *  										     charsequence - any string value representing the sequence of keystrokes to be sent
	 * 
	 */
	
	// Mouse Hovering
		
		String URL = "http://demo.guru99.com/test/newtours/";
		
		System.setProperty("webdriver.chrome.driver","/Users/Diego/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		WebElement link_Home = driver.findElement(By.linkText("Home")); // xpath - //a[contains(text(),'Home')]
		
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "//table/tbody/tr/td" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
		
							+ "/table/tbody/tr")); // ERROR 
		
		Actions builder = new Actions(driver);
			
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		
		String bgColor = td_Home.getCssValue("background-color");
		
		System.out.println("before hover: " + bgColor);
		
		mouseOverHome.perform();
		
		bgColor = td_Home.getCssValue("background-color");
		
		System.out.println("after hover: " + bgColor);
		
		driver.quit();
		

		
		
	}

}
