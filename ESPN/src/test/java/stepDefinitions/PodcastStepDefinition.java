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
    //////////////////////////////////////////////////

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","ESPN");  // embed it in the report
        }
    }
    @Given("I am ESPN Podcasts Page")
    public void iAmESPNPodcastsPage() {
        try {
            openBrowser("https://www.espn.com/espnradio/podcast/");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @After
    public void closeBrowser(){
        cleanUp();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////

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
}


