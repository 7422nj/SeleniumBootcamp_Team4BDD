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
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class SearchBarStepDefinitions extends WebAPI {

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

    @Given("I am on Macys Help & Faqs Main Page")
    public void iamonMacysHelpFaqsMainPage() throws IOException { openBrowser("https://www.customerservice-macys.com/app?cm_sp=navigation-_-bottom_nav-_-help_%26_faqs&lid=glbbtmnav_help_%26_faqs-us");
    }

    @After
    public void closeBrowser() { cleanUp(); }

    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */

    @When("I click on search field")
    public void iClickOnSearchField() {
        help.selectSearchField();
    }

    @And("I enter keys into field")
    public void iEnterKeysIntoField() throws Exception {
        help.sendKeysToSearchField();
    }

    @And("I should see {string} written in search field")
    public void iShouldSeeWrittenInSearchField(String expected) throws InterruptedException {
        help.verifyTextInSearchField(expected);
    }

    @Then("I verify {string} as page title")
    public void iVerifyAsPageTitle(String expected) {
        help.verifyPageTitle(expected);
    }

    /**
     * Scenario #2
     */

    @And("I click search button")
    public void iClickSearchButton() {
        help.selectSearchButton();
    }

    @Then("I should see {string} button for a item return")
    public void iShouldSeeButtonForAItemReturn(String expected) throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath("//iframe[@title='Action Capture']"));
        iframeHandle(ele);
        help.verifyReturnResult(expected);
    }

    @And("I enter invalid keys")
    public void iEnterInvalidKeys() throws Exception {
        help.sendInvalidKeysToSearchField();
    }

    @Then("I should see {string} as no results found header")
    public void iShouldSeeAsNoResultsFoundHeader(String expected) {
        help.verifyNoResultsHeader(expected);
    }
}

