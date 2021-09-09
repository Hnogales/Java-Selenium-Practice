package Locating_Elements_by_LinkText_and_PartialLinkText;
import org.openqa.selenium.By;		
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.chrome.ChromeDriver;	

	public class LinkText_and_PartialLinkText {
		
		// https://www.guru99.com/locate-by-link-text-partial-link-text.html
	 		
	    public static void main(String[] args) {	
	    	
	        String baseUrl = "http://demo.guru99.com/test/accessing-link.html";					
	        System.setProperty("webdriver.chrome.driver","/Users/Diego/Downloads/chromedriver");					
	        WebDriver driver = new ChromeDriver();					
	        		
	        driver.get(baseUrl);					
	        driver.findElement(By.partialLinkText("here")).click();					
	        System.out.println("Title of page is: " + driver.getTitle());							
	        driver.quit();			
	    		
	        
	}

}
