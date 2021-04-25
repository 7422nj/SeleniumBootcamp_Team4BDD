package Toys;

import common.WebAPI;
import io.cucumber.java.bs.A;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.sql.Driver;

import static Toys.ToysPageWebElement.*;

public class ToysPage extends WebAPI {
    public ToysPage() {
        PageFactory.initElements(driver,this);
    }

    public void selectSearchField(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_FIELD);
    }

    public void sendKeysToSearchFieldUsingTable(String Keys){
        typeOnElementNEnter(WEB_ELEMENT_SEARCH_FIELD,Keys);
        implicitWait(20);

    }

    public void verifySearchFieldValue(String value){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),value);
    }

    public void verifyPageUrl(String Url){
        Assert.assertTrue(isCurrentUrlTrue(Url));
    }






}
