package Day6_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonCLassACtivityRecap {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/primetech/Documents/seleniumProject/chromedriver");

			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();   // maximizes the current window
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Test case / home work
			// go to amazon.com click on sign
			// verify that you are on sign in page (either by sign-in text or email field).
			// navigate back, and navigate forward
			// verify that you are on sign in page (either by sign-in text or email field).
			// click on create new account, verify you are on new account create page.
			// navigate back, verify you are on the sign-in page.
			// navigate forward, verify you are on the create account page.
			// click on the create account button without filling the form
			// verify error messages displayed and get text to verify:
			// Enter your name
			// Enter your email
			// Enter your password
			
			String expectedHomePageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
			
			driver.get("https://amazon.com");
			driver.findElement(By.linkText("Sign in securely")).click();
			Thread.sleep(2000);
			
			if (driver.findElement(By.xpath("//h1[contains(text(), 'Sign-In')]")).isDisplayed()) {
				System.out.println("We are on the Sign In page.");
			} else {
				System.out.println("Sign in element is not displayed.");
			}
			
			driver.navigate().back();
			Thread.sleep(1000);
			if (driver.getTitle().equals(expectedHomePageTitle)) {
				System.out.println("We are on the home page.");
			}else {
				System.out.println("Home page is not displayed.");
			}
			
			driver.navigate().forward();
			Thread.sleep(1000);
			if (driver.findElement(By.xpath("//h1[contains(text(), 'Sign-In')]")).isDisplayed()) {
				System.out.println("We are on the Sign In page.");
			} else {
				System.out.println("Sign in element is not displayed.");
			}
			
			driver.findElement(By.id("createAccountSubmit")).click();
			Thread.sleep(1000);  
			
			if (driver.findElement(By.xpath("//h1[contains(text(), 'Create account')]")).isDisplayed()) {
				System.out.println("We are on the create account page.");
			} else {
				System.out.println("Create account element is not displayed.");
			}
			
			driver.navigate().back();
			Thread.sleep(1000);
			if (driver.findElement(By.xpath("//h1[contains(text(), 'Sign-In')]")).isDisplayed()) {
				System.out.println("We are on the Sign In page.");
			} else {
				System.out.println("Sign in element is not displayed.");
			}
			
			driver.navigate().forward();
			Thread.sleep(1000);
			if (driver.findElement(By.xpath("//h1[contains(text(), 'Create account')]")).isDisplayed()) {
				System.out.println("We are on the create account page.");
			} else {
				System.out.println("Create account element is not displayed.");
			}
			
			driver.findElement(By.id("continue")).click();
			Thread.sleep(1000);
			
			WebElement errorNameMessage = driver.findElement(By.xpath("//div[contains(text(), 'Enter your name')]"));
	        if (errorNameMessage.isDisplayed() && errorNameMessage.getText().equals("Enter your name")) {
				System.out.println("Enter your name message displayed and correct.");
			} else {
				System.out.println("Enter your name message is not displayed or correct.");
			} 
	        
	        WebElement errorEmailMessage = driver.findElement(By.xpath("//div[contains(text(), 'Enter your email')]"));
	        if (errorEmailMessage.isDisplayed() && errorEmailMessage.getText().equals("Enter your email")) {
				System.out.println("Enter your email message displayed and correct.");
			} else {
				System.out.println("Enter your email message is not displayed or correct.");
			}
	        
	        WebElement errorPasswordMessage = driver.findElement(By.xpath("//div[contains(text(), 'Enter your password')]"));
	        if (errorPasswordMessage.isDisplayed() && errorPasswordMessage.getText().equals("Enter your password")) {
				System.out.println("Enter your password message displayed and correct.");
			} else {
				System.out.println("Enter your password message is not displayed or correct.");
			}
		}
	}


