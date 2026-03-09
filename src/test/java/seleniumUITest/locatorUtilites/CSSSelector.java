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

    public static By LocateByElementMatchingString(String matchingType, String Value) {
        switch (matchingType) {
            case "reverseSelection":
                return byCssSelector(":not(:first-child)");
            case "ElementWithMatchingDescendant":
                return byCssSelector(":has(" + Value + ")");
            case "ApplyMultipleSelectors":
                return byCssSelector(":is(" + Value + ")");
            case "selectFirstElementInGroup":
                return byCssSelector(":first-child");
            case "selectLastElementInGroup":
                return byCssSelector(":last-child");
            case "selectNthElementInGroup":
                return byCssSelector(":nth-child(" + Value + ")");
            case "selectNthElementButReverse":
                return byCssSelector(":nth-last-child(" + Value + ")");
            case "selectFirstElementOfType":
                return byCssSelector(":first-of-type");
            case "selectLastElementOfType":
                return byCssSelector(":last-of-type");
            case "selectNthElementOfType":
                return byCssSelector(":nth-of-type(" + Value + ")");
            case "selectOnlyOfType":
                return byCssSelector(":only-of-type");
            default:
                return null;
        }
    }

    public static By locateByNonStandardFunction(String functionType, String argument) {
        switch (functionType) {
            case "selectAttrValue":
                return byCssSelector(":attr("+argument+")");
            case "selectTextValue":
                return byCssSelector(":text");
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
    //select preceding siblings
    //select parent or ancestor elements
    //select array

    public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://example.com");
            WebElement elementById = driver.findElement(CSSSelector.locateById("submit-button"));
            WebElement elementByClassName = driver.findElement(CSSSelector.locateByClassName("form-control"));
            WebElement elementByAttribute = driver.findElement(CSSSelector.locateByAttributeMatching(null,"data-testid", "username","ExactMatch"));
            WebElement elementByParentChild = driver.findElement(CSSSelector.locateByParentChild("div", "span"));
            WebElement elementBySibling = driver.findElement(CSSSelector.locateBySiblingPreceding("label", "input"));
            elementById.click();
            System.out.println("Element interaction completed.");
        } finally {
              driver.quit();
        }
    }
}