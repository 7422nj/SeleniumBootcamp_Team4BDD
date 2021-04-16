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

    @When("I hover over search field")
    public void iHoverOverSearchField() {
        Electron.hoverOverSearchField();
    }
    @And("I click on click on Search field")
    public void iClickOnClickOnSearchField() {
        Electron.selectSearchField();
    }
    @And("I enter Macbook into Search field")
    public void iEnterMacbookIntoSearchField() {Electron.sendKeysToSearch(); }
    @Then("I should see {string} is written")
    public void iShouldSeeIsWritten(String expectedText) throws InterruptedException { Electron.verifyMacbookValueAttribute(expectedText); }

    /**
     * Scenario #2
     */

    @And("I click on Search button")
    public void iClickOnSearchButton() { Electron.selectSearchButton(); }

}
