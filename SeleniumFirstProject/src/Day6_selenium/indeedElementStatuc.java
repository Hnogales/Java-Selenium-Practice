package Day6_selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeedElementStatuc {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/primetech/Documents/seleniumProject/chromedriver");

			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();   // maximizes the current window
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Test case 1
			// go to https://indeed.com
			// check if the search fields are enabled and displayed.
			
			driver.get("https://indeed.com");
			WebElement whatField = driver.findElement(By.id("text-input-what"));
			WebElement whereField = driver.findElement(By.id("text-input-where"));
			Thread.sleep(1000);
			if (whatField.isEnabled() && whatField.isDisplayed()) {
				System.out.println("What field is enabled and displayed on the web page.");
			} else {
				System.out.println("What field is not displayed or enabled.");
			}
			
			if (whereField.isEnabled() && whereField.isDisplayed()) {
				System.out.println("where field is enabled and displayed on the web page.");
			} else {
				System.out.println("where field is not displayed or enabled.");
			}
			
			
			// Test case 2
			// go to https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
			// find those available radio buttons.
			// check if it’s displayed and enabled, is true check if it’s selected, if false select and
			// check if it’s selected.
			
			driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.cssSelector("[class=radio-inline] > input"));
			
			for (int i = 0; i < list.size(); i++) {
				
				if (list.get(i).isDisplayed() && list.get(i).isEnabled()) {
					
					if (list.get(i).isSelected()) {
						System.out.println("the button is already selected.");
					} else {
						list.get(i).click();
						System.out.println("Just clicked on the radio botton.");
					}
					Thread.sleep(2000);
					
					boolean isSelected = list.get(i).isSelected();
					System.out.println("Radio button " + i + " is selected = " + isSelected);
					
				} else {
					System.out.println(list.get(i) + " is not displayed or enabled.");
				}
				
			}

		}

	}


