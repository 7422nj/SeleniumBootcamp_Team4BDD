package Adventure;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Adventure.AdventurePageWebElement.*;
public class AdventurePage extends WebAPI {


    public AdventurePage() {PageFactory.initElements(driver,this);}


    public void selectSearchField(){ clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_FIELD);
    }

    public void sendKeysToSearchFieldUsingTable(String Keys){
        typeOnElementNEnter(WEB_ELEMENT_SEARCH_FIELD,Keys);
        implicitWait(20);

    }

    public void sendKeysToSearchDatedUsingTable(String Keys){
        typeOnElementNEnter(WEB_ELEMENT_SEARCH_DATE,Keys);
        implicitWait(20);

    }


    public void verifySearchFieldValue(String value){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),value);
    }

    public void verifySearchDateValue(String value){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_DATE,"value"),value);
    }

    public void verifyPageUrl(String Url){
        Assert.assertTrue(isCurrentUrlTrue(Url));
    }



}
