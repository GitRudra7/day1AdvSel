package day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helper.BaseClass;

public class AllinProp extends BaseClass
{
	WebDriver wd ;
  @Test
  public void AllProp() throws Exception 
  
  {
	  Properties prop = new Properties();
	  prop.load(new FileInputStream("src\\test\\resources\\PropertyFile\\Orange.property"));
	  System.setProperty(prop.getProperty("chrkey"), prop.getProperty("cpath"));
	  wd = new ChromeDriver();
	  wd.get(prop.getProperty("url"));
	  
	  getLocator(prop.getProperty("uname")).sendKeys(prop.getProperty("unamevalue")); //sendkeys is not written inside getlocator() mthd.:)
	  getLocator(prop.getProperty("pword")).sendKeys(prop.getProperty("pwordvalue")); 
	  getLocator(prop.getProperty("login")).click();
	  
  
  }
  
  public WebElement getLocator(String element) // eg. element = txtUsername:=id 
  
  {
	WebElement e = null;
	
	String locvalue = element.split(":=")[0]; // txtUsername
	String locType = element.split(":=")[1];  // id
	
	if (locType.equalsIgnoreCase("id"))
		e=wd.findElement(By.id(locvalue));
	else if (locType.equalsIgnoreCase("name"))
		e=wd.findElement(By.name(locvalue));
	else if (locType.equalsIgnoreCase("cssSelector"))
		e=wd.findElement(By.cssSelector(locvalue));
	else if (locType.equalsIgnoreCase("xpath"))
		e=wd.findElement(By.xpath(locvalue));

	return e; // ie getLocator(prop.getProperty("uname")) = e = wd.findElement(By.id(locvalue));
			  // in other words LINE 29 will look as our normal stuff > wd.findElement(By.id(locvalue)).sendKeys(prop.getProperty("unamevalue"));
}
}
