package record;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_Operations{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
        String s = driver.getTitle();
        System.out.println("The title is:"+s);
        
        WebElement elementById = driver.findElement(By.id("inputEmail4"));
        elementById.sendKeys("neeraj@gmail.com");
        System.out.println(elementById);

        WebElement elementByName = driver.findElement(By.name("name"));
        elementByName.sendKeys("Neeraj");
        System.out.println(elementByName);

        WebElement elementByClass = driver.findElement(By.className("py-50"));
        System.out.println(elementByClass);
        
        WebElement elementByTag = driver.findElement(By.tagName("a"));
        System.out.println(elementByTag);
        
        WebElement elementByLinkText = driver.findElement(By.linkText("Automation Testing Cloud"));
        System.out.println(elementByLinkText);
        
        WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("Testing Cloud"));
        System.out.println(elementByPartialLinkText);
        
        WebElement elementByXPath = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        System.out.println(elementByXPath);

        WebElement elementByCssSelector = driver.findElement(By.cssSelector("input#company"));
        System.out.println(elementByCssSelector);
        driver.quit();
    }
}
