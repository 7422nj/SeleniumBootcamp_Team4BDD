package stepDefinitions;

import HelpNFaqsPage.HelpNFaqsPage;
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

    ////////////////////////////////////////////////////////////////////////////////////////////
    public static HelpNFaqsPage help = new HelpNFaqsPage();
    ////////////////////////////////////////////////////////////////////////////////////////////

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Macys");  // embed it in the report
        }
    }

    @Given("I am on Macys Help & Faqs Page")
    public void iamonMacysHelpFaqsPage() throws IOException { openBrowser("https://www.customerservice-macys.com/app?cm_sp=navigation-_-bottom_nav-_-help_%26_faqs&lid=glbbtmnav_help_%26_faqs-us");
    }

    @After
    public void closeBrowser() { cleanUp(); }

    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */

    @When("I hover over sign in drop down") public void iHoverOverSignInDropDown() {
        help.hoverOverSignInDropDown();
    }

    @And("I click on drop down option Sign In") public void iClickOnDropDownOptionSignIn() { help.selectSignInFromDropDown(); }

    @And("I should see {string} as sign up header") public void iShouldSeeAsSignUpHeader(String expected) { help.verifyHeaderSignUpHere(expected); }

    @And("I should see {string} as sign in header") public void iShouldSeeAsSignInHeader(String expected) { help.verifySignInHeader(expected); }

    @Then("I verify {string} as macys sign up and sign in page title") public void iVerifyAsMacysSignUpAndSignInPageTitle(String expected) { help.getPageTitle(expected); }

    /**
     * Scenario #2
     */

    @And("I enter my email address") public void iEnterMyEmailAddress() throws Exception { help.enterEmail(); }

    @And("I enter my password") public void iEnterMyPassword() throws Exception { help.enterPassword(); }

    @And("I click sign in button") public void iClickSignInButton() throws InterruptedException { help.selectSignInButton(); }

    @Then("I should see {string} as page header") public void iShouldSeeAsPageHeader(String expected) { help.verifyAccessDenied(expected); }

    /**
     * Scenario #3
     * @throws Exception
     */

    @And("i enter invalid password") public void iEnterInvalidPassword() throws Exception { help.enterInvalidPassword(); }

    @Then("I should see {string} as password error message") public void iShouldSeeAsPasswordErrorMessage(String expected) { }

    /**
     * Scenario #4
     * @throws Exception
     */

    @And("I enter invalid email address") public void iEnterInvalidEmailAddress() throws Exception { help.enterInvalidEmail(); }

    @Then("I should see {string} as no password entered error code") public void iShouldSeeAsNoPasswordEnteredErrorCode(String expected) { help.verifyNoPasswordHeader(expected); }

    @Then("I should see {string} as no email entered error code") public void iShouldSeeAsNoEmailEnteredErrorCode(String expected) { help.verifyNoEmailHeader(expected); }

    @Then("I should see {string} for no email and {string} for no password") public void iShouldSeeForNoEmailAndForNoPassword(String expected1, String expected2) {
            help.verifyNoEmailHeader(expected1);
            help.verifyNoPasswordHeader(expected2); }

    @And("I navigate back to previous page") public void iNavigateBackToPreviousPage() { help.navigateBackToHelpNFaqsPage(); }

    @And("I should see {string} as help & faqs page header") public void iShouldSeeAsHelpFaqsPageHeader(String expected) { help.verifyHelpNFaqsPageHeader(expected); }

    @Then("I should see {string} as page title") public void iShouldSeeAsPageTitle(String expected) { help.verifyPageTitle(expected); }
}

