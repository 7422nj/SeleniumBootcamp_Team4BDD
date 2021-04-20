package stepDefinitions;

import ElectronicsPage.ElectronicsPage;
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

import java.io.IOException;

public class ElectronicsStepDefinition extends WebAPI {

    //////////////////////////////////////////////////////////////
    public static ElectronicsPage electron = new ElectronicsPage();
    /////////////////////////////////////////////////////////////

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Ebay");  // embed it in the report
        }
    }
    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on ebay electronics page")
    public void iAmOnEbayElectronicsPage() throws IOException {
        // Call Action method
        openBrowser("https://www.ebay.com/b/Electronics/bn_7000259124");
////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

    /**
     * Scenario #1
     */

    @When("I scroll to portable audio & headphones")
    public void iScrollToPortableAudioHeadphones() {
        electron.scrollToHeadphones();
    }

    @And("I click on portable audio & headphones")
    public void iClickOnPortableAudioHeadphones() {
        electron.selectHeadphones();
    }

    @And("I scroll down page to find available headphones")
    public void iScrollDownPageToFindAvailableHeadphones() {
        electron.scrollDown();
    }

    @And("I click on sony headphones")
    public void iClickOnSonyHeadphones() {
        electron.selectSonyHeadphones();
    }

    @And("I should see {string} as header")
    public void iShouldSeeAsHeader(String expected) {
        electron.verifyHeadphonesHeader(expected);
    }


    @But("I should not see {string} as header")
    public void iShouldNotSeeAsHeader(String expected) {
        electron.verifyNotHeadphonesHeader(expected);
    }

    @Then("I should see {string} as page title")
    public void iShouldSeeAsPageTitle(String expected) {
        electron.verifyPageTitle(expected);
    }

    @When("I scroll to Computers, Components & Accessories")
    public void iScrollToComputersComponentsAccessories() {
        electron.scrollToComputers();
    }

    @And("I click on Computers, Components & Accessories")
    public void iClickOnComputersComponentsAccessories() {
        electron.selectComputers();
    }

    @And("I scroll down to Acer Laptop")
    public void iScrollDownToAcerLaptop() {
        electron.scrollToAcer();
    }

    @And("I click on Acer Laptop")
    public void iClickOnAcerLaptop() {
        electron.selectAcer();
    }

    @And("I should see {string} as laptop header")
    public void iShouldSeeAsLaptopHeader(String exp) {
        electron.verifyAcerHeader(exp);
    }

    @But("I should not see {string} as laptop header")
    public void iShouldNotSeeAsLaptopHeader(String exp) {
        electron.verifyNotAcerHeader(exp);
    }

    @Then("I should see {string} as current page url")
    public void iShouldSeeAsCurrentPageUrl(String exp) {
        electron.verifyCurrentUrl(exp);
    }

    /**
     * Scenario #3
     */

    @When("I scroll to Apple")
    public void iScrollToApple() {
        electron.scrollToApple();
    }

    @And("I click on Apple")
    public void iClickOnApple() {
        electron.selectApple();
    }

    @And("I scroll to Apple Watch")
    public void iScrollToAppleWatch() {
        electron.scrollToAppleWatch();
    }

    @And("I click on Apple Watch")
    public void iClickOnAppleWatch() {
        electron.selectAppleWatch();
    }

    @And("I should see {string} as apple watch header")
    public void iShouldSeeAsAppleWatchHeader(String expected) {
        electron.verifyAppleWatchHeader(expected);
    }

    @But("I should not see {string} as apple watch header")
    public void iShouldNotSeeAsAppleWatchHeader(String expected) {
        electron.verifyNotAppleWatchHeader(expected);
    }

    /**
     * Scenario #4
     */

    @When("I scroll to Smart Home & Surveillance")
    public void iScrollToSmartHomeSurveillance() {
        electron.scrollToSmartHome();
    }

    @And("I click on Smart Home & Surveillance")
    public void iClickOnSmartHomeSurveillance() {
        electron.selectSmartHome();
    }

    @And("I scroll to Amazon Echo Dot")
    public void iScrollToAmazonEchoDot() {
        electron.scrollToEchoDot();
    }

    @And("I click on Amazon Echo Dot")
    public void iClickOnAmazonEchoDot() {
        electron.selectEchoDot();
    }

    @And("I should see {string} as Echo Dot header")
    public void iShouldSeeAsEchoDotHeader(String expected) {
        electron.verifyEchoHeader(expected);
    }

    @But("I should not see {string} as Echo Dot header")
    public void iShouldNotSeeAsEchoDotHeader(String expected) {
        electron.verifyNotEchoHeader(expected);
    }
}