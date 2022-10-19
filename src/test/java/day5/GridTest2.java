package day5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseGrid;

public class GridTest2 extends BaseGrid
{

	@BeforeMethod
	public void start() throws Exception
	{
		wd=initalizeBrowser("firefox");
			
	}
		
  @Test
  public void second()
  
  {
	  wd.get("https://www.google.com/");
	  System.out.println("Title = " + wd.getTitle());
	  System.out.println("By Firefox");
  }
  
  @AfterMethod
	public void close()
	{
		wd.quit();
			
	}

}
