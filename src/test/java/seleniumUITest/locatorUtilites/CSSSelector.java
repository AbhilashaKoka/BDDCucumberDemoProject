package seleniumUITest.locatorUtilites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {


    public static By byCssSelector(String selector) {
        return By.cssSelector(selector);
    }


    public static By locateById(String id) {

        return byCssSelector("#" + id);
    }

    public static By locateByClassName(String className) {

        return byCssSelector("." + className);
    }


    public static By locateByAttributeMatching(String tagName, String attribute, String partialValue, String matchType) {
        switch (matchType) {
            case "TagAndExactMatch":
                return byCssSelector(tagName + "[" + attribute + "='" + partialValue + "']");
            case "ExactMatch":
                return byCssSelector("[" + attribute + "='" + partialValue + "']");
            case "ContainsAttribute":
                return byCssSelector("[" + attribute + "*='" + partialValue + "']");
            case "IgnoreSuffixValue":
                return byCssSelector("[" + attribute + "|='" + partialValue + "']");
            case "StartWithValue":
                return byCssSelector("[" + attribute + "^='" + partialValue + "']");
            case "EndWithValue":
                return byCssSelector("[" + attribute + "$='" + partialValue + "']");
            case "ContainsAWord":
                return byCssSelector("[" + attribute + "~='" + partialValue + "']");
            default:
                return null;
        }
    }

    public static By locateByParentChild(String parentTag, String childTag) {
        return byCssSelector(parentTag + " > " + childTag);
    }

    public static By locateBySiblingPreceding(String precedingSiblingTag, String siblingTag) {
        return byCssSelector(precedingSiblingTag + " + " + siblingTag);
    }

    public static By locateBySiblingFollowing(String FollowingSiblingTag, String siblingTag) {
        return byCssSelector(FollowingSiblingTag + " + " + siblingTag);
    }

    public static By locateByDescendant(String ancestorTag, String descendantTag) {
        return byCssSelector(ancestorTag + " " + descendantTag);
    }


    //Element Matching Strategies
    public static By LocateByElementMatchingString(String matchingType, String Value) {
        switch (matchingType) {
            case "reverseSelection":
                return byCssSelector(":not(:first-child)");
            case "ElementWithMatchingDescendant":
                return byCssSelector(":has(" + Value + ")");
            case "ApplyMultipleSelectors":
                return byCssSelector(":is(" + Value + ")");
            case "selectFirstElementInGroup":
            default:
                return null;
        }
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