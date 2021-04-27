package stepDefinitions;

import AccessoriesPage.AccessoriesPage;
import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

import static AccessoriesPage.AccessoriesLocators.WEB_ELEMENT_2IN1_CHARGER;

public class AccessoriesStepDefinition extends WebAPI {

    ////////////////////////////////////////////////////////
    public static AccessoriesPage ac = new AccessoriesPage();
    ///////////////////////////////////////////////////////

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","TMobile");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        ac= PageFactory.initElements(driver,AccessoriesPage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on Verizon Accessories Page")
    public void iAmOnVerizonAccessoriesPage() throws IOException {
        // Call Action method
        openBrowser("https://www.verizon.com/featured/accessories/#collections");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */
    @When("I scroll down to see what is trending header")
    public void iScrollDownToSeeWhatIsTrendingHeader() {
        ac.scrollToWhatsTrending();
    }


    @And("I should see {string} as header")
    public void iShouldSeeAsHeader(String expected) {
        ac.verifyTrendingHeader(expected);
    }

    @And("I should not see {string} as header")
    public void iShouldNotSeeAsHeader(String expected) {
        ac.verifyShouldNotSeeTrending(expected);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #2
     */

    @And("I click on Airpods")
    public void iClickOnAirpods() {
        ac.selectAirPodsLink();
    }

    @And("I should {string} as device item name")
    public void iShouldAsDeviceItemName(String expected) {
        ac.verifyAirPodsHeader(expected);
    }

    @Then("I should see {string} as item's total price")
    public void iShouldAsItemSTotalPrice(String expected) {
        ac.verifyPriceAirPods(expected);
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #3
     */

    @When("I scroll down to bottom of page")
    public void iScrollDownToBottomOfPage() {
        ac.scrollToBottomOfAccessoriesPage();
    }

    @And("I scroll up to top of page")
    public void iScrollUpToTopOfPage() {
        ac.scrollToTopOfAccessoriesPage();
    }

    @And("I refresh page")
    public void iRefreshPage() throws AWTException, InterruptedException {
        ac.refreshAccessoriesPage();
    }

    @And("I should see {string} as Accessories Main Title")
    public void iShouldSeeAsAccessoriesMainTitle(String expected) {
        ac.verifyAccessoriesHeader(expected);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #4
     */

    @When("I scroll to chargers link")
    public void iScrollToChargersLink() {
        ac.scrollToChargersLink();
    }

    @And("I should see {string} as header for chargers link")
    public void iShouldSeeAsHeaderForChargersLink(String expected) {
        ac.verifyChargersHeaderLink(expected);
    }

    @And("I click on chargers link")
    public void iClickOnChargersLink() {
        ac.selectChargersLink();
    }

    @And("I click on charger")
    public void iClickOnCharger() {
        ac.select2In1Charger();
    }

    @Then("I should see {string} is a reasonable price")
    public void iShouldSeeIsAReasonablePrice(String expected) {
        ac.verifyPriceCharger(expected);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #5
     * @throws InterruptedException
     */

    @And("I scroll down to charger")
    public void iScrollDown() throws InterruptedException {
        scrollToElementUsingJavaScript(WEB_ELEMENT_2IN1_CHARGER);
    }

    @And("I should see {string} as item header")
    public void iShouldSeeAsItemHeader(String expected) {
        ac.verifyWireLessChargerHeader(expected);
    }

    @And("I scroll to speakers link")
    public void iScrollToSpeakersLink() {
        ac.scrollToSpeakers();
    }

    @And("I click on speakers link")
    public void iClickOnSpeakersLink() {
        ac.selectSpeakersLink();
    }

    @And("I click on apple mini speaker")
    public void iClickOnAppleMiniSpeaker() {
        ac.selectAppleMiniSpeaker();
    }

    @Then("I should see {string} as apple item header")
    public void iShouldSeeAsAppleItemHeader(String expected) {
        ac.verifySpeakersHeader(expected);
    }

    @But("I should not see {string} as apple item header")
    public void iShouldNotSeeAsAppleItemHeader(String expected) {
        ac.verifyNotSpeakersHeader(expected);
    }

    /**
     * Scenario #6
     */

    @And("I scroll to gaming link")
    public void iScrollToGamingLink() {
        ac.scrollToGaming();
    }


    @And("I click on gaming link")
    public void iClickOnGamingLink() {
        ac.selectGamingLink();
    }

    @And("I click on gaming headphone")
    public void iClickOnGamingHeadphone() {
        ac.selectHeadphoneGaming();
    }

    @And("I should see {string} as item title")
    public void iShouldSeeAsItemTitle(String expected) {
        ac.verifyHeadphoneHeader(expected);
    }

    @But("I should not see {string} as item title")
    public void iShouldNotSeeAsItemTitle(String expected) {
        ac.verifyNotHeadphoneHeader(expected);
    }

    @And("I click on gaming keyboard")
    public void iClickOnGamingKeyboard() {
        ac.selectKeyboard();

    }

    @And("I should see {string} as keyboard header")
    public void iShouldSeeAsKeyboardHeader(String expected) {
        ac.verifyKeyboardHeader(expected);
    }

    @And("I should not see {string} as keyboard header")
    public void iShouldNotSeeAsKeyboardHeader(String expected) {
        ac.verifyNotKeyboardHeader(expected);
    }
}
