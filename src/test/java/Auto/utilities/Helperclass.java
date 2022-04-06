package Auto.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Auto.pages.Base;

public class Helperclass extends Base{
	

	public static void waitforelementmethod(WebDriver driver, By bylocator) {
		
		
		WebDriverWait waitobj = new WebDriverWait(driver, 20);
		
		waitobj.until(ExpectedConditions.visibilityOfElementLocated(bylocator));
		
	}

	
	

}
