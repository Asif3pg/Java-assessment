package Auto.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import Auto.pages.Base;

public class Configutaions {
	
	

	//constructor and methods for property files
	public Properties pro;

	public Configutaions()

	{

		File Scrfile = new File("./Config/Config.properties");

		FileInputStream FISS;
		try {
			FISS = new FileInputStream(Scrfile);

			pro = new Properties();

			pro.load(FISS);

		}

		catch (Exception e) {

			System.out.println("Config file Issue " + e.getMessage());

		}
	}

	public void getdatafromconfig() {

	}

	public String getBrowser() {

		return pro.getProperty("Browser");

	}

	public String getUrl() {

		return pro.getProperty("URL");

	}

}
