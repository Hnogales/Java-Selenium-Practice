package Day6_selenium;
	
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class MyFirstTestNg {

		WebDriver driver;

		@BeforeTest
		public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "/Users/primetech/Documents/seleniumProject/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		// Test case 1
		// go to https://indeed.com
		// check if the search fields are enabled and displayed.

		@Test
		public void test1() {
			driver.get("https://indeed.com");
			WebElement whatField = driver.findElement(By.id("text-input-what"));
			WebElement whereField = driver.findElement(By.id("text-input-where"));
			Boolean isEnabled = whatField.isEnabled();
			Boolean isDisplayed = whereField.isDisplayed();

			Assert.assertTrue(whatField.isEnabled());
			Assert.assertTrue(isDisplayed);
			
			//Assert.assertEquals(element.getText(), expected);

		}

		// Test case 2
		// go to https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
		// find those available radio buttons.
		// check if it’s displayed and enabled, is true check if it’s selected, if false
		// select and
		// check if it’s selected.

		@Test
		public void test2() throws InterruptedException {
			driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.cssSelector("[class=radio-inline] > input"));
			
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).isDisplayed() && list.get(i).isEnabled()) {
					Assert.assertTrue(list.get(i).isSelected(), "Radio button is not selected.");
					if (list.get(i).isSelected()) {
						System.out.println("the button is already selected.");
					} else {
						list.get(i).click();
					}
					Thread.sleep(2000);
					Assert.assertTrue(list.get(i).isSelected(), "The buttons are not selected.");
					
				} else {
					System.out.println(list.get(i) + " is not displayed or enabled.");
				}
			}
		}

		@AfterTest
		public void afterTest() {
			driver.quit();
		}	  
  }

