package Day6_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class swagLabsTests {

	public class SwagLabsTests {

		WebDriver driver;
		String validUsername = "standard_user";
		String validPassword = "secret_sauce";

		String invalidUsername = "invalid_user";
		String invalidPassword = "secret_sauce";
		String expectedInvalidLoginMessage = "Epic sadface: Username and password do not match any user in this service";

		// Test case 1
		// go to https://saucedemo.com
		// log in with valid username = standard_user password = secret_sauce
		// Verify that you are logged in successfully.

		@Test
		public void validLogIn() throws InterruptedException {
			driver.get("https://saucedemo.com");
			Thread.sleep(1000);
			WebElement username = driver.findElement(By.id("user-name"));
			WebElement password = driver.findElement(By.id("password"));
			Assert.assertTrue(username.isDisplayed());

			username.sendKeys(validUsername);
			password.sendKeys(validPassword);

			WebElement logInBtn = driver.findElement(By.id("login-button"));
			logInBtn.click();
			Thread.sleep(2000);
			WebElement inventoryContainer = driver.findElement(By.id("inventory_container"));
			Assert.assertTrue(inventoryContainer.isDisplayed());

		}

		// Test case 2
		// go to https://saucedemo.com
		// log in with invalid username = invalid_user password = secret_sauce
		// Verify that you are not logged in, and you get the error message of:
		// “Epic sadface: Username and password do not match any user in this service”

		@Test
		public void invalidLogin() throws InterruptedException {
			driver.get("https://saucedemo.com");
			WebElement username = driver.findElement(By.id("user-name"));
			WebElement password = driver.findElement(By.id("password"));
			Assert.assertTrue(username.isDisplayed());
			
			username.sendKeys(invalidUsername);
			password.sendKeys(invalidPassword);
			WebElement logInBtn = driver.findElement(By.id("login-button"));
			logInBtn.click();
			Thread.sleep(2000);
			WebElement invalidErrorElement = driver.findElement(By.cssSelector("h3[data-test=error]"));
			Assert.assertEquals(invalidErrorElement.getText(), expectedInvalidLoginMessage);
		}

		@BeforeTest
		public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "./src/utility/chromedriver.exe");
			driver = new ChromeDriver();
			// driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		@AfterTest
		public void afterTest() {
			driver.quit();
		}

	}

}
