package page;


import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class attendence_page_login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://10.1.1.121/sis/studindex.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String t = driver.getTitle();
		System.out.println("the title is :"+t);
		
		WebElement username = driver.findElement(By.id("signup"));
		WebElement password = driver.findElement(By.id("pwd"));
		WebElement SubmitButton = driver.findElement(By.name("submit"));
		
		username.sendKeys("Y21CS185");
		password.sendKeys("9848032919");
		SubmitButton.click();
		
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		

	}

}
