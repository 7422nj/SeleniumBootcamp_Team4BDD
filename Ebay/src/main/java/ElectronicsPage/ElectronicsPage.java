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
    public  ElectronicsPage() { PageFactory.initElements(driver,this); }
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
//    JavascriptExecutor js;
//
//    {
//        try {
//            js = (JavascriptExecutor) driver;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

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

    /**
     * Search functionality #10
     */

    public void sendKeysToSearchBarUsingOutline(String productName){
        typeOnElement(WEB_ELEMENT_SEARCH_LOCATOR,productName); }

    public void selectSubmitSearchButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_BUTTON_SEARCH);
    }

    public void verifyOutlineSearchHeader(String expectedHeader) throws InterruptedException {
        assertEqualsGetAttribute(expectedHeader,WEB_ELEMENT_SEARCH_LOCATOR,"value");
    }

//        if (true) {
//            driver.findElement(By.xpath("//span[.='Macbook']")).getText();
//            implicitWait(15);
//            {
//                while (true) {//call
//                    driver.findElement(By.xpath("//span[.='Airpods']")).getText();
//                    implicitWait(15);
//                    {
//                        if (false) {
//                            continue;
//                        }//mac
//                        driver.findElement(By.xpath("//span[.='iPhone']")).getText();
//                        implicitWait(15);
//                        break;
//                    }
//                }
//            }
//        }
//    }
    //////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    Electronics Main Page
     */

    /**
     * Scenario #1
     */

    public void scrollToHeadphones(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_HEADPHONES);
    }

    public void selectHeadphones(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_HEADPHONES);
    }

    public void selectSonyHeadphones(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_SONY_HEADPHONE);
    }

    public void scrollDown(){
        try {
            robotScrollDown(6);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void verifyHeadphonesHeader(String Expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_HEADPHONE,Expected);
    }

    public void verifyNotHeadphonesHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_HEADPHONE);
    }

    public void verifyPageTitle(String expected){
        softAssertAssertEqualsGetTitle(expected);
    }

    /**
     * Scenario #2
     */

    public void scrollToComputers(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_COMPUTERS);
    }

    public void selectComputers(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_COMPUTERS);
    }

    public void scrollToAcer(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_ACER);
    }

    public void selectAcer(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_ACER);
    }

    public void verifyAcerHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_ACER,expected);
    }

    public void verifyNotAcerHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_ACER);
    }

    public void verifyCurrentUrl(String expected){
        assertEqualsGetCurrentUrl(expected);
    }

    /**
     * Scenario #3
     */

    public void scrollToApple(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_APPLE);
    }

    public void selectApple(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_APPLE);
    }

    public void scrollToAppleWatch(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_WATCH);
    }

    public void selectAppleWatch(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_WATCH);
    }

    public void verifyAppleWatchHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_WATCH,expected);
    }

    public void verifyNotAppleWatchHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_WATCH);
    }

    /**
     * Scenario #4
     */

    public void scrollToSmartHome(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_SMART);
    }

    public void selectSmartHome(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_SMART);
    }

    public void scrollToEchoDot(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_ECHO);
    }

    public void selectEchoDot(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_ECHO);
    }

    public void verifyEchoHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_ECHO_HEADER,expected);
    }

    public void verifyNotEchoHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_ECHO_HEADER);
    }
}
