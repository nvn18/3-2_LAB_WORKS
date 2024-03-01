package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class hello{
    public static void main(String args[]) {
        try {
            System.setProperty("webdriver.chrome.driver", "Z:\\selenium\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
