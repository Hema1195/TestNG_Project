package com.TestNG_Project;

import org.testng.annotations.Test;

public class TimeOut_Test {
  @Test(timeOut=4000)
  private void Browserdemo() throws Throwable {
  System.out.println("Browser Launch");
  System.out.println("login click");
  Thread.sleep(2000);
  System.out.println("navigate to next page");
}
}


