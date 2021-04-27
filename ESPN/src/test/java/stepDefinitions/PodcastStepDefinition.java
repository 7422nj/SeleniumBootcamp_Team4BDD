package stepDefinitions;

import PodcastPage.PodcastPage;
import common.WebAPI;
import homepage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PodcastStepDefinition extends WebAPI {

    ///////////////////////////////////////////////////
    public static PodcastPage pod = new PodcastPage();
    ///////////////////////////////////////////////////

    @Given("I am on ESPN Podcasts Page")
    public void iAmESPNPodcastsPage() {
        try {
            openBrowser("https://www.espn.com/espnradio/podcast/");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @After public void closeBrowser(){
        cleanUp();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */

    @When("I scroll to Mel & Todd All-Satellite Team")
    public void iScrollToMelToddAllSatelliteTeam() {
        pod.scrollToMelNTodds();
    }


    @And("I click on Mel & Todd All-Satellite Team")
    public void iClickOnMelToddAllSatelliteTeam() {
        pod.selectMelNTodds();
    }

    @And("I should see {string} as date of the podcast")
    public void iShouldSeeAsDateOfThePodcast(String expected) {
        pod.verifyMelNToddsDate(expected);
    }

    @But("I should not see {string} as date of the podcast")
    public void iShouldNotSeeAsDateOfThePodcast(String expected) {
        pod.verifyNotMelNToddsDate(expected);
    }

    @Then("I should see {string} as page title")
    public void iShouldSeeAsPageTitle(String expected) {
        pod.verifyPageTitle(expected);
    }

    /**
     * Scenario #2
     */

    @When("I scroll to ESPN Daily Podcast")
    public void iScrollToESPNDailyPodcast() {
       pod.scrollToESPNDaily();
    }

    @And("I click on ESPN Daily Podcast")
    public void iClickOnESPNDailyPodcast() {
        pod.selectESPNDaily();
    }

    @And("I should see {string} header of podcast")
    public void iShouldSeeHeaderOfPodcast(String expected) {
        pod.verifyESPNDailyHeader(expected);
    }

    @But("I should not see {string} header of podcast")
    public void iShouldNotSeeHeaderOfPodcast(String expected) {
        pod.verifyNotESPNDailyHeader(expected);
    }

    /**
     * Scenario #3
     */

    @When("I scroll to 30 for 30")
    public void iScrollToFor() {
        pod.scrollTo30For30();
    }

    @And("I click on 30 for 30")
    public void iClickOnFor() {
        pod.select30For30();
    }

    @And("I should see {string} as 30 for 30 header")
    public void iShouldSeeAsForHeader(String expected) {
        pod.verify30For30Header(expected);
    }

    @But("I should not see {string} as 30 for 30 header")
    public void iShouldNotSeeAsForHeader(String expected) {
        pod.verifyNot30For30Header(expected);
    }

    /**
     * Scenario #4
     */

    @When("I scroll to The Adam Schefter Podcast \\(NFL)")
    public void iScrollToTheAdamSchefterPodcastNFL() {
        pod.scrolledToAdams();
    }

    @And("I click on The Adam Schefter Podcast \\(NFL)")
    public void iClickOnTheAdamSchefterPodcastNFL() {
        pod.selectAdam();
    }

    @And("I should see {string} as Adam Podcast Header")
    public void iShouldSeeAsAdamPodcastHeader(String expected) {
        pod.verifyAdamHeader(expected);
    }

    @But("I should not see {string} as Adam Podcast Header")
    public void iShouldNotSeeAsAdamPodcastHeader(String expected) {
        pod.verifyNotAdamHeader(expected);
    }

    /**
     * Scenario #5
     */

    @When("I scroll to Around the Rim with LaChina Robinson \\(WBB)")
    public void iScrollToAroundTheRimWithLaChinaRobinsonWBB() {
        pod.scrolledToLaChina();
    }

    @And("I click on Around the Rim with LaChina Robinson \\(WBB)")
    public void iClickOnAroundTheRimWithLaChinaRobinsonWBB() {
        pod.selectLaChina();
    }

    @And("I should see {string} as LaChina Podcast Header")
    public void iShouldSeeAsLaChinaPodcastHeader(String expected) {
        pod.verifyLaChinaHeader(expected);
    }

    @But("I should not see {string} as LaChina Podcast Header")
    public void iShouldNotSeeAsLaChinaPodcastHeader(String expected) {
        pod.verifyNotLaChineseHeader(expected);
    }

    /**
     * Scenario #6
     */

    @When("I scroll to The Daily Wager Podcast Page")
    public void iScrollToTheDailyWagerPodcastPage() {
        pod.scrolledToWager();
    }

    @And("I click on The Daily Wager Podcast Page Link")
    public void iClickOnTheDailyWagerPodcastPageLink() {
        pod.selectWager();
    }

    @And("I should see {string} as Daily Wager header")
    public void iShouldSeeAsDailyWagerHeader(String expected) {
        pod.verifyWagerHeader(expected);
    }

    @But("I should not see {string} as Daily Wager header")
    public void iShouldNotSeeAsDailyWagerHeader(String expected) {
        pod.verifyNotWagerHeader(expected);
    }

    /**
     * Scenario #7
     */

    @When("I scroll to The ESPN Investigates Podcast Page")
    public void iScrollToTheESPNInvestigatesPodcastPage() {
        pod.scrolledToInvestigates();
    }

    @And("I click on The ESPN Investigates Podcast Page")
    public void iClickOnTheESPNInvestigatesPodcastPage() {
        pod.selectInvestigates();
    }

    @And("I should see {string} as Investigates header")
    public void iShouldSeeAsInvestigatesHeader(String expected) {
        pod.verifyInvestigatesHeader(expected);
    }

    @But("I should not see {string} as Investigates header")
    public void iShouldNotSeeAsInvestigatesHeader(String expected) {
        pod.verifyNotInvestigatesHeader(expected);
    }

    /**
     * Scenario #8
     */

    @When("I scroll to Getting The Team Back Podcast")
    public void iScrollToGettingTheTeamBackPodcast() {
        pod.scrollToElementDownloadTeamPod();
    }

    @And("I hover over download link")
    public void iHoverOverDownloadLink() {
        pod.hoverOverElementDownloadTeamPod();
    }

    @And("I click on download link")
    public void iClickOnDownloadLink() {
        pod.selectDownloadTeamPod();
    }

    @And("I click on audio play button")
    public void iClickOnAudioPlayButton() {
        pod.selectAudioPlayButton();
    }

    @Then("I should see audio box is {string} displayed")
    public void iShouldSeeAudioBoxIsDisplayed(String expected) {
        pod.verifyAudioBoxIsDisplayed(expected);
    }

    @But("I should not see {string} no other boxes are displayed")
    public void iShouldNotSeeNoOtherBoxesAreDisplayed(String expected) {
        pod.verifyNotDisplayedOnPage(expected);
    }

    @When("I click on search button")
    public void iClickOnSearchButton() {
        pod.selectSearchButton();
    }

    @And("I click on search field")
    public void iClickOnSearchField() {
        pod.selectSearchField();
    }

    @And("I enter {string} into search field")
    public void iEnterIntoSearchField(String searchPodcasts) throws InterruptedException {
        pod.sendKeysUsingTable(searchPodcasts);
    }

    @And("I should see {string} written in search field")
    public void iShouldSeeInWrittenInSearchField(String expectedValue) {
        pod.verifyAttributeValueOfSearchField(expectedValue);
    }

    @But("I should not see {string} written in search field")
    public void iShouldNotSeeWrittenInSearchField(String notExpectedValue) {
        pod.verifyNotAttributeValueOfSearchField(notExpectedValue);
    }
}


