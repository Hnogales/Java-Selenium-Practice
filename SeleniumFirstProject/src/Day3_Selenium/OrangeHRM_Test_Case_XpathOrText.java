package Day3_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Test_Case_XpathOrText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://orangehrm-demo-6x.orangehrmlive.com/";
		String username = "admin";
		String password = "admin123";
		String expectedTitle = "Personal Details";
		String newID = "1022122";
		 
		driver.get(baseURL);
		
		WebElement usernameInput = driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
		String attributeValue = usernameInput.getAttribute("value");
		for(int i = 0; i < attributeValue.length(); i++) {
			usernameInput.sendKeys(Keys.BACK_SPACE);
		}
		
		usernameInput.clear();
		usernameInput.sendKeys(username);
		
		WebElement passwordInput = driver.findElement(By.xpath("//input[contains(@id, 'txtPassword')]"));
		String attributeValue2 = passwordInput.getAttribute("value");
		for(int i = 0; i < attributeValue2.length(); i++) {
			passwordInput.sendKeys(Keys.BACK_SPACE);
		}
		
		passwordInput.clear();
		passwordInput.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"btnLogin\"]"));
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement myInfo = driver.findElement(By.xpath("//span[text()='My Info']"));
		myInfo.click();
		Thread.sleep(10000);

		String actualTitle = driver.getTitle();
		System.out.println("This is the current Title: " + actualTitle);

		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		WebElement employeeID = driver.findElement(By.xpath("//input[@id='employeeId']"));
		employeeID.clear();
		employeeID.sendKeys(newID);

		
		WebElement saveButton = driver.findElement(By.xpath("//button[text() = 'Save']"));
		saveButton.click();
		
		WebElement actualEmployeeID = driver.findElement(By.xpath("//input[@id=\"employeeId\"]")); // Tried Verifying employee ID but unsuccessful 
		String employeeIDVerification = actualEmployeeID.getAttribute("id");
	
		System.out.println("This is the current employeeID: " + employeeIDVerification);
	
		
		
		
		
	}

}
