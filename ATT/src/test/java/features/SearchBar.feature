Feature: ATT Support Page Search Bar Functionalities

#  Background: common steps by sync way will work with your Scenario
  Background:
    Given I am on ATT Support page
    When I click on search field

  @burger
  Scenario: Send keys to search bar
    And I should see "" written in field
    And I type bill support in search field
    Then I should see "bill support" written in field

  @burger
  Scenario: Find results after sending keys to search field
    And I should see "" written in field
    And I type bill support in search field
    And I should see "bill support" written in field
    Then I should see "bill support in all search results" as a result in drop down

  @burger
  Scenario: Send keys and click search button
    And I should see "" written in field
    And I type bill support in search field
    And I should see "bill support" written in field
    And I should see "bill support in all search results" as a result in drop down
    And I hover over bill support in all search results link
    And I click on bill support in all search results link
    Then I should see "Results for bill support - AT&T Search" as page title











