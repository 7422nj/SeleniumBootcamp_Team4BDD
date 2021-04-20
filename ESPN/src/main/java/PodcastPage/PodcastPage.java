package PodcastPage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import static PodcastPage.PodcastLocators.*;

public class PodcastPage extends WebAPI {

    /////////////////////////////////////////////////////////////////////
    public PodcastPage() { PageFactory.initElements(driver, this); }
    ////////////////////////////////////////////////////////////////////

    //Robot available for all methods below
    Robot robot;
    {
        try {
        robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
    }
    //////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1:
     */

    public void scrollToMelNTodds(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_MEl);
    }

    public void selectMelNTodds(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_MEl);
    }

    public void verifyMelNToddsDate(String expectedDate){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_MEl,expectedDate);
    }

    public void verifyNotMelNToddsDate(String expectedDate){
        softAssertAssertNotEqualsGetText(expectedDate,WEB_ELEMENT_VERIFY_MEl);
    }

    public void verifyPageTitle(String expected){
        softAssertAssertEqualsGetTitle(expected);
    }

    /**
     * Scenario #2
     */

    public void scrollToESPNDaily(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_ESPN);
    }

    public void selectESPNDaily(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_ESPN);
    }

    public void verifyESPNDailyHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_ESPN,expected);
    }

    public void verifyNotESPNDailyHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_ESPN);
    }

    /**
     * Scenario #3
     */

    public void scrollTo30For30(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_30);
    }

    public void select30For30(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_30);
    }

    public void verify30For30Header(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_30,expected);
    }

    public void verifyNot30For30Header(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_30);
    }

    /**
     * Scenario #4
     */

    public void scrolledToAdams(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_ADAM);
    }

    public void selectAdam(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_ADAM);
    }

    public void verifyAdamHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_ADAM,expected);
    }

    public void verifyNotAdamHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_ADAM);
    }

    /**
     * Scenario #5
     */

    public void scrolledToLaChina(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_WBB);
    }

    public void selectLaChina(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_WBB);
    }

    public void verifyLaChinaHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_WBB,expected);
    }

    public void verifyNotLaChineseHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_WBB);
    }





















}
