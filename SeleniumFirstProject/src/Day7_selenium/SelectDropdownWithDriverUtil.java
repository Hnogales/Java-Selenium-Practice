package Day7_selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.BrowserUtils;
import utility.Driver;

public class SelectDropdownWithDriverUtil {

	
	String url = "https://amazon.com";
	
	BrowserUtils utils = new BrowserUtils();
  @Test
  public void selectByIndex() throws InterruptedException {
	  Driver.getDriver().get(url);
	  WebElement selectDropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));
	  Select letsSelect = new Select(selectDropdown);
	  letsSelect.selectByIndex(3);
	  System.out.println("selected by index");
	  Thread.sleep(4000);
  }
  @Test
  public void selectByValue() throws InterruptedException {
	  Driver.getDriver().get(url);
	  WebElement selectDropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));
	  Select letsSelect = new Select(selectDropdown);
	  letsSelect.selectByValue("search-alias=appliances");
	  System.out.println("selected by value");
	  Thread.sleep(4000);
  }
  @Test
  public void selectByVisibleText() throws InterruptedException {
	  Driver.getDriver().get(url);
	  WebElement selectDropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));
	  Select letsSelect = new Select(selectDropdown);
	  letsSelect.selectByVisibleText("Home & Kitchen");
	  System.out.println("selected by visible text");
	  Thread.sleep(4000);
  }
  @Test
  public void getFirstSelectedOption() {
	  Driver.getDriver().get(url);
	  WebElement selectDropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));
	  Select letsSelect = new Select(selectDropdown);
	  WebElement selectedOption = letsSelect.getFirstSelectedOption();
	  System.out.println("Selected option is : " + selectedOption.getText());
	  Assert.assertEquals(selectedOption.getText(), "All Departments");  
  }
  @Test
  public void getAllOptions() {
	  Driver.getDriver().get(url);
	  WebElement selectDropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));
	  Select letsSelect = new Select(selectDropdown);
	  List<WebElement> allOptions = letsSelect.getOptions();
	  for (WebElement element : allOptions) {
		  System.out.println(element.getText());
	}
  }
  @BeforeMethod  // is executed once before each test.
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/primetech/Documents/seleniumProject/chromedriver");
	  Driver.getDriver().get(url);
		// driver.manage().window().maximize();
	  Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("This is Before Method.");
  }
  @AfterMethod // is executed once after each test.
  public void afterMethod() {
	  Driver.getDriver().quit();
	  System.out.println("This is After Method.");
  }
}
