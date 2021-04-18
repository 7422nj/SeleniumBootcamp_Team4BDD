package stepDefinitions;

import AccessoriesPage.AccessoriesPage;
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

public class DealsStepDefinition extends WebAPI {

    ////////////////////////////////////////////////////////////////////////////////////////////
    public static AccessoriesPage ac = new AccessoriesPage();
    ////////////////////////////////////////////////////////////////////////////////////////////

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Verizon");  // embed it in the report
        }
    }

    @Given("I am on Verizon Accessories page")
    public void iamonVerizonAccessoriesPage() throws IOException {
        openBrowser("https://www.verizon.com/featured/accessories/");
    }

    @After
    public void closeBrowser() { cleanUp(); }

    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     * @throws InterruptedException
     */

    @When("I scroll to deals link")
    public void iScrollToDealsLink() throws InterruptedException {
        ac.scrollToDealsLink();
    }

    @And("I click on deals link")
    public void iClickOnDealsLink() {
        ac.implicitWaitForDeals();
    }

    @And("I click on add filters")
    public void iClickOnAddFilters() {
        ac.selectAddFilters();
    }

    @And("I click on Colors drop down")
    public void iClickOnColorsDropDown() {
        ac.selectDropDownColors();
    }

    @And("I check off the black color checkbox")
    public void iCheckOffTheBlackColorCheckbox() {
        ac.selectBlackCheckBox();
    }

    @Then("I should see {string} as selected color filter")
    public void iShouldSeeAsSelectedColorFilter(String expected) throws InterruptedException {
        ac.verifyBlackFilter(expected);
    }

    @Then("I should see {string} as page title")
    public void iShouldSeeAsPageTitle(String expected) throws InterruptedException {
        ac.verifyPageTitle(expected);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #2
     */

    @And("I click on sort filter drop down")
    public void iClickOnSortFilterDropDown() {
        ac.selectDropDownSort();
    }

    @And("I select price low to high")
    public void iSelectPriceLowToHigh() {
        ac.selectLowToHighPrice();
    }

    @And("I should {string} is selected from drop down")
    public void iShouldIsSelectedFromDropDown(String expected) throws InterruptedException {
        ac.verifyPriceLowToHigh(expected);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #3
     */

    @And("I click on compatible phone search field")
    public void iClickOnCompatiblePhoneSearchField() {
        ac.selectFieldCompatible();
    }

    @And("I enter iPhone in field")
    public void iEnterIPhoneInField() throws Exception {
        ac.sendKeysIphoneToField();
    }

    @And("I should see {string} written in text field")
    public void iShouldSeeWrittenInTextField(String expected) throws InterruptedException {
        ac.verifyIphoneInField(expected);
    }

    @And("I select iPhone twelve from drop down")
    public void iSelectIPhoneFromDropDown() throws InterruptedException {
        ac.selectIphone12DropDown();
    }

    @And("I should see {string} as iPhone twelve compatible items")
    public void iShouldSeeAsIPhoneTwelveCompatibleItems(String expected) throws InterruptedException {
        ac.verifyIphone12CompatibleHeader(expected);
    }

    /**
     * Scenario 4
     */

    @When("I scroll down to Samsung Case")
    public void iScrollDownToSamsungCase() {
        ac.scrollToSamsungCase();
    }

    @And("I click on Samsung phone case")
    public void iClickOnSamsungPhoneCase() {
        ac.selectSamsungCase();
    }

    @And("I scroll down page")
    public void iScrollDownPage() {
        ac.scrollDownSamsungCasePage();
    }

    @And("I click on checkout button")
    public void iClickOnCheckoutButton() {
        ac.selectCheckOutButton();
    }

    @Then("I should see {string} as added to shopping cart header")
    public void iShouldSeeAsAddedToShoppingCartHeader(String expected) {
        ac.verifyShoppingCartHeader(expected);
    }

    /**
     * Scenario #5
     */

    @And("I navigate back to Accessories page")
    public void iNavigateBackToAccessoriesPage() {
        ac.navigateToAccessoriesPage();
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////



    /////////////////////////////////////////////////////////////////////////////////////////


}
