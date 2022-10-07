package Day2_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed_Test_Case_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// for reference: https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/package-summary.html
		
		/*
		 * 	1. go to indeed.com
			2. get the current URL and store it in a variable called homeURL.
			3. get the website title and store it in a variable homeTitle.
			4. find the input field for what and type SDET
			5. find the input field for where, clear the field first and type washington DC
			6. find the Find Jobs button and click on it.
			7. get the current URL and store is a variable searchURL.
			8. get the website title and store it in a variable searchTitle.
			9. verify that searchURL does not equal to homeURL and contains the search criteria.  ????
			10. verify that searchTitle does not equal to homeTitle and has the search criteria.  ????
			11. Get Text of the JobsInLocation field, store it in a variable, then verify if it’s equals to your
			search criteria. ????
		 */

//		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://indeed.com");
//		
//		String homeURL = driver.getCurrentUrl(); // 2
//		System.out.println("This is the current URL " + homeURL);
//		
//		String homeTitle = driver.getTitle();
//		System.out.println("This is the current Title: " + homeTitle);
//		
//		driver.findElement(By.id("text-input-what")).sendKeys("SDET"); // 4
//		
//		
//		WebElement input = driver.findElement(By.name("l")); // 5
//		
//		input.click();
//		Thread.sleep(2000);
//		
////		input.sendKeys(Keys.BACK_SPACE);	// Can also do this but it is time consuming
//		
//		input.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE)); // .chord() multiple keys pressed simultaneously // keys.CONTROL is ctrl+a // 
//		Thread.sleep(2000);
//		input.sendKeys("Washington DC");
//
//		driver.findElement(By.className("icl-WhatWhere-button")).click(); // 6 
//		
//		String searchURL = driver.getCurrentUrl();	// 7				
//		System.out.println("This is the current URL " + searchURL); 
//		
//		String searchTitle = driver.getTitle(); // 8
//		System.out.println("This is the website title: " + searchTitle);
//		
//		if(searchURL != homeURL) { // 9
//			System.out.println("URLs do not match, good to go");
//		} else {
//			System.out.println("URLs match, please fix");
//		}
//	
//		if( searchTitle != homeTitle) { // 10
//		System.out.println("URLs do not match, good to go");
//		} else {
//		System.out.println("URLs match, please fix");
//		}	
//		
//		WebElement jobsLocation = driver.findElement(By.linkText("JobsInLocation"));
		
		//driver.close();
		
		
		// ---------------------------------------Helil----------------------------------------------------------
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Desktop\\Prime Tech\\Programs\\Selenium\\chromedriver.exe");
		
		WebDriver driver2 = new ChromeDriver();
		
		// 1. go to indeed.com
		driver2.get("https://indeed.com");
		
		// 2. get the current URL and store it in a variable called homeURL.
		String homeURL = driver2.getCurrentUrl();
		
		// 3. get the website title and store it in a variable homeTitle.
		String homeTitle = driver2.getTitle();
		
		// 4. find the input field for what and type SDET 
		WebElement inputWhat = driver2.findElement(By.id("text-input-what"));
		inputWhat.sendKeys("SDET");
		
		// 5. find the input field for where, clear the field first and type washington DC
		WebElement inputWhere = driver2.findElement(By.id("text-input-where"));
		String attributeValue = inputWhere.getAttribute("value");
		
		for(int i = 0; i < attributeValue.length(); i++) {
			inputWhere.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
		}
		inputWhere.sendKeys("Washington, DC");
		
		// 6. find the Find Jobs button and click on it.
		driver2.findElement(By.className("icl-Button--md")).click();
		
		// 7. get the current URL and store is a variable searchURL.
		String searchURL = driver2.getCurrentUrl();
		
		// 8. get the website title and store it in a variable searchTitle.
		String searchTitle = driver2.getTitle();
		
		// 9. verify that searchURL does not equal to homeURL and contains the search criteria.
		System.out.println("Search URL is: " + searchURL);
		
		if((!searchURL.equals(homeURL)) && searchURL.contains("Washingston") && searchURL.contains("DC")) { // contains is case sensitive
			System.out.println("Search URL contains the location criteria and Test Pass.");
			} else {
				System.out.println("Test Fail");
			}
		// 10. verify that searchTitle does not equal to homeTitle and has the search criteria.
		System.out.println("Search title is: " + searchTitle);
		
		if((!searchTitle.equals(homeTitle) && (searchTitle.contains("Sdet")))) {
			System.out.println("Search Title contains the job search criteria and Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		
		// 11. Get Text of the JobsInLocation field, store it in a variable, then verify if it's equals to your search criteria.
		WebElement jobsInLocation = driver2.findElement(By.id("JobsInLocation"));
		String jobsText = jobsInLocation.getText().trim();
		System.out.println("Job text is: " + jobsText);
		
		if(jobsText.contains("SDET") && jobsText.contains("Washington, DC")) {
			System.out.println("Test Pass");
		} else
			System.out.println("Test Fail");
		
		driver2.quit();	
				
	}
}
