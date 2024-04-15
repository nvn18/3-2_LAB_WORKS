package record;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) throws InterruptedException  {

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

 
        WebElement mainIframe = driver.findElement(By.id("name"));
        mainIframe.sendKeys("main"); // Enterning the Text to main frame
        Thread.sleep(5000); 
        driver.switchTo().frame("frm1"); // swtiching to the frame1
        
        WebElement w = driver.findElement(By.id("course")); // In the frame1 selecting the dropdown menu
        Select courseName = new Select(w);
        courseName.selectByVisibleText("Java");
        
        driver.switchTo().defaultContent(); // redirecting to the main frame
        
        driver.findElement(By.id("name")).clear(); // cleared the main frame text
        driver.findElement(By.id("name")).sendKeys("returned to main webpage"); // the text will be appened to main 

        // Quit the driver
    }
}
