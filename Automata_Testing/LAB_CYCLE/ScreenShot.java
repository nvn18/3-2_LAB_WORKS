package page;

import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;
public class ScreenShot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.16.20.20/sis/studindex.php");
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File srcfle = tk.getScreenshotAs(OutputType.FILE);
		File Destfle = new File("Z:/screenshot.png"); // Stores in the Z driver with name of the screenshot.png 
    // you can also change the path to either C drive , D drive or to downloads
		try {
		FileUtils.copyFile(srcfle,Destfle);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
