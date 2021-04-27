package stepDefinitions;

import SupportPage.SupportPage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class SignInStepDefinition extends WebAPI {

    /////////////////////////////////////////////////////////////////////////////////////////////
    public static SupportPage support = new SupportPage();
    ////////////////////////////////////////////////////////////////////////////////////////////

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "ATT");  // embed it in the report
        }
    }
    @Given("I am on ATT Support Page")
    public void iAmOnATTSupportPage() throws IOException {
        openBrowser("https://www.att.com/support/");
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */

    @When("I click on sign in link")
    public void iClickOnSignInLink() {
        support.selectSignInLink();
    }

    @And("I enter user id")
    public void iEnterUserId() throws Exception {
        support.enterUserID();
    }

    @And("I enter password")
    public void iEnterPassword() throws Exception {
        support.enterPassword();
    }

    @And("I click on submit sign in button")
    public void iClickOnSubmitSignInButton() throws InterruptedException {
        support.selectSubmitSignIn();
    }

    @Then("I should see {string} as error code")
    public void iShouldSeeAsErrorCode(String exp) {
        support.verifyErrorCode(exp);
    }

    @Then("I should see {string} as password error code")
    public void iShouldSeeAsPasswordErrorCode(String exp) {
        support.verifyErrorPasswordCode(exp);
    }

    @Then("I should see {string} as user id error code")
    public void iShouldAsUserIdErrorCode(String exp) {
        support.verifyErrorUserID(exp);
    }

    @When("I hover over sign in")
    public void iHoverOverSignIn() {
        support.hoverOverSignInLink();
    }

    @Then("I should see {string} as sign in page header")
    public void iShouldSeeAsSignInPageHeader(String exp) {
        support.VerifySignInPageHeader(exp);
    }

    @Then("I should see {string} as page title")
    public void iShouldSeeAsPageTitle(String exp) {
        support.verifyPageTitle(exp);
    }
}
