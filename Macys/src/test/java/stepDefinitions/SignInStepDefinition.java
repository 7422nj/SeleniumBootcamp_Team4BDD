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

    @When("I hover over sign in drop down")
    public void iHoverOverSignInDropDown() {
        help.hoverOverSignInDropDown();
    }


    @And("I click on drop down option Sign In")
    public void iClickOnDropDownOptionSignIn() {
        help.selectSignInFromDropDown();
    }

    @And("I should see {string} as sign up header")
    public void iShouldSeeAsSignUpHeader(String expected) {
        help.verifyHeaderSignUpHere(expected);
    }

    @And("I click on create an account button")
    public void iClickOnCreateAnAccountButton() {
        help.selectCreateAccountButton();
    }

    @And("I should see {string} as sign in header")
    public void iShouldSeeAsSignInHeader(String expected) {
        help.verifySignInHeader(expected);
    }

    @Then("I verify {string} as macys sign up and sign in page title")
    public void iVerifyAsMacysSignUpAndSignInPageTitle(String expected) {
        help.getPageTitle(expected);
    }
}

