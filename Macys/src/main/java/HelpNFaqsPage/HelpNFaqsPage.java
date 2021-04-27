package HelpNFaqsPage;

import HelpNFaqsPage.MacysDataDriver.DataSource;
import common.WebAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.awt.*;
import java.util.List;

import static HelpNFaqsPage.HelpNFaqsLocators.*;

public class HelpNFaqsPage extends WebAPI {

    ////////////////////////////////////////////////////////////////////
    public HelpNFaqsPage() { PageFactory.initElements(driver, this); }
    ///////////////////////////////////////////////////////////////////

    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    ////////////////////////////////////////////////////////////////////

    /*
    Sign in Functionalities
     */

    /**
     * Scenario #1
     */

    public void hoverOverSignInDropDown(){ basicHoverUsingXpath(WEB_ELEMENT_DROP_DOWN_SIGN_IN); }

    public void selectSignInFromDropDown(){ click(WEB_ELEMENT_DROP_DOWN_SELECT); }

    public void verifyHeaderSignUpHere(String expect){ softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_SIGN_UP,expect); }

    public void verifySignInHeader(String expect){ softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_SIGN_IN,"Returning customer"); }

    public void getPageTitle(String expect){ softAssertAssertEqualsGetTitle(expect); }

    /**
     * Scenario #2
     */

    public void enterEmail() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String email = elementFromDatabase.get(0);
        typeOnElement(WEB_ELEMENT_INPUT_EMAIL,email);
    }

    public void enterPassword() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String password = elementFromDatabase.get(1);
        typeOnElement(WEB_ELEMENT_INPUT_PASSWORD,password);
    }

    public void selectSignInButton() throws InterruptedException {
        find(WEB_ELEMENT_BUTTON_SIGN_IN);
        clickByXNCssUsingJavaScript(WEB_ELEMENT_BUTTON_SIGN_IN);
    }

    public void verifyAccessDenied(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_ACCESS_DENIED,expected);
    }

    /**
     * Scenario #3
     */

    public void enterInvalidPassword() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String password = elementFromDatabase.get(2);
        typeOnElement(WEB_ELEMENT_INPUT_PASSWORD,password);
    }

    public void verifyPasswordErrorHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_PASS_ERROR,expected);
    }

    /**
     * Scenario #4
     */

    public void enterInvalidEmail() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String invalidEmail = elementFromDatabase.get(5);
        typeOnElement(WEB_ELEMENT_INPUT_EMAIL,invalidEmail);
    }

    /**
     * Scenario #5
     */

    public void verifyNoPasswordHeader(String expected){ softAssertAssertEqualsGetText(WEB_ELEMENT_NO_PASSWORD,expected); }

    /**
     * Scenario #6
     */

    public void verifyNoEmailHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_NO_EMAIL,expected);
    }

    /**
     * Scenario #8
     */

    public void navigateBackToHelpNFaqsPage(){
        navigateBack();
    }

    public void verifyHelpNFaqsPageHeader(String expected){ softAssertAssertEqualsGetText(WEB_ELEMENT_HELP_HEADER,expected); }

    public void verifyPageTitle(String expected){
        softAssertAssertEqualsGetTitle(expected);
    }

    /**
     * Scenario #9
     */

    public void sendKeysEmailSignIn(String emailAddress){
        typeOnElement(WEB_ELEMENT_INPUT_EMAIL,emailAddress);
    }

    public void sendKeysPasswordSignIn(String Password){
        typeOnElement(WEB_ELEMENT_INPUT_PASSWORD,Password);
    }

    public void verifyNotAccessDeniedHeader(String expected){
        Assert.assertNotEquals(getTextFromElement(WEB_ELEMENT_VERIFY_ACCESS_DENIED),expected);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////

   /*
   Search Bar Functionalities
    */


    /**
     * Scenario #1
     */

    public void selectSearchField(){ click(WEB_ELEMENT_SEARCH_BAR); }

    public void sendKeysToSearchField() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String returnItem = elementFromDatabase.get(6);
        typeOnElement(WEB_ELEMENT_SEARCH_BAR,returnItem); }

    public void verifyTextInSearchField(String expected) throws InterruptedException { assertEqualsGetAttribute(expected,WEB_ELEMENT_SEARCH_BAR,"value"); }

    /**
     * Scenario #2
     */

    public void selectSearchButton(){ click(WEB_ELEMENT_BUTTON_SEARCH); }

    public void verifyReturnResult(String expected) throws InterruptedException { assertEqualsGetAttribute(expected,WEB_ELEMENT_VERIFY_RETURN_SEARCH,"value"); }

    public void sendInvalidKeysToSearchField() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String invalidKeys = elementFromDatabase.get(1);
        typeOnElement(WEB_ELEMENT_SEARCH_BAR,invalidKeys); }

    /**
     * Scenario #3
      */

    public void verifyNoResultsHeader(String expected){ softAssertAssertEqualsGetText(WEB_ELEMENT_NO_RESULTS_HEADER,expected); }


    /**
     * Scenario #4
     */

    public void sendKeysToSearchFieldUsingTable(String Keys) {
        typeOnElement(WEB_ELEMENT_SEARCH_BAR,Keys);
    }

    public void verifyValueOfWrittenSearches(String Keys){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR,"value"),Keys);
    }

    public void verifyNotValueWrittenSearches(String Keys){
        Assert.assertNotEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR,"value"),Keys);
    }

    /**
     * Scenario #5
     */

    public void scrollToShippingNDelivery(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_SHIPPING);
    }

    public void hoverOverShipping(){
        basicHoverUsingXpath(WEB_ELEMENT_BOX_SHIPPING);
    }

    public void hoverOverTrackMyOrderNClick(){
        hoverOverNClickUsingXpath(WEB_ELEMENT_LINK_TRACK_ORDERS,WEB_ELEMENT_LINK_TRACK_ORDERS);
    }

    public void sendKeysItemIDCode() throws Exception{
        DataSource.insertDataIntoDB();
        List<String> itemCode = DataSource.getItemsListFromDB();
        String code = itemCode.get(7);
        typeOnElement(WEB_ELEMENT_INPUT_ITEM_ID,code);
        waitTimeExplicit(WEB_ELEMENT_INPUT_EMAIL_FIELD);
        String email = itemCode.get(0);
        typeOnElement(WEB_ELEMENT_INPUT_EMAIL_FIELD,email);
    }

    public void selectButtonGetMoreDetails() {
        clickByXNCssUsingJavaScript(WEB_ELEMENT_BUTTON_GET_DETAILS);
    }

    public void verifyErrorMessageHeaderTrackOrder(String expectedErrorMessage){
        Assert.assertEquals(getTextFromElement(WEB_ELEMENT_VERIFY_ERROR_HEADER),expectedErrorMessage);
    }











}


