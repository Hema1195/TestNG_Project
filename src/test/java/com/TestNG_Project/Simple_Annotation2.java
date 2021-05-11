package com.TestNG_Project;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation2 {
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("set property");
	}
	@BeforeTest
	private void launchBrowser() {
System.out.println("launchBrowser");
	}
	@BeforeClass
	private void launchUrl() {
System.out.println("url");
	}
	@BeforeMethod
	private void login() {
System.out.println("Login");
	}
	@Test
	private void mobile() {
		System.out.println("mobile");
	}
	@Test
	private void powerbank() {
System.out.println("powerbank");
	}
	@Test
	private  void earphone() {
System.out.println("earphone");
	}
	@AfterMethod
	private void logout() {
System.out.println("Logout");
	}
	@AfterClass
	public static void homepage() {
System.out.println("homepage");
	}
	@AfterTest
	private void close() {
System.out.println("Close");

	}
	@AfterSuite
	private void deleteAllCookies() {
System.out.println("delete cookies");
	}
	
}





 
