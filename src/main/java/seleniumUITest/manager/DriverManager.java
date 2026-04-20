package seleniumUITest.manager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;

public class DriverManager {
    static JavascriptExecutor js;
    static Actions action;
    static WebElement element;

    private static DriverManager instance;
    private WebDriver driver;

    // Private constructor
    private DriverManager() {
        driver = createDriver();
    }

    // Singleton accessor
    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    private WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return new ChromeDriver(options);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            instance = null;
        }

    }        public  void launchBaseUrl(){
        driver.get("https://demoqa.com");
        }


    public static void waitForElementToAppear(By finBy, WebDriver driver) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(finBy));
    }


    public static void scrollWindow(WebDriver driver) {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }


    public static void scrollWindowUp(WebElement element,WebDriver driver) {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", element);
    }

    public static void scrollWindowDown(WebDriver driver) {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-300)");
    }

    public static void MoveToElement(WebElement element,WebDriver driver) {
        action = new Actions(driver);
        action.moveToElement(element).perform();
    }


    public static void waitForElementToVisible(WebElement element,WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static String getWindowHandler(WebDriver driver) {
        return driver.getWindowHandle();
    }

    public static ArrayList<String> getWindowHandlers(WebDriver driver) {
        return new ArrayList<>(driver.getWindowHandles());
    }

    public static Object[] getWindowHandlersArrayOfObject(WebDriver driver) {

        return driver.getWindowHandles().toArray();

    }

    public static void SwitchTOWindowObject(Object[] windowsHandles, int index, WebDriver driver){
        driver.switchTo().window((String) windowsHandles[index]);

    }

    public static void SwitchToWindowByIndex(ArrayList<String> handles, int index,WebDriver driver)
    {
        String handle=handles.get(index);
        driver.switchTo().window(handle);
    }

    public static void SwitchToWindowByName(String parentWindow,WebDriver driver)
    {

        driver.switchTo().window(parentWindow);
    }

    public static void NavigateToUrl(String url,WebDriver driver)
    {
        driver.get(url);
    }

    public static Dimension GetSizeOfWindow(WebDriver driver){
        return driver.manage().window().getSize();
    }

    public static Point GetPositionOfWindow(WebDriver driver)
    {
        return driver.manage().window().getPosition();
    }


    public static void switchToframeByIndex(int index,WebDriver driver)
    {
        driver.switchTo().frame(index);
    }


    public static void switchToframeByName(WebElement str,WebDriver driver)
    {
        driver.switchTo().frame(str);
    }


}
