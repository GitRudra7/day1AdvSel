package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass
{
  public WebDriver wd;
  public Properties prop;
  
  @BeforeTest
  public void beforeTest() throws Exception
	{
	   prop = new Properties();
	   prop.load(new FileInputStream("src\\test\\resources\\PropertyFile\\Demo.property"));
	   String browsername = prop.getProperty("browser");
	   if(browsername.equalsIgnoreCase("chrome"))
              {
            	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver.exe");
            	    wd = new ChromeDriver();
               }
              else if(browsername.equalsIgnoreCase("firefox"))
              {
            	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\drivers\\geckodriver.exe");
          	    wd = new FirefoxDriver();
              }
		
	}
  
//  @AfterTest
//  public void afterTest()
//  {
//	  wd.quit();
//  }
}
