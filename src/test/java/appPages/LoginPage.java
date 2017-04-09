package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='email']") WebElement email;
	@FindBy(xpath=".//*[@id='passwd']") WebElement pswrd;
	@FindBy(xpath=".//*[@id='SubmitLogin']") WebElement submit;
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[2]/a") WebElement signout;
	
	
	
	
	public void loginapp(String user,String pswd)
	{
		
		email.sendKeys(user);
		pswrd.sendKeys(pswd);
		submit.click();
		
	}
	
	public void signoutlink()
	
	{
		
		//WebDriverWait   wait=new WebDriverWait(driver,20);
		//this will wait untill locator appears
		// WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(signout));
		//Assert.assertEquals(text,"Login - My Store");
		 	 
	signout.click();
	}
	
	
	
	
	

}
