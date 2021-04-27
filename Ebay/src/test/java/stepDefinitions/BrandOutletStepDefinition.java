package stepDefinitions;

import BrandOutletPage.BrandOutletPage;
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

import javax.swing.plaf.basic.BasicRadioButtonUI;
import java.io.IOException;

public class BrandOutletStepDefinition extends WebAPI {
    static BrandOutletPage Brand = new BrandOutletPage();


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on ebay Brand Outlet")
    public void iAmOnT_mobileHomePage() throws IOException {
        // Call Action method
        openBrowser("https://www.ebay.com/b/Brand-Outlet/bn_7115532402");

    }
    @When("User enters {string} in search field")
    public void userEntersInSearchField(String keys) throws Exception {
        Brand.searchitemsusingtables(keys);
    }


    @And("user should see {string} written in search field")
    public void userShouldSeeWrittenInSearchField(String keys) {
        Brand.verifyAttributeValueFromSearchField(keys);
    }

    @Then("User should see {string} as current URL")
    public void userShouldSeeAsCurrentURL(String keys) {
        Brand.verifyPageURL(keys);
    }

    @When("I click the Brand Outlet link")
    public void iClickTheBrandOutletLink() {
        Brand.clickBrandOutlet();
    }

    @And("I click {string} in Brand Outlet page")
    public void iClickInBrandOutletPage(String searchLinks) {
        Brand.clickPageLinks(searchLinks);
    }

    @Then("verify {string} in each page")
    public void verifyInEachPage(String expectedURL) {
        Brand.verifyExpectedURL(expectedURL);
    }


}
