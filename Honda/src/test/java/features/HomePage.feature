Feature: Honda HomePage Functionalities

  Background:
    Given I am on Honda homepage

  @smokeTest
  Scenario Outline: User should be able to enter text into search field using table
    When I click on search button
    And I enter "<searchText>" in search field
    And I should see "<expectedValue>" as value written in search field
    But I should not see "<notExpectedValue>" as value written in search field
    Then I verify "<expectedTitle>" as page title

    Examples:
      | searchText  | expectedValue | notExpectedValue | expectedTitle                                  |
      | Engine      | Engine        | Bootcamp404      | American Honda Motor Co., Inc. - Official Site |
      | Seats       | Seats         | Bootcamp404      | American Honda Motor Co., Inc. - Official Site |
      | Leather     | Leather       | Bootcamp404      | American Honda Motor Co., Inc. - Official Site |
      | Sports      | Sports        | Bootcamp404      | American Honda Motor Co., Inc. - Official Site |
      | Bootcamp404 | Bootcamp404   | Bootcamp403      | American Honda Motor Co., Inc. - Official Site |

  @smokeTest
  Scenario: User should be able enter text into search field using table with header
    When I click on search button
    And I enter key into search field
      | keyword     |
      | Bootcamp404 |
    And I should see "Bootcamp404" written in search field
    But I should not see "Books" written in search field
    Then I verify "American Honda Motor Co., Inc. - Official Site" as page title

  @smokeTest
  Scenario: User should be able to view Important covid info then switch tab to home page
    When I click on read more button
    And I scroll to read important covid information
    And I switch back to honda home page tab
    And I should see is "https://www.honda.com/" homepage url
    But I should not see "https://hangouts.google.com/" as homepage url
    Then I verify "American Honda Motor Co., Inc. - Official Site" as page title















