package Broken_Links;

import java.io.IOException;
import java.net.HttpURLConnection; 
import java.net.MalformedURLException;
import java.net.URL;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_Broken_Links {
	
	/*
	 * Important Notes for this code:
	 * 
	 * import java.net.HttpURLConnection; - Using the methods in this package, 
	 * 										we can send HTTP requests and capture HTTP 
	 * 										response codes from the response.
	 * 
	 * 
	 */
	
	private static WebDriver driver = null; // You can put the WebDriver instance outside 
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		String homepage = "http://www.zlti.com";
		String url = "";
		HttpURLConnection huc = null; // HttpURLConnection - used to make a single request 
		int respCode = 200;
		
		
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get(homepage);
		
		// Identifying all links in the wbepage and storing them in List
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		// Obtaining Iterator to traverse(go through) through the List 
		Iterator<WebElement> it = links.iterator(); // Need more covering on iteration
		
		while(it.hasNext()){
			
			url = it.next().getAttribute("href"); // Getting href of anchor tag and storing it in url 
			
			System.out.println(url);
			
			if(url == null || url.isEmpty()) { // checking if url is null or empty and skipping if condition is satisfied
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			} 
			
			if (!url.startsWith(homepage)) { // checking whether URL belongs to main domain or third party. Skip if it belongs to third 
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			
			// Sending http requests
			try {
				
				/* HttpURLConnection class has methods to send HTTP request and capture HTTP response code. 
				 * So, output of openConnection() method (URLConnection) is type casted to HttpURLConnection.
				 */
				
				 huc = (HttpURLConnection)(new URL(url).openConnection());
				
				 // Requesting HEAD instead of GET. so that only headers are returned and not document body
				 huc.setRequestMethod("HEAD");
				 huc.connect();	
				 
				 // validtaing link using getResponseCode() method we can get response code for the request
				 respCode = huc.getResponseCode();
				 
				 // Based on response code we will try to check link status.
				 if(respCode >= 400) {
					 System.out.println(url + " is a broken link");
				 } else {
					 System.out.println(url + " is a valid link");
				 }
				 
			} catch(MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		driver.quit();
	}
}
