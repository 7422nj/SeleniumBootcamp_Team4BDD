package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.*;


import java.io.IOException;
import java.util.List;

public class HomePageStepDefinition  extends WebAPI {
    static HomePage home = new HomePage();

    @Given("I am on Honda homepage")
    public void iAmOnHondaHomepage() throws IOException {
        openBrowser("https://www.honda.com/");
    }
    @After
    public void closeBrowser(){
        cleanUp();
    }

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
///////////////////////////////////////////////////////////////////////////////////////////////////////




}
