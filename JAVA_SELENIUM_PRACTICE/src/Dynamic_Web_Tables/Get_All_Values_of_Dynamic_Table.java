package Dynamic_Web_Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Values_of_Dynamic_Table {	
	
	public static void main(String[] args) {
		
	WebDriver wd;
	
	System.setProperty("webdriver.chrome.driver","/Users/Diego/Downloads/chromedriver");
	
	wd = new ChromeDriver();
	
	wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	wd.get("http://demo.guru99.com/test/table.html");
	
	// Locating Table
	
	WebElement myTable = wd.findElement(By.xpath("/html/body/table/tbody"));
	
	// Locating rows of the table (dont forget to use findElement(S) when it is a List)
	
	List < WebElement > rows_table = myTable.findElements(By.tagName("tr"));
		
	// Calculating the number of rows in the table 
	
	int rows_count = rows_table.size();
	
	System.out.println("This is the rows count: " + rows_count); // 5
	
	// Loop to execute until last row of table 
	
	for(int row = 0; row < rows_count; row++) {
		
		// Locating columns(cells) of that specific row.
		List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td")); 
		
		// To calculate no of columns (cells). In that specific row.
		 int columns_count = Columns_row.size();
		 System.out.println("Number of cells In Row " + row + " are " + columns_count);
		 
		//Loop will execute till the last cell of that specific row.
		 for (int column = 0; column < columns_count; column++) {
			 
			 // To retreive text from that specific cell. 
			 
			 String celtext = Columns_row.get(column).getText();
			 
			 System.out.println("Cell value of row number: " + row + " and column " + column + " is " + celtext);
			 
			// wd.quit();
			 
			 /*
			  * Code Explanation:
			  * 
			  * - rows_count gives the total number of rows
			  * - for each row we get the total number of columns using rows_table.get(row).findElements(By.tagName(“td”));
			  * - We iterate through each column and of each row and fetch values.
			  */
		 	}
		}
	}
}
