package day5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseGrid;

public class GridTest4 extends BaseGrid{

	@BeforeMethod
	public void start() throws Exception
	{
		wd=initalizeBrowser("ie");
			
	}
		
  @Test
  public void fourth()
  
  {
	  wd.get("https://www.google.com/");
	  System.out.println("Title = " + wd.getTitle());
	  System.out.println("By IE");
  }
  
  @AfterMethod
	public void close()
	{
		wd.quit();
			
	}

}
