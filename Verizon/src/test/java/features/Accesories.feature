Feature: Verizon Accessories Main Page

  #Background: common steps by sync way will work with your scenario
  Background:
    Given I am on Verizon Accessories Page

  @smokeTest
  Scenario: See what is trending
    When I scroll down to see what is trending header
    And I should see "See what's trending." as header
    And I should not see "see what's not trending" as header
    Then I should see "Accessories for Audio, Streaming, Cases & More - Verizon" as page title

    @pending
  Scenario: Select an item that is trending and view item price
    When I scroll down to see what is trending header
    And I should see "See what's trending." as header
    And I should not see "see what's not trending" as header
    And I click on Airpods
    And I should "Apple AirPods Pro" as device item name
    Then I should see "$219.99" as item's total price

   @pending
  Scenario: View all of Accessories Page
    When I scroll down to bottom of page
    And I scroll up to top of page
    And I refresh page
    And I should see "Accessories" as Accessories Main Title
    Then I should see "Accessories for Audio, Streaming, Cases & More - Verizon" as page title






