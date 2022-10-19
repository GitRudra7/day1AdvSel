package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoExtent
{ 
	ExtentReports ext;
	ExtentTest tc1;
	WebDriver wd;
	@BeforeTest
	public void rep()
	{
		ext = new ExtentReports();
		ext.attachReporter(new ExtentHtmlReporter("report.html"));
		tc1 = ext.createTest("BlazeDemo Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver.exe");
 	    wd = new ChromeDriver();
 	    tc1.info("Starting of Browser");
	}
	
	
  @Test
  public void exExtentReport() 
  {
	  wd.manage().window().maximize();
	  tc1.info("Maximize Window");
	  wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  tc1.info("Opening URL");
	  
	  if(wd.getTitle().equalsIgnoreCase("RediffMail"))
	  {
		  tc1.log(Status.PASS, "Navigated Successfully");
	  }
	  else
	  {
		  tc1.log(Status.FAIL, "Navigated UnSuccessfully");
	  }
  }
  
  @AfterTest
  public void clrep()
  {
	  tc1.info("close Browser");
	  wd.quit();
	  ext.flush();
  }
  
  
}
