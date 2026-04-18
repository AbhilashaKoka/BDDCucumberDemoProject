package seleniumUITest.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseSetUp {
    private static BaseSetUp instance;
    private WebDriver driver;
    private BrowserMobProxy proxy;
    private JavascriptExecutor js;
    private Actions action;

    // Private constructor
    protected BaseSetUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    // Singleton accessor
    public static BaseSetUp getInstance() {
        if (instance == null) {
            instance = new BaseSetUp();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() {
        driver.get("https://demoqa.com");
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    @AfterMethod
    public void tearDown() throws IOException {
        if (driver != null) {
            driver.quit();
            driver = null;
            instance = null;
        }
        if (proxy != null) {
            File harFile = new File("network_capture.har");
            proxy.getHar().writeTo(harFile);
            proxy.stop();
        }
    }



    public void executeScrollAction() {
        js.executeScript("window.scrollBy(0,300)");
    }
}
