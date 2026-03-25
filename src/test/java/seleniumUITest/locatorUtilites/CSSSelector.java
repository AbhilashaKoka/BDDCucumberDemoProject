package seleniumUITest.locatorUtilites;

import org.openqa.selenium.By;

/**
 * Utility class for building robust Selenium locators.
 * Separates CSS and XPath usage, avoids unsupported selectors,
 * and uses enums for type safety.
 */
public class CSSSelector {

    // --- ENUMS FOR TYPE SAFETY ---
    public enum AttributeMatchType {
        TAG_AND_EXACT,
        EXACT,
        CONTAINS,
        STARTS_WITH,
        ENDS_WITH,
        CONTAINS_WORD
    }

    public enum PseudoClassType {
        FIRST_CHILD,
        LAST_CHILD,
        NTH_CHILD,
        NTH_LAST_CHILD,
        FIRST_OF_TYPE,
        LAST_OF_TYPE,
        NTH_OF_TYPE,
        ONLY_OF_TYPE
    }

    // --- BASIC LOCATORS ---
    public static By byCss(String selector) {
        return By.cssSelector(selector);
    }

    public static By byId(String id) {
        return byCss("#" + id);
    }

    public static By byClass(String className) {
        return byCss("." + className);
    }

    // --- ATTRIBUTE MATCHING ---
    public static By byAttribute(String tag, String attribute, String value, AttributeMatchType type) {
        String prefix = (tag != null && !tag.isEmpty()) ? tag : "";
        switch (type) {
            case TAG_AND_EXACT:
                return byCss(prefix + "[" + attribute + "='" + value + "']");
            case EXACT:
                return byCss("[" + attribute + "='" + value + "']");
            case CONTAINS:
                return byCss("[" + attribute + "*='" + value + "']");
            case STARTS_WITH:
                return byCss("[" + attribute + "^='" + value + "']");
            case ENDS_WITH:
                return byCss("[" + attribute + "$='" + value + "']");
            case CONTAINS_WORD:
                return byCss("[" + attribute + "~='" + value + "']");
            default:
                throw new IllegalArgumentException("Unsupported match type");
        }
    }

    // --- PSEUDO CLASSES ---
    public static By byPseudo(PseudoClassType type, int index) {
        switch (type){
            case FIRST_CHILD: return byCss(":first-child");
            case LAST_CHILD: return byCss(":last-child");
            case NTH_CHILD: return byCss(":nth-child(" + index + ")");
            case NTH_LAST_CHILD: return byCss(":nth-last-child(" + index + ")");
            case FIRST_OF_TYPE: return byCss(":first-of-type");
            case LAST_OF_TYPE: return byCss(":last-of-type");
            case NTH_OF_TYPE: return byCss(":nth-of-type(" + index + ")");
            case ONLY_OF_TYPE: return byCss(":only-of-type");
            default: throw new IllegalArgumentException("Unsupported pseudo class");
        }
    }

    // --- RELATIONSHIPS ---
    public static By byParentChild(String parent, String child) {

        return byCss(parent + " > " + child);
    }

    public static By byDescendant(String ancestor, String descendant) {

        return byCss(ancestor + " " + descendant);
    }

    public static By byAdjacentSibling(String sibling1, String sibling2) {

        return byCss(sibling1 + " + " + sibling2);
    }

    // --- XPATH FALLBACKS ---
    public static By byText(String text) {

        return By.xpath("//*[text()='" + text + "']");
    }

    public static By byContainsText(String text) {

        return By.xpath("//*[contains(text(),'" + text + "')]");
    }

    public static By byPrecedingSibling(String element, String sibling) {
        return By.xpath("//" + element + "/preceding-sibling::" + sibling);
    }

    public static By byAncestor(String element, String ancestor) {
        return By.xpath("//" + element + "/ancestor::" + ancestor);
    }
}