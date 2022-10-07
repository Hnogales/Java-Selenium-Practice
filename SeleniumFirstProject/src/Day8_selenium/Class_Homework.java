package Day8_selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.BrowserUtils;


public class Class_Homework {
 

//	Test case 1
//	go to http://demo.guru99.com/popup.php
//	Get title and store it in a variable.
//	Click on Click Me button and switch over to next window, provide an email click Submit.
//	Get text of the user ID and password and store them in variables, print them out.
//	Then verify the text “This access is valid only for 20 days.”
//	Close the window.
//	Go back to main window, and get title then verify equals to your stored title.
//	Quite driver.
	
	String url = "http://demo.guru99.com/popup.php";
	String textVerification = "This access is valid only for 20 days.";
	
	BrowserUtils utils = new BrowserUtils();
	WebDriver driver;
	
	@BeforeTest
	public void BeforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Before Method");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		driver.quit();
		System.out.println("After Method");
	}
	
	@Test
	public void TestCase1() throws InterruptedException {
		//go to http://demo.guru99.com/popup.php
		driver.get(url); 																
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		//Get title and store it in a variable.
	    WebElement title = driver.findElement(By.xpath("/html/body/div[2]/h2"));	
	    
	    //Click on Click Me button and switch over to next window, provide an email click Submit.
	    WebElement clickMeBtn = driver.findElement(By.linkText("Click Here"));
	    clickMeBtn.click();
	   
	    //Defined parent and child windows 
	    Set<String> windowIds = driver.getWindowHandles();
	    Iterator <String> iterating = windowIds.iterator();
	    String parentWindow = iterating.next();
	    System.out.println("This is the parent window: " + parentWindow);
	    String childWindow = iterating.next();
	    System.out.println("This is the child window: " + childWindow);
	    
	    // Switching to child window
	    driver.switchTo().window(childWindow);
	    Thread.sleep(2000);
	    
	    //providing email and providing email
	    WebElement email = driver.findElement(By.name("emailid"));
	    email.sendKeys("diego_hni@icloud.com");
	    
	    //clicking submit
	    WebElement clickBtn = driver.findElement(By.name("btnLogin"));
	    clickBtn.click();
	    
	    //Get text of the user ID and password and store them in variables, print them out.
	    WebElement userId = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]"));
	    System.out.println(userId.getText());
	    WebElement password = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]"));
	    System.out.println(password.getText());
	    
	    // Verifying text “This access is valid only for 20 days.”
	    WebElement text = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/h3"));
	    Assert.assertEquals(text.getText(), textVerification);
	    Thread.sleep(3000);
	    
	    //Close the window.
	    driver.close();
	    
	    //Go back to main window, and get title then verify equals to your stored title.
	    driver.switchTo().window(parentWindow);
	    WebElement titleAfterTest = driver.findElement(By.xpath("/html/body/div[2]/h2"));
	    System.out.println("Title after window is closed " + titleAfterTest.getText());
	    Assert.assertEquals(title.getText(), titleAfterTest.getText());
	    
	}

	

}
