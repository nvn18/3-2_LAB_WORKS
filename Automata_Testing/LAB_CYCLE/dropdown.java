package record;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class dropdown {

	public static void main(String[] args) {
		

        WebDriver driver = new ChromeDriver();
        String url = "https://www.lambdatest.com/selenium-playground/input-form-demo";
        driver.get(url); // picks up the lambda test webiste
        
        String s = driver.getTitle(); // gets the title of the webpage
        System.out.println("The tile of the webpage:"+s);

        WebElement dropdownList1 = driver.findElement(By.name("country"));

        Select dropdown1 = new Select(dropdownList1);
        dropdown1.selectByVisibleText("India"); // selects the values in the dropdown menu
        System.out.println("Selected option in dropdown1: " + dropdown1.getFirstSelectedOption().getText());
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)); // delays for the 5seconds
        
        driver.navigate().to("https://output.jsbin.com/vijititupo"); // navigates to the jsbin.com
        WebElement anime = driver.findElement(By.id("Anime"));
        
        Select series = new Select(anime);
        series.selectByVisibleText("Naruto");
        series.selectByIndex(3); // selects the value in the dropdown menu by using the index
        System.out.println("Selected option in anime: " + series.getFirstSelectedOption().getText());
	}

}
