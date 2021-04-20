Feature: Electronics Page Search Box Functionalities

  #Background: common steps by sync way will work with your scenario
  Background:
    Given I am on ebay electronic page

  @burger
  Scenario: Search box is displayed
    When I hover over search field
    And I click on click on Search field
    Then I verify "true" search box is displayed

  @burger
  Scenario: Search box is enabled
    When I hover over search field
    And I click on click on Search field
    Then I verify "true" search box is enabled

  @burger
  Scenario: Search box is not selected
    When I hover over search field
    And I click on click on Search field
    Then I verify "false" search box is not selected

  @burger
  Scenario: Type macbook into search field
    When I hover over search field
    And I click on click on Search field
    And I enter Macbook into Search field
    Then I should see "Macbook" is written

  @burger
  Scenario: Type and search Macbook in search field
    When I hover over search field
    And I click on click on Search field
    And I enter Macbook into Search field
    And I should see "Macbook" is written
    And I click on Search button
    Then I should see "Macbook" as result header

  @pizza
  Scenario: Search laptop using MYSQLDB
    When I hover over search field
    And I click on click on Search field
    And I enter Laptop into search box
    And I should see "Laptop" is written
    Then I verify "Laptop | eBay" as page title

  @pizza
  Scenario: Search laptop using MYSQLDB then clear search
    When I hover over search field
    And I click on click on Search field
    And I enter Laptop into search box
    And I should see "Laptop" is written
    And I clear text in search field
    Then I should see "" is written

  @pizza
  Scenario: Enter macbook then select option in dropdown then search
    When I click on dropdown All Categories
    And I click on computers and tablets
    And I click on click on Search field
    And I enter Macbook into Search field
    And I should see "Macbook" is written
    And I click on Search button
    Then I should see "Macbook" as result header










