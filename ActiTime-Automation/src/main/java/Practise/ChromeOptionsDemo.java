package Practise;
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

    public class ChromeOptionsDemo {
        public static void main(String[] args) {

            ChromeOptions options = new ChromeOptions();

            options.addArguments("--headless");  // run in background
            options.addArguments("--start-maximized");//Starts Chrome with the window maximized.
            options.addArguments("--disable-notifications");//Disables pop-up notifications from websites.

            WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.google.com/");

            System.out.println("Title: " + driver.getTitle());
            driver.quit();
        }
    }

