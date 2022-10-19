package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteGridEg 
{
	WebDriver wd;
  @Test
  public void DemoRemoteGrid() throws Exception 
  {
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setBrowserName("Chrome");
	dc.setPlatform(Platform.LINUX);
	
	wd = new RemoteWebDriver(new URL("http://192.168.43.231:4444"),dc);
	wd.get("https://blazedemo.com/");
	System.out.println("Title = " + wd.getTitle());
	
	
	
  }
}
