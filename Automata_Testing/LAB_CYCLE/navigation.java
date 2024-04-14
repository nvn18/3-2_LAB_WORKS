package record;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String s = driver.getTitle();
		System.out.println("The title is:"+s);
		String url = driver.getCurrentUrl();
		System.out.println("The Current URl is:"+url);
	}

}
