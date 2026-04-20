package seleniumUITest.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    // ThreadLocal to hold WebDriver per thread
    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();


    // Initialize driver for current thread
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driverThread.set(new ChromeDriver(options));
    }

    // Get driver for current thread
    public static WebDriver getDriver() {
        return driverThread.get();
    }

    // Quit driver for current thread
    public static void quitDriver() {
        WebDriver driver = driverThread.get();
        if (driver != null) {
            driver.quit();
            driverThread.remove(); // important to avoid memory leaks
        }
    }
}
