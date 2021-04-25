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

  @pizza
  Scenario: Search invalid item name
    When I click on search field
    And I enter invalid keys
    And I should see "Bootcamp404" written in search field
    And I click search button
    Then I should see "No Results Found" as no results found header

  @burger
  Scenario Outline: User should be able to search multiple items regarding issues
    When I click on search field
    And I enter "<searchKeys>" into search field
    And I should see "<expectedValue>" as written in search field
    But I should not see "<notExpectedValue>" written in search field
    Then I should see "<expectedTitle>" as page title

    Examples:
      | searchKeys | expectedValue | notExpectedValue | expectedTitle                |
      | return     | return        | Bootcamp404      | Macy's Customer Service Site |
      | price      | price         | Bootcamp404      | Macy's Customer Service Site |
      | liability  | liability     | Bootcamp404      | Macy's Customer Service Site |
      | assurance  | assurance     | Bootcamp404      | Macy's Customer Service Site |
      | facilties  | facilities    | Bootcamp404      | Macy's Customer Service Site |

  Scenario: User should be able to track their order
  When I scroll to Shipping & Delivery
  And I hover over shipping & delivery
  And I click on track my order
  And I enter item id code & email address
  And I click on view order details button
  Then I should see "We’re sorry. We’re currently unable to retrieve your order info. Please try again later, or call us at 1-800-289-6229." as error message header




