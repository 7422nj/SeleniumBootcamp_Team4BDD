package stepDefinitions;

import SupportPage.SupportPage;
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

public class SupportPageStepDefinition extends WebAPI {

    /////////////////////////////////////////////////////
    public static SupportPage support = new SupportPage();
    ////////////////////////////////////////////////////

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","ATT");  // embed it in the report
        }
    }
    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("I am on ATT Support Main Page")
    public void iAmOnATTSupportMainPage() throws IOException {
        openBrowser("https://www.att.com/support/");
 //////////////////////////////////////////////////////////////////////////////////////////////////////
    }

    /**
     * Scenario 1
     * @throws InterruptedException
     */

    @When("I scroll down to bills")
    public void iScrollDownThePage() throws InterruptedException {
        support.scrollToElementBillsNAccounts();
    }

    @And("I click on Bills & Accounts")
    public void iClickOnBillsAccounts() {
        support.selectBillsSupport();
    }

    @And("I should see {string} as bills header")
    public void iShouldSeeAsBillsHeader(String expected) {
        support.verifyBillsResultHeader(expected);
    }

    @But("I should not see {string} as bills header")
    public void iShouldNotSeeAsBillsHeader(String expected) {
        support.verifyNotBillsResultHeader(expected);
    }

    /**
     * Scenario 2
     */

    @And("I click on Wireless")
    public void iClickOnWireless() {
        support.selectWireless();
    }

    @When("I scroll down to wireless")
    public void iScrollDownToWireless() {
        support.scrollToElementWireless();
    }

    @And("I should see {string} as wireless header")
    public void iShouldSeeAsWirelessHeader(String expected) {
        support.verifyWirelessResultHeader(expected);
    }

    @But("I should not see {string} as wireless header")
    public void iShouldNotSeeAsWirelessHeader(String expected) {
        support.verifyNotWirelessResultHeader(expected);
    }

    /**
     * Scenario 3
     */

    @When("I scroll to fixed internet")
    public void iScrollToATTInternet() {
        support.scrollToElementInternet();
    }

    @And("I click on fixed Internet")
    public void iClickOnATTInternet() {
        support.selectInternet();
    }

    @And("I should see {string} as internet header")
    public void iShouldSeeAsInternetHeader(String expected) {
        support.verifyInternetResultHeader(expected);
    }

    @But("I should not see {string} as internet header")
    public void iShouldNotSeeAsInternetHeader(String expected) {
        support.verifyNotInternetResultHeader(expected);
    }

    /**
     * Scenario 4
     */

    @When("I scroll to digital phone")
    public void iScrollToDigitalPhone() {
        support.scrollToElementDigital();
    }

    @And("I click on digital phone")
    public void iClickOnDigitalPhone() {
        support.selectDigital();
    }

    @And("I should see {string} as digital phone header")
    public void iShouldSeeAsDigitalPhoneHeader(String expected) {
        support.verifyDigitalResultHeader(expected);
    }

    @But("I should not see {string} as digital phone header")
    public void iShouldNotSeeAsDigitalPhoneHeader(String expected) {
        support.verifyNotDigitalResultHeader(expected);
    }
}
