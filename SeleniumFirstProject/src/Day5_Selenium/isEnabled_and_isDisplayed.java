package Day5_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_and_isDisplayed {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://etsy.com");
		
		String registerEmail = "jon.dow@gmail.com";
		String userName = "Jon";
		String userPassword = "1234JonDow";
		
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
		
		WebElement registerbtn2 = driver.findElement(By.cssSelector("button[value=register]"));
		
		
		// Veryfying if register button isEnabled
		if(registerbtn2.isEnabled()) {
			System.out.println("Register is enabled");
		} else {
			WebElement name = driver.findElement(By.cssSelector("#join_neu_first_name_field"));
			name.sendKeys(userName);
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.cssSelector("#join_neu_password_field"));
			password.sendKeys(userPassword);
			Thread.sleep(2000);
			
			System.out.println("all info provided");
			
			if(registerbtn2.isEnabled()) {
				registerbtn2.click();
				System.out.println("clicked on register btn2");
			} else {
				System.out.println("Register button 2 is still not enabled");
			}
		}
		
		driver.quit();
		
	}

}
