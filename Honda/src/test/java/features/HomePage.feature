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
  Scenario: User should be able enter text into search field using table without header
    When I click on search button
    And I enter key into search field without header
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

  Scenario Outline: Select multiple options from menu using table
    When I click on menu button
    And I select "<menuOptions>" from the menu
    And I scroll down page to view details
    And I switch tab back to Honda homepage
    And I should see "<expectedUrl>" as current url
    But I should not see "<notExpectedUrl>" as current url
    Then I should see "<pageTitle>" for current page url

    Examples:
      | menuOptions           | expectedUrl             | notExpectedUrl      | pageTitle                                      |
      | Honda Autos           | https://www.honda.com/# | https://google.com/ | American Honda Motor Co., Inc. - Official Site |
      | Acura Autos           | https://www.honda.com/# | https://google.com/ | American Honda Motor Co., Inc. - Official Site |
      | Honda Powersports     | https://www.honda.com/# | https://google.com/ | American Honda Motor Co., Inc. - Official Site |
      | Honda Power Equipment | https://www.honda.com/# | https://google.com/ | American Honda Motor Co., Inc. - Official Site |
      | Honda Engines         | https://www.honda.com/# | https://google.com/ | American Honda Motor Co., Inc. - Official Site |














