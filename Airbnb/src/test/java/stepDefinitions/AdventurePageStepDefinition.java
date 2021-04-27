package stepDefinitions;

import Adventure.AdventurePage;
import common.WebAPI;
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

public class AdventurePageStepDefinition extends WebAPI {
   static AdventurePage Adventure= new AdventurePage();


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on Airbnb Adventure")
    public void iAmOnAirbnb_AdventurePage() throws IOException {
        // Call Action method
        openBrowser("https://www.airbnb.com/s/adventures");

    }


    @When("User click on search field")
    public void userClickOnSearchField() { Adventure.selectSearchField();}


    @And("User enters {string} in search field")
    public void userEntersInSearchField(String Keys) {
        Adventure.sendKeysToSearchFieldUsingTable(Keys);
    }


    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String Keys) {
        Adventure.verifySearchFieldValue(Keys);
    }


    @And("user enters {string} in search date")
    public void userEntersInSearchDate(String Keys) {
        Adventure.verifySearchDateValue(Keys);
    }

    @Then("User should see {string} as current Url")
    public void userShouldSeeAsCurrentUrl(String Keys) {
        Adventure.verifyPageUrl(Keys);
    }
}

