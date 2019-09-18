package QAClick;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.getTitlePage;
import resources.Base;

public class ValidateTitle extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	
	@Test 
	public void HomePageNavigation() throws IOException
	{
		
		getTitlePage l=new getTitlePage(driver);
		
		System.out.println(l.getTitle().getText());
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated test message....");
	
		Assert.assertTrue(l.getContact().isDisplayed());

				
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}
