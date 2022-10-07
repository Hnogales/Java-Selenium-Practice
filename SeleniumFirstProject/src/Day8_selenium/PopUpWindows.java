package Day8_selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.BrowserUtils;

public class PopUpWindows {
  
	String url = "https://demoqa.com/browser-windows";
	BrowserUtils utils = new BrowserUtils();
	WebDriver driver;
	
	@BeforeMethod // is executed once before each test.
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("This is Before Method.");
	}
	
	@AfterMethod // is executed once after each test.
	public void afterMethod() {
		driver.quit();
		System.out.println("This is After Method.");
	}
	
	
//	Test case 2
//	go to https://demoqa.com/browser-windows
//	Get the main window ID,
//	Click on the New Tab button
//	Get window IDs and store it into SET
//	Get the first window ID and Verify it matches with the main window id in step 1
//	Switch to the second window
//	Get the page Text and verify it is “This is a sample page”
//	Close the window
//	Switch back to the main window,
//	Verify you are on the main window.
	
	@Test
	public void test2() throws InterruptedException {
		driver.get(url);
		String mainWindowId = driver.getWindowHandle(); // returns the window id of the tab that the driver is on.
		System.out.println("Main window is: " + mainWindowId);
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		Thread.sleep(3000);
		
		Set<String> windowIds = driver.getWindowHandles(); // set and list are completely different (INTERVIEW QUESTION)
		Iterator <String> letsIterate = windowIds.iterator(); // {windowid1, windowid2}
		String parentWindow = letsIterate.next(); 
		Assert.assertEquals(parentWindow, mainWindowId); // verifying if they match
		System.out.println("Parent window id is: "+ parentWindow);
		String childWindowId = letsIterate.next();
		System.out.println("Child window id is: "+ childWindowId);
		
		//switched the driver focus to new window
		driver.switchTo().window(childWindowId);
		//Switch the focus of future commands for this driver to the window with the given name/handle
		Thread.sleep(4000);
		WebElement sample = driver.findElement(By.id("sampleHeading"));
		Assert.assertEquals(sample.getText(), "This is a sample page");
		driver.close(); //closing child Window
		driver.switchTo().window(parentWindow); // switching to main window
		Thread.sleep(2000);
		Assert.assertTrue(newTab.isDisplayed()); // asserting if the new tab is displayed
		System.out.println("new tab button is displayed, text pass.");
		
		
	}
	
}
