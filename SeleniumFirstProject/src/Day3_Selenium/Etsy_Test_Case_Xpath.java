package Day3_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_Test_Case_Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		/* Test Case
		 * 
		 * 	Go to etsy.com
			Click on Sign in.
			Click on Register.
			Enter an email address, (jon.dow@gmail.com)
			Enter first name.
			Enter password.
			Click on Register.
			Verify you get the error message:
			"Sorry, the email you have entered is already in use."
		 */
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://etsy.com");
		
//		driver.findElement(By.xpath("//wt-flex-shrink-xs-0\"[@id=\"gnav-header-inner\"]/div[3]/nav/ul/li[1]/button")).click();
//		
//		
//		WebElement register = driver.findElement(By.xpath("/html/body/div[9]/div[4]/div/div/div/div/div/div[2]/form/div[1]/div/div[1]/div/button"));
//		
//		register.click();
//		
//		register.sendKeys("jon.dow@gmail.com");
//		
//		WebElement firstName = driver.findElement(By.xpath("/html/body/div[9]/div[4]/div/div/div/div/div/div[2]/form/div[1]/div/div[3]/input"));
//		
//		firstName.sendKeys("Jon");
//		
//		WebElement password = driver.findElement(By.xpath("/html/body/div[9]/div[4]/div/div/div/div/div/div[2]/form/div[1]/div/div[4]/div[1]/input"));
//		
//		password.sendKeys("JonDowPassword");
//		
//		WebElement register2 = driver.findElement(By.xpath("/html/body/div[9]/div[4]/div/div/div/div/div/div[2]/form/div[1]/div/div[6]/div/button"));
//		
//		register2.click();
		
		
		// ------------------------------- Helil ---------------------------------------------
		
		String baseUrl = "https://etsy.com";
		String registerEmail = "jon.dow@gmail.com";
		String userName = "Jon";
		String userPassword = "1234JonDow";
		String error = "Sorry, the email you have entered is already in use.";
		
		driver.get(baseUrl);
		
		WebElement signIn = driver.findElement(By.xpath("//button[@class=\"wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin\"]"));  
		signIn.click();
		Thread.sleep(2000);		
		
		WebElement registerButton = driver.findElement(By.xpath("//button[@class=\"wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register\"]"));
		registerButton.click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(registerEmail);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstName.sendKeys(userName);
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(userPassword);
		Thread.sleep(2000);
		
		WebElement registerButton2 = driver.findElement(By.xpath("//button[@name='submit_attempt']"));
		registerButton2.click();
		
		
		// Verifying error message
		WebElement errorMessage  = driver.findElement(By.xpath("//div[@id='aria-join_neu_email_field-error']"));
		String actualErrorMessage = errorMessage.getText(); //getText()
		
		if(actualErrorMessage.equals(error)){
			System.out.println("pass");
		} else
			System.out.println("Fail");
		

		driver.quit();
	}
	
	

}
