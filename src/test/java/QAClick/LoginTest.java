package QAClick;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		
		
	}
	
	@Test (dataProvider="getData")
	public void HomePageNavigation(String username,String password, String text) throws IOException
	{

		
		
		
		driver.get(prop.getProperty("url"));
		
		LandingPage l=new LandingPage(driver);
		
		l.getLogin().click();
		
		LoginPage p=new LoginPage(driver);
		
		p.getEmail().sendKeys(username);
		p.getPasswd().sendKeys(password);
		p.LoginButton().click();
		
		System.out.println(text);
		
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object data[][]=new Object[2][3];
		//First row
		data[0][0]="yogmadhur@gmail.com";
		data[0][1]="yogesh";
		data[0][2]="Your mailid not registred with QA Click Academy..";
		
		//Second row
				data[1][0]="yogeshthorat83@gmail.com";
				data[1][1]="yogesh";
				data[1][2]="Your mailid not registred with QA Click Academy..";
				
		return data;		
	}
	
}
