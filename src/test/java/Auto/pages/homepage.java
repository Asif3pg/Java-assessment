package Auto.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public  class homepage {
	
	
	public WebDriver driver;
	
	public homepage(WebDriver Ndriver) {
		
		
		this.driver=Ndriver;
	}
	
	By selectdropdownforcategories = By.id("searchDropdownBox");
	
	By listofcategories = By.xpath("//select[@id=\"searchDropdownBox\"]//following-sibling::option");
	
	By enterbooksname =By.id("twotabsearchtextbox");
	
	By searchbutton =By.id("nav-search-submit-button");
	
	By nameofallbooks =By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
	

	public void selectbookfromcategories() 
	
	{
		
		WebElement ele =driver.findElement(selectdropdownforcategories);
		Select selectfromdp = new Select(ele);
		selectfromdp.selectByVisibleText("Books");
		
		
	}
	
	public void entertextforsearch(String Text) {
		driver.findElement(enterbooksname).click();
		driver.findElement(enterbooksname).sendKeys(Text);
		driver.findElement(searchbutton).click();
		driver.findElement(enterbooksname).clear();
		
		
	}
	
	
	public String getbookname() {
		
		List<WebElement> Ele=driver.findElements(nameofallbooks);
		
		String Bookname= Ele.get(2).getText();
		return Bookname;
		
	}
	
	

}
