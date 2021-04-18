Feature: Verizon Accessories Deals

  Background:
    Given I am on Verizon Accessories page

  @pending
  Scenario: Filter to find a black colored accessory
    When I scroll to deals link
    And I click on deals link
    And I click on add filters
    And I click on Colors drop down
    And I check off the black color checkbox
    And I should see "Black" as selected color filter
    Then I should see "Sale Phone Accessories | Verizon" as page title


  @pending
  Scenario: Filter sorting deals from lowest to highest pricing
    When I scroll to deals link
    And I click on deals link
    And I click on sort filter drop down
    And I select price low to high
    And I should "Price Low-High" is selected from drop down
    Then I should see "Sale Phone Accessories | Verizon" as page title

  @smokeTest
  Scenario: Find items compatible to iPhone 12
    When I scroll to deals link
    And I click on deals link
    And I click on compatible phone search field
    And I enter iPhone in field
    And I should see "iPhone" written in text field
    And I select iPhone twelve from drop down
    And I should see "iPhone 12" as iPhone twelve compatible items
    Then I should see "Sale Phone Accessories | Verizon" as page title


















