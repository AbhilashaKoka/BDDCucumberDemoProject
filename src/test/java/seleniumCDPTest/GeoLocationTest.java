package seleniumCDPTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

import java.util.Optional;

public class GeoLocationTest {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        // Override geolocation
        devTools.send(Emulation.setGeolocationOverride(
                Optional.of(40.7128),   // latitude
                Optional.of(-74.0060),  // longitude
                Optional.of(1)          // accuracy
        ));

        driver.get("https://www.google.com/maps");
        driver.quit();
    }
}
