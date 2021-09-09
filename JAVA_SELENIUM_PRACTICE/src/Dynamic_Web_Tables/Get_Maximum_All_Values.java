package Dynamic_Web_Tables;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Maximum_All_Values {
	
	// Get Maximum of all the Values in a Column of Dynamic Table
	
	public static void main(String[] args) throws ParseException {
		
		WebDriver wd;
		
		System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
		
		wd = new ChromeDriver();
		
		wd.get("http://demo.guru99.com/test/web-table-element.php");
		
		String max;
		
		double m = 0; 
		double r = 0;
		
		// Number of columns 
		
		
		List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		
		System.out.println("Total number of columns are: " + col.size());
		
		// Number of rows
		
		List  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		System.out.println("Total No of rows are : " + rows.size());
		
		 for (int i =1; i<rows.size(); i++) {
			 
			 max = wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
			 
			 NumberFormat f = NumberFormat.getNumberInstance();
			 
			 Number num = f.parse(max);
			 
			 max = num.toString();
			 
			 m = Double.parseDouble(max); 	
			 
			 if(m>r) {
				 r = m;	
			 }
		 }
		 
		 System.out.println("Maximum current price is : " + r);
	}
	
	/*
	 * Code Explanation:
	 * 
	 * - Using chrome driver we locate the web table and get total number of row using XPath “.//*[@id=’leftcontainer’]/table/tbody/tr/td[1]”
	 * - Using for loop, we iterate through total number of rows and fetch values one by one. To get next row we use (i+1) in XPath
	 * - We compare old value with new value and maximum value is printed at the end of for loop
	 */
}
