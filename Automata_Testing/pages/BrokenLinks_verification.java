package page;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks_verification {

	public static void main(String[] args) throws  IOException {
	    WebDriver driver = new ChromeDriver();
	    String url = "https://www.browserstack.com/";
	    //String url =  "https://www.w3schools.com/java/";
	    driver.get(url);
        
	    
	    
       // checking the connection of the webpage adn printing the code and message 	    
	    HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
	    
        int code = con.getResponseCode();  //	if code is 200, then it is not broken link
        if(code == 200)
        {
        	System.out.println("The code is"+code+"and the link is not Broken");
        }
        else
        {
        	System.out.println("The code is"+code+" "+"and the link is Broken");
        }
	    
	    String msg = con.getResponseMessage();  // if message is OK, then it is not broken link
	    if(msg == "Ok")
        {
        	System.out.println("The message is"+msg+" "+"and the link is not Broken");
        }
        else
        {
        	System.out.println("The message is"+msg+"and the link is Broken");
        }
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	   
	  // WebElement img = driver.findElement(By.xpath("//*[@id=\"w3-logo\"]"));
	  // System.out.println("Src of Image:"+ img.getAttribute("id"));
	    
	    WebElement img = driver.findElement(By.xpath("[//*@id=\"header-habitat\"]/div[1]/div/div/div/a/img"));
	    System.out.println("Src of Image:"+ img.getAttribute("src"));
	    String t = driver.getTitle();
	    System.out.println("Title is"+t);
}
}
