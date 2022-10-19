package day4;

import org.testng.annotations.Test;

import helper.BaseClass;

public class ExecutePageFactory extends BaseClass
{
  @Test
  public void demoPG()
  {
    wd.get("https://opensource-demo.orangehrmlive.com");
    DemoPageFactory d = new DemoPageFactory(wd);
    d.username("admin");d.password("admin123");d.clklogin();
  }
}
