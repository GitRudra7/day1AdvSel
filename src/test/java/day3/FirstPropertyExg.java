package day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FirstPropertyExg 
{
	//Property files are used to store any data (drivers,url's,locators,inputs etc) in Key and value format,
	//which we can use to perform our actions on web.
  @Test
  public void propertyFileExg() throws Exception
  {
	Properties prop = new Properties(); 
	prop.load(new FileInputStream("src\\test\\resources\\PropertyFile\\Demo.property")); //1st u need to load or fetch that ,
	                                                                                     //property file using load() mthd of properties / property class.
	
	String data = prop.getProperty("url"); // getProperty(key) mthd is used to get value of the key specified in this mthd.
	System.out.println(data);
  }
  
}
