package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import helper.BaseClass;

public class PropDemo extends BaseClass
{
  @Test
  public void bingTest() throws Exception
  {
	  wd.get(prop.getProperty("url"));
	  Thread.sleep(5000);
	  wd.findElement(By.xpath(prop.getProperty("searchField"))).sendKeys("squad");
	  wd.findElement(By.xpath(prop.getProperty("searchField"))).sendKeys(Keys.ENTER);
	  Thread.sleep(5000);
  }
  
}
