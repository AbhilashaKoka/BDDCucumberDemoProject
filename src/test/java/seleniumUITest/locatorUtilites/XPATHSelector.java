package seleniumUITest.locatorUtilites;

import org.openqa.selenium.By;

public class XPATHSelector {
    public static By byXPath(String xpath) {
        return By.xpath(xpath);
    }
    public static By locateByText(String text) {
        return byXPath("//*[text()='" + text + "']");
    }
    public static By locateByPartialText(String partialText) { return byXPath("//*[contains(text(),'" + partialText + "')]");    }
    public static By locateByAttributeAndValue(String attribute, String value) { return byXPath("//*[@" + attribute + "='" + value + "']");    }
    public static By locateByTagAndAttributeValue(String tagName, String attribute, String value) {  return byXPath("//" + tagName + "[@" + attribute + "='" + value + "']");    }
    public static By locateByParentChildTag(String parentTag, String childTag) {return byXPath("//" + parentTag + "/" + childTag);    }
    public static By locateByAncestorDescendant(String ancestorTag, String descendantTag) { return byXPath("//" + ancestorTag + "//" + descendantTag);    }
    public static By locateByAncestorOrSelfAncestorValue(String AncestorValue) {  return byXPath("./ancestor-or-self::[@class='" + AncestorValue + "']");    }
    public static By locateByFollowingSibling(String siblingTag) {return byXPath("//following-sibling::" + siblingTag);    }
    public static By locateByPrecedingSibling(String siblingTag) { return byXPath("//preceding-sibling::" + siblingTag);    }
    public static By locateByDescendantOrSelf(String descendantTag) {return byXPath("//descendant-or-self::"+ descendantTag);    }
    public static By locateByAncestorOrSelfAndAncestorTag(String AncestorTag) {  return byXPath("//ancestor-or-self::"+ AncestorTag);    }
    public static By locateByChildTag(String ChildTag) { return byXPath("//Child::"+ ChildTag); }
    public static By locateByItemAndCheckAttribute(String Item) { return byXPath("//'" + Item + "'[@price > 2*@discount]");    }
    public static By locateByAllElements() {return byXPath("//*");    }
    public static By locateByTextOfFirstHeading() { return byXPath("string(//h1[1]/text())");   }
    public static By locateBySpanInside() {return byXPath("//li[child::span]");   }
    public static By locateBySpanParent() {return byXPath("//span/parent::li");         }
    public static By locateByLastOfDescendentAndSelf() { return byXPath("//ul/descendant-or-self::[last()]"); }
    public static By locateByByLi() {
     return byXPath("//ul/li");
    }
    public static By locateByChildLi() {
    return byXPath("//ul/child::li");
    }
    public static By locateByFollowingSiblingLi() {
     return byXPath("//ul/following-sibling::li");
    }
    public static By locateByPrecedingSiblingLi()   { return byXPath("//ul/preceding-sibling::li"); }
    public static By locateByDescentSelfLi()
   {
   return byXPath("//ul/descendant-or-self::li");
   }
    public static By locateByAncestorSelfLi(){return byXPath("//ul/ancestor-or-self::li");}
    public static By locateByByLiAndLink() {
      return byXPath("//ul/li/a");
    }
    public static By locateByChildAndLink() { return byXPath("//child::ul/child::li/child::a");}
    public static By locateByselectcount() {
     return byXPath("//ul[count(li) > 2]");
    }
    public static By locateByselectcountli() {
  return byXPath("//ul[count(child::li) > 2])");
    }
    public static By locateByuseSelectParentWithText(String Submit) {  return byXPath("// button[not(starts-with(text(),'"+Submit+"'))])");}
    public static By locateByselectString() {
     return byXPath("//string()");
}
    public static By locateByselectnumber() { return byXPath("//number()");}
    public static By locateByselectboolean() {return byXPath("//boolean()");   }
    public static By locateByselectcontains(String head) {return byXPath("//font[contains(@class,'"+head+"')]"); }
    public static By locateByselectstartswith(String head) { return byXPath("//font[starts-with(@class,'"+head+"')]");}
    public static By locateByendswith(String head) { return byXPath("//font[ends-with(@class,'"+head+"')]");}
    public static By locateByConcat() { return byXPath("//concat(x,y)");}
    public static By locateBysubstring() { return byXPath("//substring(str, start, len)"); }
    public static By locateBysubstringbefore(String str ) { return byXPath("//substring-before('"+str+"')"); }
    public static By locateBysubstringafter(String str) { return byXPath("//substring-after('"+str+"')"); }
    public static By locateBytranslate() { return byXPath("//translate()"); }
    public static By locateBynormalizeSpace() { return byXPath("//normalize-space()"); }
    public static By locateBystringlength() { return byXPath("//string-length()");}
    public static By locateBystartswith() { return byXPath("//[starts-with(name(), 'h')]"); }
    public static By textbutton(String Submit) {return byXPath("//button[text()='"+Submit+"']");}
    public static By buttontext01() {return byXPath("//button/text()");}
    public static By langstr() {return byXPath("//lang(str)"); }
    public static By namespaceuri(){return byXPath("//namespace-uri()");}
    public static By tablecounttr() { return byXPath("//table[count(tr)=1]");}
    public static By useSelectposition(){return byXPath("// ol/li[position()=2]");}
    public static By useSelectLInk() { return byXPath("//a[1]");}
    public static By useSelectlast() { return byXPath("//a[last()]");}
    public static By useSelectLi() { return byXPath("//ol/li[2]");}
    public static By useSelectPositionequal() { return byXPath("//ol/li[position()=2]");}
    public static By useSelectPositionlessthan() { return byXPath("//ol/li[position()>1]");}
    public static By useSelecthref() {  return byXPath("//a[1][@href='/']");}
    public static By useSelecthref01() {  return byXPath("// a[@href='/'][1]");}
    public static By useSelectsection() {  return byXPath("// section[.//h1[@id='hi']");}
    public static By useSelectboolean() { return byXPath("// div[true()]");}
    public static By useSelectParentwithHead(String head) {return byXPath("//div[@class='"+head+"']");}
    public static By useSelectParent(String head,String top) { return byXPath("//div[@class='"+head+"'][@id='"+top+"']");}public static By useSelectParentWithString(String xyz) {return byXPath("//a[@id = '"+xyz+"']");}
    public static By useSelectParentWithNot(String xyz) { return byXPath("//a[@id != '"+xyz+"']");}
  public static By useSelectParentWithLessThan() {return byXPath("//a[@price > 25]");}
    public static By useSelectParentWithHeadAndPosition(String head) {return byXPath("//div[@id='"+head+"' and position()=2]");}
    public static By useSelectParentWithDivAndNot() {return byXPath("//div[(x and y) or not(z)]");}
    public static By useSelectParentWithCount() {return byXPath("//ul[count(li[@class='hide']) > 0]");}
    public static By useSelectParentWithLi() {return byXPath("//ul[li]");}
    public static By useSelectParentWithId(String xyz) {return byXPath("// *[@id='"+xyz+"']");}
    public static By useSelectParentWithIdTag(String xyz) {  return byXPath("//*[@class='"+xyz+"']");}
    public static By useSelectParentWithInputType(String xyz) {return byXPath("//input[@type='"+xyz+"']");}
    public static By useSelectParentWithIdAndFor(String xyz) {  return byXPath("//a[@id='"+xyz+"'][@for='"+xyz+"']]");}
    public static By useSelectParentWithLink() {return byXPath("//a[@rel]");}
    public static By useSelectParentWithStartWith() {return byXPath("//a[starts-with(@href, '/')]");}
    public static By useSelectParentWithEndWith() {  return byXPath("//a[ends-with(@href, '.pdf')]");}
    public static By useSelectParentWithHref() { return byXPath("//a[contains(@href, '://')]");}
    public static By useSelectParentWithRel() { return byXPath("//a[contains(@rel, 'help')]");}
    public static By useSelectParentWithLiandUl() { return byXPath("// ul/li/..");}
    public static By useSelectParentWithAncestorOrSelf() {    return byXPath("//li/ancestor-or-self::section");}
    public static By useSelectParentWithHrefAndLink() { return byXPath("//a/@href");}
    public static By useSelectParentWithSpan() {  return byXPath("//span/text()");}
    public static By locateByuseSelectParentWithFollowing() {  return byXPath("// h1/following-sibling::ul");}
    public static By locateByuseSelectParentWithSibling(String xyz) { return byXPath("//h1/following-sibling::ul[1]");}
    public static By locateByuseSelectParentWithSiblingId(String xyz) {return byXPath("//h1/following-sibling::[@id='"+xyz+"'] ");}
    public static By locateByuseSelectParentWithLi1() {return byXPath("// ul/li[1]");}
    public static By locateByuseSelectParentWithLi2() {return byXPath("//ul/li[2]");}
    public static By locateByuseSelectParentWithLast() {return byXPath("//ul/li[last()]");}
    public static By locateByuseSelectParentWithIdLi(String xyz) {return byXPath("//li[@id='"+xyz+"'][1]");}
    public static By locateByuseSelectParentWithALink() {return byXPath("//a[1]");     }
    public static By locateByuseSelectParentWithLast12() { return byXPath("//a[last()]");}
    public static By locateByuseSelectParentWithHead() { return byXPath("// h1");}
    public static By locateByuseSelectParentWithPara(){ return byXPath("//div//p");}
    public static By locateByuseSelectParentWithulLi() { return byXPath("//ul/li"); }
    public static By locateByuseSelectParentWithLink123(){return byXPath("//ul/li/a");}
    public static By locateByFollowingSiblingWithall(){  return byXPath("//div/*"); }

}