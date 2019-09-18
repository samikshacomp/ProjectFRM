package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	private WebDriver driver;
	
	By signin=By.xpath("//div[@class='tools']//li[4]//a[1]");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	
}
