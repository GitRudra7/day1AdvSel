package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoScrolling extends BaseClass
{
  @Test (description = "Scrolling")
  public void scrollMethod() throws Exception 
  {
	  wd.get("https://www.selenium.dev/downloads/");
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  WebElement e = wd.findElement(By.linkText("Chrome"));
	  js.executeScript("arguments[0].scrollIntoView()", e); //0 =  from starting of the page,& scrollIntoView() mthd will scroll till that element.
	  
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//bottom of page
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//top of page
	  Thread.sleep(4000);
	  js.executeScript("window.scrollBy(0,3000)"); //down
	  Thread.sleep(4000);
	  js.executeScript("window.scrollBy(0,-3000)");//up
	  Thread.sleep(4000);
	  
	// https:// www.album.alexflueras.ro/index.php for left & right scroll
	  
	  wd.get("https://www.album.alexflueras.ro/index.php/");
	  js.executeScript("window.scrollBy(6000,0)");//right
	  Thread.sleep(4000);
	  js.executeScript("window.scrollBy(-6000,0)");//left
	  
	  
	 /*
	  * For scrolling we hv to use JavaScriptExecutor API, write this syntax properly as ,
	  * JavascriptExecutor js = (JavascriptExecutor)wd;
	  * Now using this object js we can call executeScript() mthd of that class/Interface to perform scrolling action
	  * Scrolling can be done in various ways as;
	  * 	1.Scrolling till a particular webelement on that webPage.
	  * 	2.Scrolling directly till bottom of the page or till top of the page > scrollTo(X,Y)
	  * 	3.Scrolling by using pixels > scrollBy(X,Y)
	  * 		 > If u specify Y values with X=0, then it represent vertical movement or scrolling
	  * 		 > And if u specify X values with Y=0, then it represent horizontal movement or scrolling
	  * 		 > Positive Values represents = Down or Right Scrolling
	  * 		 > Negative Values represents = Up or Left Scrolling
	  * 
	  * HardNote the syntax that is to be written inside executeScript() mthd 
	  * 
	  * RND > mantis website 
	  * 
	  */
	  
  }
}
