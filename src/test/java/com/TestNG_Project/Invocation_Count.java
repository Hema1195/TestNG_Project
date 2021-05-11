package com.TestNG_Project;

import org.testng.annotations.Test;

public class Invocation_Count {
  @Test
  private void launchBrowser() {
	  System.out.println("launch browser");
  }
  @Test(invocationCount=3)
  private void refresh() {
	  System.out.println("refresh");
  }
  @Test
  private void url() {
	  System.out.println("URL");
  }
  }
  
  
