Feature: Ebay Electronics Main Page

  Background:
    Given I am on ebay electronics page

  @smokeTest
  Scenario: Find a pair of wireless headphone
    When I scroll to portable audio & headphones
    And I click on portable audio & headphones
    And I scroll down page to find available headphones
    And I click on sony headphones
    And I should see "Sony WH-1000XM4 Over the Ear Noise Cancelling Wireless Headphones - Black" as header
    But I should not see "Bootcamp404" as header
    Then I should see "Sony WH-1000XM4 Over the Ear Noise Cancelling Wireless Headphones - Black for sale online | eBay" as page title

  @burger
  Scenario: Find 3 in 1 Acer Laptop
    When I scroll to Computers, Components & Accessories
    And I click on Computers, Components & Accessories
    And I scroll down to Acer Laptop
    And I click on Acer Laptop
    And I should see "Acer" as laptop header
    But I should not see "Bootcamp404" as laptop header
    Then I should see "https://www.ebay.com/itm/Acer-Spin-3-14-Laptop-Intel-Core-i5-1035G1-1GHz-8GB-Ram-256GB-SSD-Win-10-Home/274491264325?_trkparms=%26rpp_cid%3D5e1e4765d7d8a01af5b76e70%26rpp_icid%3D5e1e4765d7d8a01af5b76e6f" as current page url

  @burger
  Scenario: Find a Apple Watch Gen 3
    When I scroll to Apple
    And I click on Apple
    And I scroll to Apple Watch
    And I click on Apple Watch
    And I should see "Apple Watch Series 3 38 mm Gray Case Black Aluminium Smartwatch - MTF02LLA" as apple watch header
    But I should not see "Bootcamp404" as apple watch header
    Then I should see "Apple Watch Series 3 38 mm Gray Case Black Aluminium Smartwatch - MTF02LLA for sale online | eBay" as page title

  @burger
  Scenario: Find a Amazon Echo 3rd Gen
    When I scroll to Smart Home & Surveillance
    And I click on Smart Home & Surveillance
    And I scroll to Amazon Echo Dot
    And I click on Amazon Echo Dot
    And I should see "Amazon Echo Dot (3rd Generation) Smart Speaker - Charcoal" as Echo Dot header
    But I should not see "Bootcamp404" as Echo Dot header
    Then I should see "Amazon Echo Dot (3rd Generation) Smart Speaker - Charcoal for sale online | eBay" as page title













