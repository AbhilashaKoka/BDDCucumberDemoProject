package seleniumUITest.locatorUtilites;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorDemo {
    public static void main(String[] args) {
        // Make sure chromedriver is on your PATH or use WebDriverManager
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://example.com");

            // Locate by ID
            WebElement submitButton = driver.findElement(
                    CSSSelector.byId("submit-button")
            );
            submitButton.click();

            // Locate by class
            WebElement inputField = driver.findElement(
                    CSSSelector.byClass("form-control")
            );
            inputField.sendKeys("Hello World");

            // Locate by attribute (exact match)
            WebElement usernameField = driver.findElement(
                    CSSSelector.byAttribute(null, "data-testid", "username", CSSSelector.AttributeMatchType.EXACT)
            );
            usernameField.sendKeys("testuser");

            // Locate by parent-child
            WebElement spanInsideDiv = driver.findElement(
                    CSSSelector.byParentChild("div", "span")
            );
            System.out.println("Found span inside div: " + spanInsideDiv.getText());

            // Locate by pseudo-class
            WebElement firstListItem = driver.findElement(
                    CSSSelector.byPseudo(CSSSelector.PseudoClassType.FIRST_CHILD, 0)
            );
            System.out.println("First list item: " + firstListItem.getText());

            // XPath fallback: locate by text
            WebElement textElement = driver.findElement(
                    CSSSelector.byText("More information...")
            );
            System.out.println("Found element by text: " + textElement.getText());

        } finally {
            driver.quit();
        }
    }
}