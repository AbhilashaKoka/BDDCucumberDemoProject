package seleniumUITest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.emirates.com/in/english/");


    }
}