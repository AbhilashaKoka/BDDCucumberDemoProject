package seleniumUITest.locatorUtilites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHSelector {

    // Static utility method to get XPath locators
    public static By byXPath(String xpath) {
        return By.xpath(xpath);
    }

    // Generalized dynamic locators using XPath patterns
    public static By locateByText(String text) {
        return byXPath("//*[text()='" + text + "']");
    }

    public static By locateByPartialText(String partialText) {
        return byXPath("//*[contains(text(),'" + partialText + "')]");
    }

    public static By locateByAttribute(String attribute, String value) {
        return byXPath("//*[@"+ attribute + "='" + value + "']");
    }

    public static By locateByTagAndAttribute(String tagName, String attribute, String value) {
        return byXPath("//" + tagName + "[@" + attribute + "='" + value + "']");
    }

    public static By locateByParentChild(String parentTag, String childTag) {
        return byXPath("//" + parentTag + "/" + childTag);
    }

    public static By locateByAncestorDescendant(String ancestorTag, String descendantTag) {
        return byXPath("//" + ancestorTag + "//" + descendantTag);
    }

    public static By locateByFollowingSibling(String siblingTag) {
        return byXPath("//following-sibling::" + siblingTag);
    }

    public static By locateByPrecedingSibling(String siblingTag) {
        return byXPath("//preceding-sibling::" + siblingTag);
    }

    public static void main(String[] args) {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a test page
            driver.get("https://example.com");

            // Using generalized methods to find elements
            WebElement elementById = driver.findElement(CSSSelector.locateById("submit-button"));
            WebElement elementByClassName = driver.findElement(CSSSelector.locateByClassName("form-control"));
            WebElement elementByAttribute = driver.findElement(CSSSelector.locateByAttributeMatching(null,"data-testid", "username","ExactMatch"));
            WebElement elementByParentChild = driver.findElement(CSSSelector.locateByParentChild("div", "span"));
            WebElement elementBySibling = driver.findElement(CSSSelector.locateBySiblingPreceding("label", "input"));

            // Perform actions
            elementById.click();
            System.out.println("Element interaction completed.");

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}