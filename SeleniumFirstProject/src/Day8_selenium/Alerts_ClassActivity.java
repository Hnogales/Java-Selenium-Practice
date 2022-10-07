package Day8_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.BrowserUtils;
import utility.Driver;

public class Alerts_ClassActivity {
 
	String url = "https://demoqa.com/alerts";
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
	
//	Test case 1
	@Test
	public void test1() throws InterruptedException {
		String expectedAlertMessage = "You clicked a button";
		
		// Go to https://demoqa.com/alerts
		
		driver.get(url);
		
		// Click on the ClickMe button for the first Alert
		
		WebElement clickMeBtn = driver.findElement(By.id("alertButton"));
		clickMeBtn.click();
		Thread.sleep(3000);
		
		// declare Alert class
		Alert letshandle = driver.switchTo().alert();
		
		// getText
		String actualAlertMessage = letshandle.getText();
		System.out.println(actualAlertMessage);
		
		// then verify the text is "You clicked a button"
		Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
		
		// Accept the alert.
		letshandle.accept();
		Thread.sleep(3000);
	}
	
//	Test case 2 
	@Test
	public void test2() throws InterruptedException {
//		go to https://demoqa.com/alerts
		driver.get(url);
//		Click on the ClickMe button for the second Alert
		WebElement secondclickMeBtn = driver.findElement(By.id("timerAlertButton"));
		secondclickMeBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		// declare Alert class
		Alert letshandle = driver.switchTo().alert();
		//getText
		String actualAlertMessage = letshandle.getText();
		//verify the text is "This alert appeared after 5 seconds"
		Assert.assertEquals(actualAlertMessage, "This alert appeared after 5 seconds");
		//Accept the alert.
		letshandle.accept();
		Thread.sleep(3000);
	}
//	 Test case 3
//	go to https://demoqa.com/alerts
//	Click on the ClickMe button for the third Alert,  getText then verify the text is 
//	"Do you confirm action?" and Dismiss the alert.
	@Test
	public void test3() throws InterruptedException {
		driver.get(url);
		WebElement thirdclickMeBtn = driver.findElement(By.id("confirmButton"));
		thirdclickMeBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		// declare Alert class
		Alert letshandle = driver.switchTo().alert();
		// dismiss the alert
		String actualAlertMessage = letshandle.getText();
		Assert.assertEquals(actualAlertMessage, "Do you confirm action?");
		letshandle.dismiss();
		Thread.sleep(3000);
	}
//	Test case 4
//	go to https://demoqa.com/alerts 
//	Click on the ClickMe button for the last Alert, 
//  getText then verify the text is "Please enter your name" then enter your name and accept.
	@Test
	public void test4() throws InterruptedException {
		driver.get(url);
		WebElement lastclickMeBtn = driver.findElement(By.id("promtButton"));
		lastclickMeBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		// declare Alert class
		Alert letshandle = driver.switchTo().alert();
		String actualAlertMessage = letshandle.getText();
		Assert.assertEquals(actualAlertMessage, "Please enter your name");
		// entering a name / text
		letshandle.sendKeys("john");
		Thread.sleep(2000);
		// accept the alert
		letshandle.accept();
		Thread.sleep(3000);
	}
		
	}

