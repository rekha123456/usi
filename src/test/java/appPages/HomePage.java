package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a") WebElement signin_link;
	
	@FindBy(xpath="//a[@text()='Contact us']") WebElement contactus;
	
	
	public void signinlink()
	{
		
		signin_link.click();
	}
	
	public void contactus()
	
	{
		contactus.click();
	

	}
	
	public String getapptitle()
	{
	String Title=driver.getTitle();
	
	return Title;
	
	
	}
	
	}
	

