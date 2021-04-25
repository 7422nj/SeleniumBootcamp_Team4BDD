package stepDefinitions;

import Toys.ToysPage;
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
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ToysPageStepDefinition extends WebAPI {
    static ToysPage Toys = new ToysPage();

    // Cucumber Hook


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on ebay ToysPage")
    public void iAmOnEbay_ToysPage() throws IOException {
        // Call Action method
        openBrowser("https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497");

    }

    @When("User click on search field")
    public void userClickOnSearchField() {
        Toys.selectSearchField();
    }

    @And("User enters {string} in search field")
    public void userEntersInSearchField(String Keys) {
        Toys.sendKeysToSearchFieldUsingTable(Keys);
    }

    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String Keys) {
        Toys.verifySearchFieldValue(Keys);
    }

    @Then("User should see {string} as current Url")
    public void userShouldSeeAsCurrentUrl(String Keys) {
        Toys.verifyPageUrl(Keys);
    }
}


