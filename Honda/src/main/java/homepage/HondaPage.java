package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static homepage.HomePageWebElement.*;

public class HondaPage extends WebAPI {

    /////////////////////////////////////////////////////////////////
    public HondaPage(){ PageFactory.initElements(driver,this); }
    ////////////////////////////////////////////////////////////////


    // Find By Annotation: First Approach
    @FindBy(how = How.CSS, using = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(how = How.ID, using = searchBoxLocator)
    public WebElement searchBox;


    /**
     * Scenario #1
     */

    public void selectSearchBarButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_LINK);
    }

    public void selectSearchField(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_FIELD);
    }

    public void sendKeysToSearchFieldUsingTable(String searchText){
        typeOnElement(WEB_ELEMENT_SEARCH_FIELD,searchText);
    }

    public void verifyAttributeValueOfSearchField(String expectedValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),expectedValue);
    }

    public void verifyPageTitle(String expected){
        Assert.assertEquals(driver.getTitle(),expected);
    }

    public void verifyNotExpectedValueAttribute(String notExpectedValue){
        Assert.assertNotEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),notExpectedValue);
    }

    /**
     * Scenario #2
     */

    public void sendKeysToSearchFieldUsingTableWHeader(String keyword){
        typeOnElement(WEB_ELEMENT_SEARCH_FIELD,keyword);
    }

    public void verifyAttributeValueFromTableWHeader(String expectedValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),expectedValue);
    }

    public void verifyNotAttributeValueFromTableWHeader(String expectedValue){
        Assert.assertNotEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD,"value"),expectedValue);
    }

    /**
     * Scenario #3
     */

    public void selectButtonMoreInfo(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_BUTTON_MORE);
    }

    public void scrollToElementCovidInfo() throws InterruptedException {
        robotScrollDown(6);
    }

    public void switchTabsFromCovidInfoToHomeTab(){
        switchTabToDefault();
    }

    public void verifyUrlIsCorrectHondaMain(String url){
        Assert.assertTrue(isCurrentUrlTrue(url));
    }

    public void verifyUrlIsNotCorrectHondaMain(String url){
        Assert.assertFalse(isCurrentUrlTrue(url));
    }

}
