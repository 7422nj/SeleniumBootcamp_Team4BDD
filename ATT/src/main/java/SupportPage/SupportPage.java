package SupportPage;

import SupportPage.ATTDataDriver.DataSource;
import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

import static SupportPage.SupportLocators.*;

public class SupportPage extends WebAPI {

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public SupportPage() {
        PageFactory.initElements(driver, this);
    }
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

    /*
    Sign In Functionalities
     */

    /**
     * Scenario #1
     */

    public void selectSignInLink() { clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_SIGN_IN); }

    public void enterUserID() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String username = elementFromDatabase.get(0);
        typeOnElementNEnter(WEB_ELEMENT_INPUT_USERID, username); }

    public void enterPassword() throws Exception {
        DataSource.insertDataIntoDB();
        List<String> elementFromDatabase = DataSource.getItemsListFromDB();
        String password = elementFromDatabase.get(1);
        typeOnElementNEnter(WEB_ELEMENT_INPUT_PASSWORD, password); }

    public void selectSubmitSignIn() throws InterruptedException { clickByXNCssUsingJavaScript(WEB_ELEMENT_BUTTON_SUBMIT_SIGN_IN); }

    public void verifyErrorCode(String exp){ assertEqualGetText(WEB_ELEMENT_ERROR_CODE,exp); }

    /**
     * Scenario #2
     */

    public void verifyErrorPasswordCode(String exp){ assertEqualGetText(WEB_ELEMENT_ERROR_PASSWORD,exp); }

    /**
     * Scenario #3
      */

    public void verifyErrorUserID(String exp){ assertEqualGetText(WEB_ELEMENT_ERROR_USERID,exp); }

    /**
     * Scenario #4
     */

    public void hoverOverSignInLink(){ basicHoverUsingXpath(WEB_ELEMENT_LINK_SIGN_IN); }

    public void VerifySignInPageHeader(String exp){ assertEqualGetText(WEB_ELEMENT_HEADER_SIGN_IN,exp); }

    public void verifyPageTitle(String exp){ softAssertAssertEqualsGetTitle(exp); }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    Search Bar Functionalities
     */

    /**
     * Scenario #1
     */

    public void selectSearchField(){ click(WEB_ELEMENT_SEARCH_FIELD); }

    public void verifySearchFieldIsEmpty(String expected){
        try {
            assertEqualsGetAttribute(expected, WEB_ELEMENT_SEARCH_FIELD, "value");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Scenario #2
     */

    public void sendKeysBillSupport(){
        try {
            DataSource.insertDataIntoDB();
            List<String> elementFromDatabase = DataSource.getItemsListFromDB();
            String bills = elementFromDatabase.get(3);
            typeOnElement(WEB_ELEMENT_SEARCH_FIELD, bills);
        } catch (Exception e){
            e.printStackTrace();

        }

    }

    /**
     * Scenario #3
     * @param expected
     */

    public void verifySearchResultDropDown(String expected){ assertEqualGetText(WEB_ELEMENT_RESULT_BILLS,expected);
    }
    public void selectBillsSupportDropDown(){ click(WEB_ELEMENT_RESULT_BILLS);
    }
    public void hoverOverBillsSupportDropDown(){ basicHoverUsingXpath(WEB_ELEMENT_RESULT_BILLS);
    }
    public void verifyBillsResultsHeader(String exp1,String exp2 ){
        assertEqualGetText(WEB_ELEMENT_HEADER_RESULTS,exp1);
        assertEqualGetText(WEB_ELEMENT_HEADER_RESULTS,exp2);

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    Support Main Page
     */

    /**
     * Scenario #1
     */

    public void scrollToElementBillsNAccounts(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_BILLS);
    }

    public void selectBillsSupport(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_BILLS);
    }

    public void verifyBillsResultHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_BILL_HEADER,expected);
    }

    public void verifyNotBillsResultHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_BILL_HEADER);
    }

    /**
     * Scenario #2
     */

    public void scrollToElementWireless(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_WIRELESS);
    }

    public void selectWireless(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_WIRELESS);
    }

    public void verifyWirelessResultHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_WIRELESS,expected);
    }

    public void verifyNotWirelessResultHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_WIRELESS);
    }

    /**
     * Scenario #3
     */

    public void scrollToElementInternet(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_INTERNET);
    }

    public void selectInternet(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_INTERNET);
    }

    public void verifyInternetResultHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_INTERNET,expected);
    }

    public void verifyNotInternetResultHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_INTERNET);
    }

    /**
     * Scenario #4
     */

    public void scrollToElementDigital(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_DIGITAL_PHONE);
    }

    public void selectDigital(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_DIGITAL_PHONE);
    }

    public void verifyDigitalResultHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_DIGITAL_PHONE,expected);
    }

    public void verifyNotDigitalResultHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_DIGITAL_PHONE);
    }














}
