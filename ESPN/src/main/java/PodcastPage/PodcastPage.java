package PodcastPage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

    /**
     * Scenario #6
     */

    public void scrolledToWager(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_WAGER);
    }

    public void selectWager(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_WAGER);
    }

    public void verifyWagerHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_WAGER,expected);
    }

    public void verifyNotWagerHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_WAGER);
    }

    /**
     * Scenario #7
     */

    public void scrolledToInvestigates(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_INVESTIGATES);
    }

    public void selectInvestigates(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_INVESTIGATES);
    }

    public void verifyInvestigatesHeader(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_VERIFY_INVESTIGATES,expected);
    }

    public void verifyNotInvestigatesHeader(String expected){
        softAssertAssertNotEqualsGetText(expected,WEB_ELEMENT_VERIFY_INVESTIGATES);
    }

    /**
     * Scenario #8
     */

    public void scrollToElementDownloadTeamPod(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_DOWNLOAD_POD);
    }

    public void hoverOverElementDownloadTeamPod(){
        basicHoverUsingXpath(WEB_ELEMENT_DOWNLOAD_POD);
    }

    public void selectDownloadTeamPod(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_DOWNLOAD_POD);
    }

    public void selectAudioPlayButton(){
        find(WEB_ELEMENT_AUDIO);
        clickByXNCssUsingJavaScript(WEB_ELEMENT_AUDIO);
    }

    public void verifyAudioBoxIsDisplayed(String expected){
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_VERIFY_AUDIO_BOX),expected);
    }

    public void verifyNotDisplayedOnPage(String expected){
        Assert.assertFalse(isElementDisplayed(WEB_ELEMENT_LINK_ADAM),expected);
    }

    /**
     * Scenario #9
     */

    public void selectSearchButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LINK_SEARCH_BAR);
    }

    public void selectSearchField(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_FIELD_SEARCH_BAR);
    }

    public void sendKeysUsingTable(String searchPodcasts) throws InterruptedException {
//        WebElement search = driver.findElement(By.xpath("//iframe[@src='javascript:void(0)']"));
//        iframeHandle(search);
        clickByXNCssUsingJavaScript(WEB_ELEMENT_FIELD_SEARCH_BAR);
        typeOnElement(WEB_ELEMENT_FIELD_SEARCH_BAR,searchPodcasts);
    }

    public void verifyAttributeValueOfSearchField(String expectedValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_FIELD_SEARCH_BAR,"value"),expectedValue);
    }

    public void verifyNotAttributeValueOfSearchField(String notExpectedValue){
        Assert.assertNotEquals(getAttributeFromElement(WEB_ELEMENT_FIELD_SEARCH_BAR,"value"),notExpectedValue);
    }





















}
