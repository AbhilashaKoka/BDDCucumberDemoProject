package seleniumUITest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium2DemoTest {
        WebDriver driver;


        public void setUpDriver(){
        System.setProperty("Webdriver.driver.chrome", "\\src\\test\\resource\\driver\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless=new"); // CI-friendly
        driver = new ChromeDriver(options);
        driver.get("https://www.emirates.com/in/english/");
        }



        public void HomePageMethodToHandleModalAndBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ot-sdk-container > div:has(div) > div:nth-of-type(2) button:nth-of-type(2)")));
        WebElement banner=driver.findElement(By.cssSelector(".ot-sdk-container > div:has(div) > div:nth-of-type(2) button:nth-of-type(2)"));
        banner.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#modal-wrapper > div > div :has(button[id=\"modal-close\"])>button")));
        WebElement modalBox=driver.findElement(By.cssSelector("#modal-wrapper > div > div :has(button[id=\"modal-close\"])>button"));
        modalBox.click();
//        WebElement LogIn_Button=driver.findElement(By.cssSelector("div[class=\"js-ek-global-navigation-secondarymenu ek-global-navigation__secondarymenu\"]>ul>li:nth-of-type(3)>a"));
//        LogIn_Button.click();
//


//        WebElement Email=driver.findElement(By.cssSelector("input[id=\"registration-email\"]"));
//        Email.sendKeys("kokaabhilasha.qa@gmail.com", Keys.TAB);
         driver.close();
    }


    @Test
    public void test(){
            setUpDriver();
            HomePageMethodToHandleModalAndBanner(driver);
    }


}