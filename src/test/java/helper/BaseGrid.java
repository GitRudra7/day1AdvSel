package helper;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseGrid 
{
  public WebDriver wd;
  public WebDriver initalizeBrowser(String browsername) throws Exception
  {
	DesiredCapabilities dc = new DesiredCapabilities();
	if (browsername.equalsIgnoreCase("chrome"))
	{
		dc.setBrowserName("chrome");
	}
	else if (browsername.equalsIgnoreCase("firefox"))
	{
		dc.setBrowserName("firefox");
	}
	else if (browsername.equalsIgnoreCase("edge"))
	{
		dc.setBrowserName("MicrosoftEdge");
	}
	else if (browsername.equalsIgnoreCase("ie"))
	{
		dc.setBrowserName("Internet Explorer");
	}
	wd = new RemoteWebDriver(new URL("http://192.168.43.231:4444"),dc);
	  return wd;
	  
	  
  }
}
