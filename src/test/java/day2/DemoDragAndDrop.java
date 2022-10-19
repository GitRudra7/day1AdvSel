package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoDragAndDrop extends BaseClass
{
  @Test
  public void dragdrop() 
  
  {
	  wd.get("https://www.globalsqa.com/demo-site/draganddrop/");
	//  wd.switchTo().frame( wd.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
	  
   //whenever u want to store any webelement details, create a WebElement variable and store the content in it. 
   // And use List<WebElement> when u hv multiple webElements to be stored >> eg  List<WebElement> alloptions = s.getOptions()	  
	  
	  WebElement drag1img1 = wd.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));
	  
	  WebElement drop1img1 = wd.findElement(By.xpath("//*[@id=\"trash\"]"));
	  
	  Actions builder = new Actions(wd);  
	 Action dropimg = builder.clickAndHold(drag1img1).moveToElement(drop1img1).release(drop1img1).build(); 
	 dropimg.perform();
	 
	/* 
	 * all this mthds clickAndHold etc are of Actions class, so to use them, we hv created builder as object.
	 * So now as we hv set of diff. actions, so we hv used build method to create a single action, that will be considered as a 
	 * set of all this actions.
	 * Now we hv stored this single action in an action variable dropimg, and to perform this action, we hv used perform() mthd.
	 * 
	 */
	 
  }
}
