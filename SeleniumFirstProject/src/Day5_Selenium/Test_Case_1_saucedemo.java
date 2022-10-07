package Day5_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_1_saucedemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		String username = "standard_user";
		String password = "secret_sauce";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
		
		WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		
		usernameField.sendKeys(username);
		
		WebElement passwordField= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		passwordField.sendKeys(password);
		
		WebElement logInbtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		logInbtn.click();
		Thread.sleep(2000);
		
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class, 'inventory_item_price')]"));
		
		int results = price.size();
		
		System.out.println("Number of items: " + price.size());
		
		// TWO WAYS TO LOOP
		
		for(int i = 0; i < results ; i++) {

		String total = price.get(i).getText();
		System.out.println("Price: " + i + " " + total);
		Thread.sleep(2000);
		
		}
		
		for(WebElement element : price) {
			String thePrice = element.getText();
			System.out.println("Item price is : " + price );
			Thread.sleep(2000);
		}
		
		driver.close();
	}
}
