package Auto.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Auto.pages.Base;
import Auto.pages.Booklandingpage;
import Auto.pages.homepage;
import Auto.utilities.Helperclass;

public class BooksLandingtestpage extends Base {

	@Test(priority=2)

	public void screenshort() throws InterruptedException 
	{

		Booklandingpage objfortakescreenshorts = PageFactory.initElements(driver, Booklandingpage.class);
        objfortakescreenshorts.selectbookfromcategories();
		objfortakescreenshorts.entertextforsearch("Hobby");
        objfortakescreenshorts.clickatbook();
		objfortakescreenshorts.windowswitch();
        objfortakescreenshorts.takesceenshortsas();
	}

}
