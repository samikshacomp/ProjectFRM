package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	
	private WebDriver driver;
	
	By email=By.id("user_email");
	By passwd=By.id("user_password");
	
	By login=By.xpath("//input[@type='submit']");
	
	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPasswd()
	{
		return driver.findElement(passwd);
	}
	
	public WebElement LoginButton()
	{
		return driver.findElement(login);
	}
}
