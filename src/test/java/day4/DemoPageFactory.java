package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPageFactory
{
 // initialize web elements using init mthd
 // we hv seen POM storage using By class, this PageFactory is another method 
 // so now for storage (repo for locators and other mthds) we hv, POM( By and Page Factory) and Property file	
	
	public DemoPageFactory (WebDriver wd)
	{
		PageFactory.initElements(wd, this); // HARDNOTE
	}
	
	
	// way 1 by using FindBy annotation
	
/*	
   // repository
    @FindBy (id="txtUsername") WebElement uname;
	@FindBy (id="txtPassword") WebElement pword;
	@FindBy (id="btnLogin") WebElement login;
	
	//method
	public void username(String un)
	{
		uname.sendKeys(un);
	}
	
	public void password(String pw)
	{
		pword.sendKeys(pw);
	}
	
	public void clklogin()
	{
		login.click();
	}
	
*/	
	
	//RUN > ExecutePageFactory class
	
	//way2 
	
	//repository
	WebElement txtUsername;
	WebElement txtPassword;
	WebElement btnLogin;
	
	//method
		public void username(String un)
		{
			txtUsername.sendKeys(un);
		}
		
		public void password(String pw)
		{
			txtPassword.sendKeys(pw);
		}
		
		public void clklogin()
		{
			btnLogin.click();
		}
	
	
	
}
