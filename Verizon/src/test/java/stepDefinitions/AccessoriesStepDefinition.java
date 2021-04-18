package stepDefinitions;

import AccessoriesPage.AccessoriesPage;
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

import java.awt.*;
import java.io.IOException;

public class AccessoriesStepDefinition extends WebAPI {

    ////////////////////////////////////////////////////////
    public static AccessoriesPage ac = new AccessoriesPage();
    ///////////////////////////////////////////////////////

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","TMobile");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        ac= PageFactory.initElements(driver,AccessoriesPage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on Verizon Accessories Page")
    public void iAmOnVerizonAccessoriesPage() throws IOException {
        // Call Action method
        openBrowser("https://www.verizon.com/featured/accessories/#collections");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */
    @When("I scroll down to see what is trending header")
    public void iScrollDownToSeeWhatIsTrendingHeader() {
        ac.scrollToWhatsTrending();
    }


    @And("I should see {string} as header")
    public void iShouldSeeAsHeader(String expected) {
        ac.verifyTrendingHeader(expected);
    }

    @And("I should not see {string} as header")
    public void iShouldNotSeeAsHeader(String expected) {
        ac.verifyShouldNotSeeTrending(expected);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #2
     */

    @And("I click on Airpods")
    public void iClickOnAirpods() {
        ac.selectAirPodsLink();
    }

    @And("I should {string} as device item name")
    public void iShouldAsDeviceItemName(String expected) {
        ac.verifyAirPodsHeader(expected);
    }

    @Then("I should see {string} as item's total price")
    public void iShouldAsItemSTotalPrice(String expected) {
        ac.verifyPriceAirPods(expected);
    }

    @When("I scroll down to bottom of page")
    public void iScrollDownToBottomOfPage() {
        ac.scrollToBottomOfAccessoriesPage();
    }

    @And("I scroll up to top of page")
    public void iScrollUpToTopOfPage() {
        ac.scrollToTopOfAccessoriesPage();
    }

    @And("I refresh page")
    public void iRefreshPage() throws AWTException, InterruptedException {
        ac.refreshAccessoriesPage();
    }

    @And("I should see {string} as Accessories Main Title")
    public void iShouldSeeAsAccessoriesMainTitle(String expected) {
        ac.verifyAccessoriesHeader(expected);
    }
}
