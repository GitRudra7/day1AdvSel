package day6;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoUpload extends BaseClass

{
  @Test
  public void demofile() 
  {
	  
//	  wd.get("https://www.monsterindia.com/seeker/registration");
//	  wd.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("C:\\Users\\Owner\\Desktop\\ANU BACKUP\\EXTRAS\\scripting.docx");
 
	  wd.get("https://www.monsterindia.com");

	  wd.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div[1]/a[2]")).click();
	 
	  wd.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("C:\\Users\\Owner\\Desktop\\ANU BACKUP\\EXTRAS\\scripting.docx");
	  wd.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div[1]/div[2]/div/div/section/div/form/span")).click();
  
  }
}







