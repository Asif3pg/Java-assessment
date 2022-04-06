package Auto.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Auto.pages.Base;
import Auto.pages.homepage;

public class hometestcase extends Base {
	
	@Test
	
public void hometestcase() 
	
	{
		
	homepage objhome=PageFactory.initElements(driver, homepage.class);
	objhome.selectbookfromcategories();
	
	objhome.entertextforsearch("Testing ebooks");
	objhome.entertextforsearch("Automation ebooks");
	objhome.getbookname();
	System.out.println("Ebookname in amazon "+objhome.getbookname());
	}

	
		
		
		
		
		

}
