package stepDefinitions;

import common.WebAPI;
import homepage.HondaPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.*;


import java.io.IOException;
import java.util.List;

public class HomePageStepDefinition  extends WebAPI {

    ///////////////////////////////////////
    static HondaPage home = new HondaPage();
    ///////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("I am on Honda homepage")
    public void iAmOnHondaHomepage() throws IOException { openBrowser("https://www.honda.com/"); }
    @After
    public void closeBrowser(){
        cleanUp();
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Scenario #1
     */

    @When("I click on search button")
    public void iClickOnSearchButton() {
        home.selectSearchBarButton();
    }

    @And("I click on search field")
    public void iClickOnSearchField() {
        home.selectSearchField();
    }

    @And("I enter {string} in search field")
    public void iEnterInSearchField(String searchText) {
        home.sendKeysToSearchFieldUsingTable(searchText);
    }

    @And("I should see {string} as value written in search field")
    public void iShouldSeeAsValueWrittenInSearchField(String expectedValue) {
        home.verifyAttributeValueOfSearchField(expectedValue);
    }

    @Then("I verify {string} as page title")
    public void iVerifyAsPageTitle(String expectedTitle) {
        home.verifyPageTitle(expectedTitle);
    }

    @But("I should not see {string} as value written in search field")
    public void iShouldNotSeeAsValueWrittenInSearchField(String notExpectedValue) {
        home.verifyNotExpectedValueAttribute(notExpectedValue);
    }

    /**
     * Scenario #2
     * @param dataTable
     */

    @And("I enter key into search field")
    public void iEnterKeyIntoSearchField(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String keyword = data.get(1).get(0);
        home.sendKeysToSearchFieldUsingTableWHeader(keyword);
    }

    @And("I should see {string} written in search field")
    public void iShouldSeeWrittenInSearchField(String expectedValue) {
        home.verifyAttributeValueFromTableWHeader(expectedValue);
    }

    @But("I should not see {string} written in search field")
    public void iShouldNotSeeWrittenInSearchField(String expectedValue) {
        home.verifyNotAttributeValueFromTableWHeader(expectedValue);
    }

    /**
     * Scenario #3
     * @param dataTable
     */
    @And("I enter key into search field without header")
    public void iEnterKeyIntoSearchFieldWithoutHeader(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String keyword = data.get(0).get(0);
        home.sendKeysToSearchFieldUsingTableWHeader(keyword);
    }

    /**
     * Scenario #4
     */

    @When("I click on read more button")
    public void iClickOnReadMoreButton() {
        home.selectButtonMoreInfo();
    }

    @And("I scroll to read important covid information")
    public void iScrollToReadImportantCovidInformation() throws InterruptedException {
        home.scrollToElementCovidInfo();
    }

    @And("I switch back to honda home page tab")
    public void iSwitchBackToHondaHomePageTab() {
        home.switchTabsFromCovidInfoToHomeTab();
    }

    @And("I should see is {string} homepage url")
    public void iShouldSeeIsHomepageUrl(String expectedUrl) {
        home.verifyUrlIsCorrectHondaMain(expectedUrl);
    }

    @But("I should not see {string} as homepage url")
    public void iShouldNotSeeAsHomepageUrl(String notExpectedUrl) {
        home.verifyUrlIsNotCorrectHondaMain(notExpectedUrl);
    }

    /**
     * Scenario #5
     */

    @When("I click on menu button")
    public void iClickOnMenuButton() {
        home.selectMenuButton();
    }

    @And("I select {string} from the menu")
    public void iSelectFromTheMenu(String keys) throws InterruptedException {
        home.selectOptionsFromMenuUsingTable(keys);
    }

    @And("I should see {string} as current url")
    public void iShouldSeeAsCurrentUrl(String keys) {
        home.verifyCurrentUrlIsCorrectMenu(keys);
    }

    @But("I should not see {string} as current url")
    public void iShouldNotSeeAsCurrentUrl(String keys) {
        home.verifyNotCurrentUrlMenu(keys);
    }

    @Then("I should see {string} for current page url")
    public void iShouldSeeForCurrentPageTitle(String keys) {
        home.verifyCurrentUrlIsCorrect(keys);
    }

    @And("I scroll down page to view details")
    public void iScrollDownPageToViewDetails() throws InterruptedException {
        home.scrollToPosition();
    }

    @And("I switch tab back to Honda homepage")
    public void iSwitchTabBackToHondaHomepage() {
        home.switchTabToMainHondaPage();
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////




}
