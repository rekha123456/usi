package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appPages.HomePage;
import appPages.LoginPage;
import DataProvider.ExcelDataProvider;
import Factory.BrowserFactory;

public class verifyLoginPagewithReports {
	
static WebDriver driver;

	@BeforeMethod
	public void setup()
	
	{		
		driver=BrowserFactory.getbrowser("firefox");
		driver.get(DataProvider.configdataProvider.getappliationURL());
	    
		
	}
	
	@Test
	public void verifylogin()
	
	{
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		String title=home.getapptitle();
		System.out.println("Title of app is"+title);
		Assert.assertTrue(title.contains("My Store"));
		
		
		home.signinlink();
		
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		ExcelDataProvider Excel=new ExcelDataProvider();
		
		login.loginapp(Excel.getdata(0, 0, 0),Excel.getdata(0, 0, 1));
		
		
		
		login.signoutlink();
		
	}
	
@AfterMethod
	public void teardown()
	
{		
	BrowserFactory.closebrowser();
	}

}
