Feature: ATT Support Main Page

  @burger
  Scenario: Find Bill & Account page
    Given I am on ATT Support Main Page
    When I scroll down to bills
    And I click on Bills & Accounts
    And I should see "Bill & account support" as bills header
    But I should not see "Welcome to McDonalds" as bills header
    Then I should see "Bill & account Support & Customer Service - AT&T Official Site" as page title

  @burger
  Scenario: Find Wireless Support Page
    Given I am on ATT Support Main Page
    When I scroll down to wireless
    And I click on Wireless
    And I should see "Wireless support" as wireless header
    But I should not see "Bootcamp404" as wireless header
    Then I should see "Wireless Support & Customer Service - AT&T Official Site" as page title















