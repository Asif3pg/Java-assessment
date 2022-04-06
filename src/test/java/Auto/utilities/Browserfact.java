package Auto.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Auto.pages.Base;

public class Browserfact extends Base{
	
	
public static WebDriver browsersetup(WebDriver driver , String browser, String Appurl) 

{
	if (browser.contains("Chrome"))

	{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\asif.ali\\Desktop\\Chromeexe\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();	

	
		
	}
	else if(browser.equalsIgnoreCase("Firefox")) {
		
		System.setProperty("webdriver.gecko.driver",
				"./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();

		
	}
    else if(browser.equalsIgnoreCase("IE")) {
    	
		
    	System.setProperty("WebDriver.firefox.driver", "./Drivers/IEDriverServer.exe");

		driver = new InternetExplorerDriver();
	}
    else {
    	
    	System.out.println("Browser is not supported");
    }
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(Appurl);
	
	
	

		return driver;
		
		
		
	}	

public static void closebrower(WebDriver driver) {
	
	driver.quit();

}
}
