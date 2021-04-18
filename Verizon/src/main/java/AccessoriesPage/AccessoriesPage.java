package AccessoriesPage;

import AccessoriesPage.VerizonDataDriver.DataSource;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static AccessoriesPage.AccessoriesLocators.*;

public class AccessoriesPage extends WebAPI {

    ////////////////////////////////////////////////////////////////////////
    public AccessoriesPage() { PageFactory.initElements(driver, this); }
    ///////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////

    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    ///////////////////////////////////////////////////////////////////////

    @FindBy(xpath = WEB_ELEMENT_EXAMPLE)
    public WebElement example;

    //-> Deals Link
//    @FindBy (xpath = WEB_ELEMENT_DEALS_LINK)
//    public WebElement Deals;

    ///////////////////////////////////////////////////////////////////////

    /*
    Deals Features
     */

    /**
     * Scenario #1
     */

    public void scrollToDealsLink() throws InterruptedException {
        WebElement Deals = driver.findElement(By.xpath(WEB_ELEMENT_DEALS_LINK));
        scrollToElementUsingActions(Deals);
    }

    public void implicitWaitForDeals(){
        implicitWait(5);
    }

    public void selectAddFilters(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_FILTERS_DEALS);
    }

    public void selectDropDownColors(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_DROP_DOWN_COLORS);
    }

    public void selectBlackCheckBox(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_BLACK_COLOR);
    }

    public void verifyBlackFilter(String expected) throws InterruptedException {
        assertEqualsGetAttribute(expected,WEB_ELEMENT_VERIFY_BLACK,"value");
    }

    public void verifyPageTitle(String expected) throws InterruptedException {
       softAssertAssertEqualsGetTitle(expected);
    }

    /**
     * Scenario #2
     */

    public void selectDropDownSort(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_DROP_DOWN_SORT);
    }

    public void selectLowToHighPrice(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_PRICE_SORT);
    }

    public void verifyPriceLowToHigh(String expected) throws InterruptedException {
        assertEqualsGetAttribute(expected,WEB_ELEMENT_PRICE_SORT,"value");
    }

    /**
     * Scenario #5
     */

    public void navigateToAccessoriesPage(){
        navigateBack();
    }

    /**
     * Scenario #3
     */

    public void selectFieldCompatible(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_FIELD_COMPATIBLE);
    }

    public void sendKeysIphoneToField() throws Exception {
        typeOnElement(WEB_ELEMENT_FIELD_COMPATIBLE,WEB_ELEMENT_IPHONE);
        DataSource.insertDataIntoDB();
        List<String> elements = DataSource.getItemsListFromDB();
        String iPhone = elements.get(2);
        typeOnElementNEnter(WEB_ELEMENT_FIELD_COMPATIBLE,iPhone);
        implicitWait(5);
    }

    public void verifyIphoneInField(String expected) throws InterruptedException {
        assertEqualsGetAttribute(expected,WEB_ELEMENT_FIELD_COMPATIBLE,"value");
    }

    public void selectIphone12DropDown() throws InterruptedException {
        clickByXNCssUsingJavaScript(WEB_ELEMENT_IPHONE_DROP_DOWN);
        implicitWait(5);
    }

    public void verifyIphone12CompatibleHeader(String expected) throws InterruptedException {
        softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_IPHONE12,expected);
    }

    /**
     * Scenario #4
     */

    public void scrollToSamsungCase(){
        WebElement ele = driver.findElement(By.xpath(WEB_ELEMENT_SAMSUNG_LINK));
        scrollToElementUsingActions(ele);
        implicitWait(5);
    }

    public void selectSamsungCase(){
       clickByXNCssUsingJavaScript(WEB_ELEMENT_SAMSUNG_LINK);
    }

    public void scrollDownSamsungCasePage(){
        try {
            robotScrollDown(6);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void selectCheckOutButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_BUTTON_CHECKOUT);
    }

    public void verifyShoppingCartHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_BEGIN_CHECKOUT,expected);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    Accessories Main Page
     */

    /**
     * Scenario #1
     */

    public void scrollToWhatsTrending(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_HEADER_TRENDING);
    }

    public void verifyTrendingHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_TRENDING,expected);
    }

    public void verifyShouldNotSeeTrending(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_HEADER_TRENDING);
    }

    /**
     * Scenario #2
     */

    public void selectAirPodsLink(){
        clickByXNCssUsingActions(WEB_ELEMENT_LINK_AIRPODS);
    }

    public void verifyAirPodsHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_AIRPODS,expected);
    }

    public void verifyPriceAirPods(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_PRICE,expected);
    }

    /**
     * Scenario #3
     */

    public void scrollToBottomOfAccessoriesPage(){
        scrollToBottomOfPage();
        implicitWait(10);
    }

    public void scrollToTopOfAccessoriesPage(){
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        implicitWait(10);
    }

    public void refreshAccessoriesPage() throws InterruptedException, AWTException {
        refresh();
        implicitWait(10);
    }

    public void verifyAccessoriesHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_ACCESSORIES,expected);
    }














}
