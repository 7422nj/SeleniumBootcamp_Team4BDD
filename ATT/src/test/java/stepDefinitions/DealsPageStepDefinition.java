package stepDefinitions;

import Deals.DealsPage;
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

public class DealsPageStepDefinition extends WebAPI {

    static DealsPage Deals = new DealsPage();

    @After
    public void closeBrowser() {
        cleanUp();
    }






        @Given("I am on ATT DealsPage")
    public void iAmOnATT_Deals() throws IOException {
            // Call Action method
            openBrowser("https://www.att.com/deals/");

    }


    @When("User click on search field")
    public void userClickOnSearchField() { Deals.selectSearchField();}


    @And("User enters {string} in search field")
    public void userEntersInSearchField(String Keys) {
        Deals.sendKeysToSearchFieldUsingTable(Keys);
    }

    @And("User should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String Keys) {

        Deals.verifySearchFieldValue(Keys);
    }

    @Then("User should see {string} as current Url")
    public void userShouldSeeAsCurrentUrl(String Keys) {

        Deals.verifyPageUrl(Keys);
    }


}
