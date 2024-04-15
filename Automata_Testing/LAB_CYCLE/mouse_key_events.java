package record;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class mouse_key_events {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.instagram.com/";
		driver.get(url);
		String s  = driver.getTitle();
		System.out.println("The Title is :"+s);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
        
        
		Actions builder = new Actions(driver);
		Action action = builder
				   .moveToElement(username) // mouse move over to the username field
				   .click()
		           .keyDown(username,Keys.SHIFT)
		           .sendKeys(username,"chaduvuko ra")
		           .keyUp(username,Keys.SHIFT)
		           .moveToElement(password) // mouse move over to the username field
				   .click()
		           .keyDown(password,Keys.SHIFT)
		           .sendKeys(password,"chaduvuko ra")
		           .keyUp(password,Keys.SHIFT)
		           .doubleClick(username)
		           .contextClick()
		           .build();
		action.perform();
	}

}
