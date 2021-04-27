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

public class SearchBarStepDefinition extends WebAPI {

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
    @Given("I am on ATT Support page")
    public void iAmOnATTSupportPage() {
        try {
            openBrowser("https://www.att.com/support/");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    /////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */
    @When("I click on search field") public void iClickOnSearchField() { support.selectSearchField();
    }
    @And("I should see {string} written in field") public void iShouldSeeWrittenInField(String expected) { support.verifySearchFieldIsEmpty(expected);
    }

    /**
     * Scenario #2
     */

    @And("I type bill support in search field") public void iTypeBillSupportInSearchField() { support.sendKeysBillSupport();
    }
    @Then("I should see {string} as a result in drop down") public void iShouldSeeAsAResultInDropDown(String expected) { support.verifySearchResultDropDown(expected);
    }

    /**
     * Scenario #3
     */

    @And("I click on bill support in all search results link")
    public void iClickOnBillSupportInAllSearchResultsLink() {
        support.selectBillsSupportDropDown();
    }

    @And("I hover over bill support in all search results link")
    public void iHoverOverBillSupportInAllSearchResultsLink() {
        support.hoverOverBillsSupportDropDown();
    }



}
