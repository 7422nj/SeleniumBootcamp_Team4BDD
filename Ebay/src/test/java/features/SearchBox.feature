Feature: Electronics Page Search Box

  #Background: common steps by sync way will work with your scenario
  Background:
    Given I am on ebay electronics page

  @burger
  Scenario: Type macbook into search field
    When I hover over search field
    And I click on click on Search field
    And I enter Macbook into Search field
    Then I should see "Macbook" is written

  @pizza
  Scenario: Type and search Macbook in search field
    When I hover over search field
    And I click on click on Search field
    And I enter Macbook into Search field
    And I should see "Macbook" is written
    And I click on Search button
    Then I should see "Macbook" as result header








