package HelpNFaqsPage;

import HelpNFaqsPage.MacysDataDriver.DataSource;
import common.WebAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.support.PageFactory;

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

    public void verifyNoPasswordHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_NO_PASSWORD,expected);
    }

    /**
     * Scenario #6
     */

    public void verifyNoEmailHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_NO_EMAIL,expected);
    }















}


