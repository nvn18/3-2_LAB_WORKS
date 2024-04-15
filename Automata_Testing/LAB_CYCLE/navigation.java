package record;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class navigation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); // picks to google website
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)); // delays for 5seconds
		driver.navigate().to("https://www.facebook.com");// navigates to the facebook website
		
		driver.navigate().back(); // navigates back to google webiste
		driver.navigate().forward(); // navigates forward to facebook website
		driver.navigate().refresh(); // refreshes the facebook website 
		String s = driver.getTitle(); // gets the title of current webpage
		System.out.println("The title is:"+s);
		String url = driver.getCurrentUrl(); // gets the current url of the webpage
		System.out.println("The Current URl is:"+url);
	}

}
