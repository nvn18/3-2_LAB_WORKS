package page;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class github_paste {
	public static void main(String[] args) {
	
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://github.com/nvn18/3-2_LAB_WORKS/blob/main/Automata_Testing/pages/pages.java");
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		  
		  WebElement Code_txt = driver.findElement(By.id("read-only-cursor-text-area"));
		  
		  String Code  = Code_txt.getText();
		  
		  driver.navigate().to("https://www.toptal.com/developers/paste-gd/");
		  
		  driver.manage().window().fullscreen();
		  
		  WebElement title = driver.findElement(By.id("title"));
		  WebElement text = driver.findElement(By.id("text"));
		  
		  Dimension d = new Dimension(500,500);
		  driver.manage().window().setSize(d);
		  title.sendKeys("script");
		  text.sendKeys(Code);
		  
		  
		  
	}
	
}


