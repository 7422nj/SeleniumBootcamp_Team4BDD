package BrandOutletPage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static BrandOutletPage.BrandOutletLocators.*;


public class BrandOutletPage extends WebAPI {
    public BrandOutletPage() {
        PageFactory.initElements(driver,this);
    }

    public void searchitemsusingtables(String keys) throws Exception{
        typeOnElement(WEB_ELEMENT_SEARCH_ITEM,keys);

    }

    public void verifyAttributeValueFromSearchField(String keys){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_ITEM,"value"),keys);
    }

    public void verifyPageURL(String URL){
        Assert.assertTrue(isCurrentUrlTrue(URL));
    }

    public void clickBrandOutlet(){
        click(WEB_ELEMENT_BRAND_OUTLET);

    }

    public void clickPageLinks(String searchLinks){
        clickByXNCssUsingJavaScript(getPageLinkLocators(searchLinks));

    }

    public void verifyExpectedURL(String expectedURL){
        Assert.assertTrue(isUrlTrue(expectedURL));
    }

}
