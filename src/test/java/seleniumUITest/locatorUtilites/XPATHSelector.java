package seleniumUITest.locatorUtilites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHSelector {


    public static By byXPath(String xpath) {
        return By.xpath(xpath);
    }

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