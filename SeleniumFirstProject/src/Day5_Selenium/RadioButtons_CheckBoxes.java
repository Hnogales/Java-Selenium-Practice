package Day5_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_CheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		Thread.sleep(2000);
		
		WebElement male = driver.findElement(By.cssSelector("[value='Male'][name='optradio']"));
		WebElement female = driver.findElement(By.cssSelector("[value='Female'][name='optradio']"));
		
		
		if (male.isSelected()) { // if the element is selected, this returns true
			System.out.println("It's already selected.");
		} else {
			System.out.println("not selected");
			male.click();
		}
	
		driver.findElement(By.id("buttoncheck")).click();
		
		//working with checkboxes
		
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		Thread.sleep(2000);
		
		WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
		
		
		if(checkbox.isSelected()) {
			System.out.println("the checkbox is already selected");
		} else {
			System.out.println("The check box is not already selected.");
			checkbox.click();
		}
		
		
	}
	

}
