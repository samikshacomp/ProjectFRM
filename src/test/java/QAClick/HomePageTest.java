package QAClick;


import java.io.IOException;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

public class HomePageTest extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("WebDriver is Initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page....");
	}
	
	@Test
	public void HomePageNavigation() throws IOException
	{
		
		LandingPage l=new LandingPage(driver);
		
		l.getLogin().click();
		log.info("Navigated to Login page....");
		
			
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
	
	
}
