package day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoWindowHandling extends BaseClass
{

	//String PID = wd.getWindowHandle() this cmnd will provide us an id that is unique for each window (main or sub),
	//we can then use this ids to perform whatever actions we require to perform on any of those windows
	//  Set<String> allwin = wd.getWindowHandles() >>>>> used if there are multiple windows
	
  @Test
  public void f() throws Exception
  
  {
	  wd.get("http://frontaccounting.squadinfotech.in");
	  wd.findElement(By.name("user_name_entry_field")).sendKeys("frontuser11");
	  wd.findElement(By.name("password")).sendKeys("frontuser11");
	  Select cmp = new Select (wd.findElement(By.name("company_login_name")));
	  cmp.selectByVisibleText("Squad_MT_OL_60");
	  wd.findElement(By.name("SubmitUser")).click();
	  
	  //salesEntryQuotation
	  wd.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[1]")).click();
	 
	  String PID = wd.getWindowHandle();// to get unique id of current tab
	  System.out.println("Parent window id = " + PID);
	  
	  // Current credit 	79,099,603,070.53
	  wd.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/form/center[1]/table/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/a")).click();
	  // set<String> adv = will not hv duplicate id value
	  Set<String> allwin = wd.getWindowHandles(); // get ids of all sub tabs/wins and will store them in allwin set variable.
	  
	  for (String W:allwin) // will fetch ids of all sub tabs form allwin set, one by one ,and will store in W
	  {
		  wd.switchTo().window(W);
		  System.out.println(wd.getTitle());
		  if(!(W.equals(PID)))   //this logic will vary from website to website 
		  {
			  Select s = new Select(wd.findElement(By.name("customer_id")));
			  s.selectByVisibleText("Donald Easter");
			  wd.manage().window().maximize();
			  wd.close();
		  }
		  
	  }
	  
	  wd.switchTo().window(PID);
	  wd.findElement(By.linkText("Logout")).click();
	  wd.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table[2]/tbody/tr[5]/td/div/a/b")).click();
	  Thread.sleep(3000);
	 
//RND > Naukri window provide multiple sub windows	  
	  
// C664ECBFAD95466C6BCC3A4089E86128	  
// 1D72D5E05AA90910D86632910F0CCF76	  
	  
  }
}
