package Auto.pages;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Auto.utilities.Helperclass;

public class Booklandingpage {
	

	public WebDriver driver;
	
	public Booklandingpage(WebDriver Ndriver) {
		
		
		this.driver=Ndriver;
	}
	
	
	By nameofallbooks =By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
	
	By enterbooksname =By.id("twotabsearchtextbox");
	By searchbutton =By.id("nav-search-submit-button");
	
	By selectdropdownforcategories = By.id("searchDropdownBox");
	
	
	
public void takesceenshortsas() {
		
		File Scrs =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println("Captured screen shot");
		
		String CaptureScreenshotspath = System.getProperty("user.dir")+ "/Screenshort/"+ getdatetime() +".png";
		
		try {
			FileHandler.copy(Scrs, new File(CaptureScreenshotspath));
		} catch (IOException e) {
			System.out.println("Get Message for Screenshorts" + e.getMessage());
		}
		
	}

	
	public static String getdatetime() {
		
		DateFormat Customformat = new SimpleDateFormat("MM_DD_YYYY_HH_mm_ss");
		
		Date currentdate = new Date();
		
		return Customformat.format(currentdate);
	}



	public void clickatbook() throws InterruptedException {
List<WebElement> Ele=driver.findElements(nameofallbooks);
		
		Ele.get(4).click();
		Thread.sleep(5000);
		
		
		
	}
	
	public void windowswitch() {
		
		Set<String>windows=driver.getWindowHandles();
		
		Iterator<String>Tabs=windows.iterator();
		
		String parentID =Tabs.next();
		String ChildID =Tabs.next();
		
		driver.switchTo().window(ChildID);
		
	}
	
	public void entertextforsearch(String Text) {
		driver.findElement(enterbooksname).click();
		driver.findElement(enterbooksname).sendKeys(Text);
		driver.findElement(searchbutton).click();
		
		
	}
	
public void selectbookfromcategories() 
	
	{
		
		WebElement ele =driver.findElement(selectdropdownforcategories);
		Select selectfromdp = new Select(ele);
		selectfromdp.selectByVisibleText("Books");
		
	
}


}
