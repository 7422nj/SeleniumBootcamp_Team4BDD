package stepDefinitions;

import ElectronicsPage.*;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static common.WebAPI.*;

public class SearchStepDefinitions {

     public static ElectronicsPage Electron = new ElectronicsPage();

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

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    }@Given("I am on ebay electronics page")
    public void iAmOnEbayHomePage() throws IOException { openBrowser("https://www.ebay.com/b/Electronics/bn_7000259124"); }
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */

    @When("I hover over search field") public void iHoverOverSearchField() {
        Electron.hoverOverSearchField();
    }
    @And("I click on click on Search field") public void iClickOnClickOnSearchField() {
        Electron.selectSearchField();
    }
    @And("I enter Macbook into Search field") public void iEnterMacbookIntoSearchField() {Electron.sendKeysToSearch(); }
    @Then("I should see {string} is written") public void iShouldSeeIsWritten(String expectedText) throws InterruptedException { Electron.verifyMacbookValueAttribute(expectedText); }

    /**
     * Scenario #2
     */

    @And("I click on Search button") public void iClickOnSearchButton() throws InterruptedException { Electron.selectSearchButton(); }

    /**
     * Scenario #3
     * @param expectedText
     */

    @Then("I verify {string} search box is displayed") public void iVerifySearchBoxIsDisplayed(String expectedText) { Electron.verifySearchBoxIsDisplayed(expectedText); }

    /**
     * Scenario #4
     * @param exp
     */

    @Then("I verify {string} search box is enabled") public void iVerifySearchBoxIsEnabled(String exp) { Electron.verifySearchBoxIsEnabled(exp); }

    /**
     * Scenario #5
     * @param exp
     */

    @Then("I verify {string} search box is not selected") public void iVerifySearchBoxIsNotSelected(String exp) { Electron.verifySearchBoxIsNotSelected(exp); }

    /**
     * Scenario #6
     * @throws Exception
     */

    @And("I enter Laptop into search box") public void iEnterLaptopIntoSearchBox() throws Exception { Electron.sendKeysUsingMYSQLDB(); }
    @Then("I verify {string} as page title") public void iVerifyAsPageTitle(String exp) { Electron.getPageTitle(exp); }

    @And("I clear text in search field")
    public void iClearTextInSearchField() {
        Electron.clearSearchBox();
    }

    @And("I click on dropdown All Categories")
    public void iClickOnDropdownAllCategories() {
        Electron.selectDropDown();
    }

    @And("I hover over computers and tablets")
    public void iHoverOverComputersTablets() {
        Electron.hoverOverComputersAndTablets();
    }

    @And("I click on computers and tablets")
    public void iClickOnComputersAndTablets() {
        Electron.selectComputersAndTablets();
    }
}
