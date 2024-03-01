package page;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class github_login {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String t = driver.getTitle();
		
		System.out.println("the title of the page is:"+t);
		
		WebElement username = driver.findElement(By.name("login"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement SubmitButtom = driver.findElement(By.name("commit"));
		
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		
		username.sendKeys("nvn18");
		password.sendKeys("****");
		SubmitButtom.click();
	}

}
