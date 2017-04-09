package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appPages.HomePage;
import Factory.BrowserFactory;


public class VerifyHomePage {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	
	{
		driver=BrowserFactory.getbrowser("firefox");
		driver.get(DataProvider.configdataProvider.getappliationURL());
		
	}
	
	@Test
	
	public void testhomepage()
	{
		
	HomePage home=PageFactory.initElements(driver,HomePage.class);
	String title=home.getapptitle();
	System.out.println("Title of app is"+title);
	Assert.assertTrue(title.contains("My Store"));
	home.signinlink();
	
   }
	@AfterMethod
	public void teardown()
	
	{
		BrowserFactory.closebrowser();
	}
	
	
	
	

}
