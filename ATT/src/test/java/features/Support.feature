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

  @burger
  Scenario: Find Fixed Wireless Internet Support Page
    Given I am on ATT Support Main Page
    When I scroll to fixed internet
    And I click on fixed Internet
    And I should see "Fixed Wireless Internet support" as internet header
    But I should not see "Bootcamp404" as internet header
    Then I should see "Fixed Wireless Internet Support & Customer Service - AT&T Official Site" as page title

  @burger
  Scenario: Find Digital Phone Support Page
    Given I am on ATT Support Main Page
    When I scroll to digital phone
    And I click on digital phone
    And I should see "Digital Phone support" as digital phone header
    But I should not see "Bootcamp404" as digital phone header
    Then I should see "Digital Phone Support & Customer Service - AT&T Official Site" as page title

  @burger
  Scenario: Find AT&T Email Support Page
    Given I am on ATT Support Main Page
    When I scroll to AT&T email
    And I click on AT&T email
    And I should see "AT&T Mail support" as AT&T email header
    But I should not see "Bootcamp404" as AT&T email header
    Then I should see "AT&T Mail Support & Customer Service - AT&T Official Site" as page title

  @burger
  Scenario: Navigate back to Main Support Page
    Given I am on ATT Support Main Page
    When I scroll to AT&T email
    And I click on AT&T email
    And I should see "AT&T Mail support" as AT&T email header
    But I should not see "Bootcamp404" as AT&T email header
    And I should see "AT&T Mail Support & Customer Service - AT&T Official Site" as page title
    And I navigate back to main support page
    And I should see "Welcome to AT&T Support" as support page header
    But I should not see "Bootcamp" as support page header
    Then I should see "AT&T Customer Service & Support - AT&T Official Site" as page title








