package page;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class pages {

	public static void main(String[] args) {
			
		 WebDriver driver = new ChromeDriver();

	        driver.get("Z:\\information.html");
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	        System.out.println(driver.findElement(By.className("information")));
	        System.out.println(driver.findElement(By.linkText("Selenium Official Page")));
	        
	        driver.navigate().to("https:\\selenium.dev");
	        WebElement textBox = driver.findElement(By.name("newsletter"));
	        WebElement submitButton = driver.findElement(By.cssSelector("#fname"));

	        textBox.sendKeys("Selenium");
	        submitButton.click();

	        WebElement message = driver.findElement(By.id("lname"));
	        System.out.println(message.getText());
	}
}