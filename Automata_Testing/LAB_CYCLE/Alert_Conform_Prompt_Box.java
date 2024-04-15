package record;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_box {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();


        // Navigate to a webpage with an alert dialog
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        
        // AlertBox
        
        driver.findElement(By.id("alertBox")).click();// Click on the button that triggers the alert dialog
        Alert alert = driver.switchTo().alert(); // Switch to the alert dialog
        String alertText = alert.getText(); // Get the text from the alert dialog
        System.out.println("Alert Text: " + alertText);
        Thread.sleep(3000);
        alert.accept();// Accept the alert (Clicking OK)
        System.out.println("The Alert Text output :"+driver.findElement(By.id("output")).getText());
        Thread.sleep(3000);
        
        //conformationBox
        driver.findElement(By.id("confirmBox")).click();// Click on the button that triggers the conform dialog
        Alert conform = driver.switchTo().alert();// Switch to the conform dialog
        String ConformText = alert.getText();// Get the text from the conform dialog
        System.out.println("Conform Text: " + ConformText);
        Thread.sleep(3000);
        alert.accept();// Accept the alert (Clicking OK)
        System.out.println("The Conform Text output :"+driver.findElement(By.id("output")).getText());
        Thread.sleep(3000);
        
        //PromptBox
        driver.findElement(By.id("promptBox")).click();// Click on the button that triggers the prompt dialog
        Alert prompt = driver.switchTo().alert();// Switch to the conform dialog
        String PromptText = alert.getText();// Get the text from the prompt dialog
        System.out.println("Prompt Request Text: " + PromptText);
        prompt.sendKeys("Neeraj");
        Thread.sleep(3000);
        alert.accept();// Accept the alert (Clicking OK)
        System.out.println("The Prompt Text output :"+driver.findElement(By.id("output")).getText());
        Thread.sleep(3000);
        
    }
}
