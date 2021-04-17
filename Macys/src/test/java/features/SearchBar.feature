Feature: Macys Search Bar Functionalities

#  Background: common steps by sync way will work with your Scenario
  Background:
    Given I am on Macys Help & Faqs Main Page

      @burger
  Scenario: Enter keys into search bar
    When I click on search field
    And I enter keys into field
    And I should see "return" written in search field
    Then I verify "Macy's Customer Service Site" as page title

      @burger
  Scenario: Find results for keys entered in search bar
    When I click on search field
    And I enter keys into field
    And I should see "return" written in search field
    And I verify "Macy's Customer Service Site" as page title
    And I click search button
    Then I should see "Start A Return" button for a item return

      @burger
  Scenario: Search invalid item name
    When I click on search field
    And I enter invalid keys
    And I should see "Bootcamp404" written in search field
    And I click search button
    Then I should see "No Results Found" as no results found header








