package ElectronicsPage;

import ElectronicsPage.EbayDataDriver.DataSource;
import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;

import static ElectronicsPage.ElectronicsLocators.*;

public class ElectronicsPage extends WebAPI {

///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public ElectronicsPage() { PageFactory.initElements(driver,this); }
///////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Robot Available for All Below Methods
    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    //JavaScriptExecutor available for all below methods
    JavascriptExecutor js;

    {
        try {
            js = (JavascriptExecutor) driver;
        } catch (Exception e) {
            e.printStackTrace();
        }

//        //Actions available for all below methods
//        Actions actions;
//
//        {
//            try {
//                actions = new Actions(driver);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Search functionality Scenario #1
     */

    //Step 1 -> Hover over Search Field
    public void hoverOverSearchField(){
        basicHoverUsingXpath(WEB_ELEMENT_SEARCH_LOCATOR);
    }//Step 2 -> Select Search Field
    public void selectSearchField(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_LOCATOR);
    }//Step 3 -> Enter Macbook in Search Field
    public void sendKeysToSearch(){
        typeOnElement(WEB_ELEMENT_SEARCH_LOCATOR,WEB_ELEMENT_INPUT_MACBOOK);
    }//Finally -> Verify Attribute "value" is Macbook
    public void verifyMacbookValueAttribute(String expectedText) throws InterruptedException {
        assertEqualsGetAttribute(expectedText,WEB_ELEMENT_SEARCH_LOCATOR,"value"); }

    /**
     * Search functionality Scenario #2
      */

    public void selectSearchButton() throws InterruptedException {
        click(WEB_ELEMENT_BUTTON_SEARCH);
    }

    /**
     * Search functionality #3
     */

    public void verifySearchBoxIsDisplayed(String exp){ String expected = exp;
        boolean actual = driver.findElement(By.xpath(WEB_ELEMENT_SEARCH_LOCATOR)).isDisplayed();
        Assert.assertTrue(exp.equalsIgnoreCase(String.valueOf(actual))); }

    /**
     * Search functionality #4
      */

    public void verifySearchBoxIsEnabled(String exp){ String expected = exp;
        boolean actual = driver.findElement(By.xpath(WEB_ELEMENT_SEARCH_LOCATOR)).isEnabled();
        Assert.assertTrue(exp.equalsIgnoreCase(String.valueOf(actual))); }

    /**
     * Search functionality #5
      */

    public void verifySearchBoxIsNotSelected(String exp){
        String expected = exp;
        boolean actual = driver.findElement(By.xpath(WEB_ELEMENT_SEARCH_LOCATOR)).isSelected();
        Assert.assertTrue(exp.equalsIgnoreCase(String.valueOf(actual)));
    }

    /**
     * Search functionality #6
     */

    public void sendKeysUsingMYSQLDB() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String username = elementFromDatabase.get(2);
        typeOnElementNEnter(WEB_ELEMENT_SEARCH_LOCATOR,username);
    }

    /**
     * Search functionality #7
     */

    public void getPageTitle(String exp){
        assertEqualsGetTitle(exp);
    }

    /**
     * Search functionality #8
     */

    public void clearSearchBox(){
        clearInput(WEB_ELEMENT_SEARCH_LOCATOR);
    }

    /**
     * Search functionality #9
     */

    public void selectDropDown(){
        find(WEB_ELEMENT_LINK_DROP_DOWN);
        waitTimeExplicit(WEB_ELEMENT_LINK_DROP_DOWN);
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_DROP_DOWN); }

    public void hoverOverComputersAndTablets(){
        basicHoverUsingXpath(WEB_ELEMENT_SELECT_DROP_DOWN); }

    public void selectComputersAndTablets(){
        find(WEB_ELEMENT_SELECT_DROP_DOWN);
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SELECT_DROP_DOWN);
    }
}
