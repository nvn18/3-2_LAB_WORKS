package record;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Anno_pro {
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void test1() {
	System.out.println("NVN Executing Test Case 1");
	}// Test Case 2
	@Test
	public void test2() {
	System.out.println("NVN Executing Test Case 2");
	}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Test Case Before Method");
	}
	@AfterMethod
	public void afterMethod() {
	System.out.println("Test Case After Method");
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("Test Case Before Class");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("Test Case After Class");
	}
	@BeforeTest
	public void beforeTest() {
	System.out.println("Test Case Before Test");
	}
	@AfterTest
	public void afterTest() {
	System.out.println("Test Case After Test");
	}
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Test Case Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
	System.out.println("Test Case After Suite");
	}
	}
