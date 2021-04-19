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

  @burger
  Scenario: Find a wireless charger in a reasonable price
    When I scroll up to top of page
    And I scroll to chargers link
    And I should see "Batteries & chargers" as header for chargers link
    And I click on chargers link
    And I scroll down to charger
    And I click on charger
    And I should see "mophie wireless charging pad - 15W" as item header
    Then I should see "$49.99" is a reasonable price

  @burger
  Scenario: Find a Apple mini speaker
    When I scroll up to top of page
    And I scroll to speakers link
    And I click on speakers link
    And I click on apple mini speaker
    And I should see "Apple HomePod mini" as apple item header
    But I should not see "Samsung" as apple item header
    Then I should see "Apple HomePod mini: Shop Now | Verizon" as page title

  @burger
  Scenario: Find gaming headphone
    When I scroll up to top of page
    And I scroll to gaming link
    And I click on gaming link
    And I click on gaming headphone
    And I should see "DTS Headphone:X 2.0 surround sound¹" as item title
    But I should not see "BTS Headphone" as item title
    Then I should see "Logitech G432, Wired Gaming Headset with Surround Sound | Verizon" as page title

  @burger
  Scenario: Find gaming keyboard
    When I scroll up to top of page
    And I scroll to gaming link
    And I click on gaming link
    And I click on gaming keyboard
    And I should see "Logitech G213 Prodigy Gaming Keyboard" as keyboard header
    And I should not see "Lazy Boy Keyboard" as keyboard header
    Then I should see "Logitech G213 Prodigy, Next Level Gaming Keyboard | Verizon" as page title
