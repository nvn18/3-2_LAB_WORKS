package record;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
Run All
public class Testing {

	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupllier.class)
  Run | Debug
	public void TestLogin(String userName, String password) throws Exception {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		driver.findElement(By.name("login")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
}
