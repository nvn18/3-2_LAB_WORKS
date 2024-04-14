package record;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");

        WebElement dropdownList1 = driver.findElement(By.name("country"));

        Select dropdown1 = new Select(dropdownList1);
        dropdown1.selectByVisibleText("India");
        System.out.println("Selected option in dropdown1: " + dropdown1.getFirstSelectedOption().getText());
        
        driver.navigate().to("https://output.jsbin.com/vijititupo");
        WebElement anime = driver.findElement(By.id("Anime"));
        
        Select series = new Select(anime);
        series.selectByVisibleText("Naruto");
        series.selectByIndex(3);
        System.out.println("Selected option in anime: " + series.getFirstSelectedOption().getText());
	}

}