package Day7_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class SelectDropdownREEDO {
	
	WebDriver driver;
	String url = "https://amazon.com";
	
// select by Index
  @Test
  public void selectByIndex() throws InterruptedException {
		driver.get(url);
		WebElement selectDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select letsSelect = new Select(selectDropdown);
		letsSelect.deselectByIndex(3);
		System.out.println("Selected by Index");
		Thread.sleep(4000);
  }
  
// select by Value
  @Test
  public void selectByValue() throws InterruptedException {
		driver.get(url);
		WebElement selectDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select letsSelect = new Select(selectDropdown);
		letsSelect.selectByValue("search-alias=appliances");
		System.out.println("Selected by Value");
		Thread.sleep(4000);
  }
  
//select by Visible Text
 @Test
 public void selectByVisibleText() throws InterruptedException {
		driver.get(url);
		WebElement selectDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select letsSelect = new Select(selectDropdown);
		letsSelect.deselectByVisibleText("");
		System.out.println("Selected by Visible Text");
		Thread.sleep(4000);
 }
 
 @Test
 public void getFirstSelectedOption() {
	 	driver.get(url);
		WebElement selectDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select letsSelect = new Select(selectDropdown);
		WebElement selectedOption = letsSelect.getFirstSelectedOption();
		System.out.println("Selected option is : " + selectedOption.getText());
		
 }
  
 @Test
 public void getAllOptions() {
	 	driver.get(url);
		WebElement selectDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select letsSelect = new Select(selectDropdown);
		List<WebElement> allOptions = letsSelect.getOptions();
		for(WebElement element : allOptions) {
			System.out.println(element.getText());
//			Assert.assertEquals(element.getText(),);
		}
	
		
 }
  
  @BeforeMethod // is executed once before each test.
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/primetech/Documents/seleniumProject/chromedriver");
	  driver = new ChromeDriver();
	  // driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }


}
