package seleniumUITest.locatorUtilites;

import org.openqa.selenium.By;

public class XPathUtil {

    private XPathUtil() {
        // Prevent instantiation
    }

    public static By byXPath(String xpath) {
        return By.xpath(xpath);
    }

    // 🔹 Text-based locators
    public static By byText(String text) {
        return byXPath("//*[text()='" + text + "']");
    }

    public static By byContainsText(String text) {
        return byXPath("//*[contains(text(),'" + text + "')]");
    }

    public static By byNormalizeText(String text) {
        return byXPath("//*[normalize-space()='" + text + "']");
    }

    // 🔹 Attribute-based locators
    public static By byAttribute(String attr, String value) {
        return byXPath("//*[@" + attr + "='" + value + "']");
    }

    public static By byContainsAttribute(String attr, String value) {
        return byXPath("//*[contains(@" + attr + ",'" + value + "')]");
    }

    public static By byStartsWithAttribute(String attr, String value) {
        return byXPath("//*[starts-with(@" + attr + ",'" + value + "')]");
    }

    // 🔹 Tag + Attribute
    public static By byTagAndAttribute(String tag, String attr, String value) {
        return byXPath("//" + tag + "[@" + attr + "='" + value + "']");
    }

    // 🔹 Parent → Child
    public static By byParentChild(String parent, String child) {
        return byXPath("//" + parent + "/" + child);
    }

    // 🔹 Ancestor → Descendant
    public static By byAncestorDescendant(String ancestor, String descendant) {
        return byXPath("//" + ancestor + "//" + descendant);
    }

    // 🔹 Sibling locators
    public static By followingSibling(String tag) {
        return byXPath("//following-sibling::" + tag);
    }

    public static By precedingSibling(String tag) {
        return byXPath("//preceding-sibling::" + tag);
    }

    // 🔹 Index-based
    public static By byIndex(String tag, int index) {
        return byXPath("(//" + tag + ")[" + index + "]");
    }

    public static By lastElement(String tag) {
        return byXPath("(//" + tag + ")[last()]");
    }

    // 🔹 Parent / Ancestor
    public static By parent(String tag) {
        return byXPath("//" + tag + "/parent::*");
    }

    public static By ancestor(String tag) {
        return byXPath("//" + tag + "/ancestor::*");
    }

    // 🔹 Child existence
    public static By hasChild(String parent, String child) {
        return byXPath("//" + parent + "[" + child + "]");
    }

    // 🔹 Complex reusable patterns
    public static By buttonByText(String text) {
        return byXPath("//button[normalize-space()='" + text + "']");
    }

    public static By linkByText(String text) {
        return byXPath("//a[text()='" + text + "']");
    }

    public static By inputByPlaceholder(String placeholder) {
        return byXPath("//input[@placeholder='" + placeholder + "']");
    }

    public static By inputByType(String type) {
        return byXPath("//input[@type='" + type + "']");
    }

    // 🔹 Dynamic XPath (VERY useful in frameworks)
    public static By dynamicXpath(String xpath, Object... values) {
        return By.xpath(String.format(xpath, values));
    }
}