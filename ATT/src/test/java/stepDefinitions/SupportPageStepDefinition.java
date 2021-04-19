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
}
