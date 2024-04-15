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
        driver.get("https://www.google.com");  //opens the google webpage
        String s = driver.getTitle();//gets the title of the webpage
        System.out.println("The title is:"+s);
        System.out.println("The Class is:"+s.getClass());// prints the current class of the object
         
        String current_url = driver.getCurrentUrl();// picks up the current url of the webpage
        System.out.println("The current Url is:"+current_url);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//delays for the 5seconds
        
        driver.navigate().to("https://www.lambdatest.com/selenium-playground/input-form-demo");//navigates to lambda testwebsite
        
        WebElement elementById = driver.findElement(By.id("inputEmail4"));
        elementById.sendKeys("neeraj@gmail.com");
        System.out.println(elementById);

        WebElement elementByName = driver.findElement(By.name("name"));
        elementByName.sendKeys("Neeraj");
        System.out.println(elementByName);

        
        driver.quit();// quits the webpage 
    }
}
