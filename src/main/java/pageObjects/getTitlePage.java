package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getTitlePage {
private WebDriver driver;
	
		
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	
	By contact=By.xpath("//a[contains(text(),'Contact')]");
	
	public getTitlePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	

	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getContact()
	{
		return driver.findElement(contact);
	}
}
