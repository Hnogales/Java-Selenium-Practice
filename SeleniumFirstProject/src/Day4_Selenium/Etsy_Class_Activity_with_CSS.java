package Day4_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_Class_Activity_with_CSS {
	
	public static void main(String[] args) throws InterruptedException {
		
		String baseUrl = "https://etsy.com";
		String registerEmail = "jon.dow@gmail.com";
		String userName = "Jon";
		String userPassword = "1234JonDow";
		String expectedError = "Sorry, the email you have entered is already in use.";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		
		WebElement signIn = driver.findElement(By.cssSelector(".signin-header-action"));
		signIn.click();
		Thread.sleep(2000);
		
		WebElement Register = driver.findElement(By.cssSelector(".select-register"));
		Register.click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.cssSelector("#join_neu_email_field"));
		email.sendKeys(registerEmail);
		Thread.sleep(2000);
		
		// getting attribute of email
		String CssValue = email.getAttribute("class");
		System.out.println("Class attribute vuel of email field is: " + email.getAttribute("class"));
		// getting CSS value
		System.out.println("CSS value of email field is:" + email.getCssValue(CssValue));
		
		WebElement name = driver.findElement(By.cssSelector("#join_neu_first_name_field"));
		name.sendKeys(userName);
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.cssSelector("#join_neu_password_field"));
		password.sendKeys(userPassword);
		Thread.sleep(2000);
		
		WebElement registerbtn2 = driver.findElement(By.cssSelector("button[value=register]"));
		registerbtn2.click();
		
		//CSS value of register button 
		System.out.println("CSS value of register button is: " + registerbtn2.getCssValue("color"));
		//Getting tagname 
		System.out.println("The tagname of register button is: " + registerbtn2.getTagName());
		
		WebElement actualErrorMessage = driver.findElement(By.cssSelector("#aria-join_neu_email_field-error"));
		
		
		String actualErrorMessage2 = actualErrorMessage.getText();
		
		System.out.println(actualErrorMessage2);
		
		if (actualErrorMessage2.equals(expectedError)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		
		driver.quit();
		
	}
	
	
	

}
