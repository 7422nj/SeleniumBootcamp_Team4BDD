package HelpNFaqsPage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static HelpNFaqsPage.HelpNFaqsLocators.*;

public class HelpNFaqsPage extends WebAPI {

    ////////////////////////////////////////////////////////////////////
    public HelpNFaqsPage() {
        PageFactory.initElements(driver, this);
    }

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

    public void selectCreateAccountButton(){ click(WEB_ELEMENT_BUTTON_CREATE_ACCOUNT); }

    public void verifySignInHeader(String expect){ softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_SIGN_IN,"Returning customer"); }

    public void getPageTitle(String expect){ softAssertAssertEqualsGetTitle(expect); }















}


