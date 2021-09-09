package Dynamic_Web_Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Tables {
	
	public static void main(String[] args) {
		
		WebDriver wd; 
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		wd = new ChromeDriver();
		
		wd.get("http://demo.guru99.com/test/web-table-element.php");
		
		// Number of columns 
		
		List  columns = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		System.out.println("Number of columns: " + columns.size());
		
		// Number of rows 
		
		List rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		
		System.out.println("Number of rows: " + rows.size());
		
		wd.close();
		
		/*
		 * Code explanation:
		 * 
		 * - Here we have first declared Web Driver object “wd” &initialized it to chrome driver.
		 * - We use List <WebElement> to total number of columns in “col”.
		 * - findElements commands returns a list of ALL the elements matching the specified locator
		 * - using findElements and X-path //*[@id=\”leftcontainer\”]/table/thead/tr/th we get all the columns
		 * - Similarly, we repeat the process for rows.
		 * 
		 */
		
		
	}

}
