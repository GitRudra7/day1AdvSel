package day4;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;
import org.openqa.selenium.io.FileHandler;

import helper.BaseClass;

public class DemoScrSht extends BaseClass
{
  @Test
  public void scrSht() throws Exception 
  {
	  wd.get("https://opensource-demo.orangehrmlive.com");
	  screenSht(wd);
  }
  
  public void screenSht(WebDriver wd) throws Exception
  {
	  TakesScreenshot ts = (TakesScreenshot)wd;   //HARDNOTE
      FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./scrsht"+tm()+ ".png"));  //HARDNOTE
  }
  
  public String tm()
  {
	return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());  //HARDNOTE
	
	  
  }
  
  
}
