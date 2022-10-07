package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {
	
	
	public void selectByIndex (WebElement element, int index) {
		Select letsSelect = new Select(element);
		  letsSelect.selectByIndex(index);
	}
	
	public void selectByValue (WebElement element, String value) {
		Select letsSelect = new Select(element);
		  letsSelect.selectByValue(value);
	}
	
	public void selectByVisibleText (WebElement element, String value) {
		Select letsSelect = new Select(element);
		  letsSelect.selectByValue(value);
	}
	
	

}
