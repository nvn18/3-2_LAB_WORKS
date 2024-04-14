package record;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Window_Operations {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Open a new window
        String s = driver.getTitle();
        System.out.println("The Title name is"+s);
        driver.findElement(By.linkText("Gmail")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        // Get the window handles of all open windows
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the new window
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }
        driver.findElement(By.cssSelector(".button.button--medium.button--mobile-before-hero-only")).click();
        // Perform operations in the new window
        // Switch back to the original window
        driver.switchTo().defaultContent();
    }
}
