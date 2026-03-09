package seleniumUITest.locatorstrategies;

import org.openqa.selenium.By;

public class CSSSelectorUtility {


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

}