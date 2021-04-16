package ElectronicsPage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

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

    public void selectSearchButton(){
        click(WEB_ELEMENT_BUTTON_SEARCH);
    }
}
