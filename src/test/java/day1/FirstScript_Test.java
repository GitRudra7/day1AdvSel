package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import helper.BaseClass;

public class FirstScript_Test extends BaseClass
{

  @Test(description = "Checking CheckBox Status")
  public void rediffCheckBox() 
  
  {
	  wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  boolean sts = wd.findElement(By.id("remember")).isSelected();
	  Assert.assertEquals(sts, true);
  }
}
