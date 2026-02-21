package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WIndowHandle {
    public static void main(String[] args) {
        // Set ChromeDriver path if needed

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");
       driver.findElement(By.id("newWindowsBtn")).click();
        // Get current window handleid="newWindowsBtn"
        String currentWindow = driver.getWindowHandle();
        System.out.println("Current Window Handle: " + currentWindow);

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("All Window Handles: " + allWindows);

        // Switch to new window
        for (String handle : allWindows) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle);     //<------- imp
                System.out.println("Switched to new window: " + driver.getTitle());
                break;
            }
        }

        // Close the driver
        driver.quit();
    }

}
