package Auto.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Auto.utilities.Browserfact;
import Auto.utilities.Configutaions;

public class Base {

	public WebDriver driver;
	public Configutaions conf;

	@BeforeTest

	public void browsersetup() {
		conf = new Configutaions();
		// driver= Browserfact.browsersetup(driver, "Chrome", "https://www.amazon.in/");
		driver = Browserfact.browsersetup(driver, conf.getBrowser(), conf.getUrl());

	}

	@AfterTest

	public void Teardown() {

		Browserfact.closebrower(driver);

	}

}
