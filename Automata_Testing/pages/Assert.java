package record;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class assert_pro {
	WebDriver driver = new ChromeDriver();
	
@Test
public void testAssert() {
String Url = "https://www.w3schools.com/";
driver.get(Url);
String ActualTitle = driver.getTitle();
String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | browserstack";
Assert.assertNotEquals(ActualTitle, ExpectedTitle);
System.out.println("The Actual Title is:"+ActualTitle);
	}
@BeforeMethod
public void Before()
{
	System.out.println("Starting the Browers to Launch");
}
@AfterMethod

	public void After()
	{
	    driver.quit();
		System.out.println("The Launch Completed");
	}

}
