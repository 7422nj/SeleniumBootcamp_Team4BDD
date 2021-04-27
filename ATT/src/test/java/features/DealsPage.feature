Feature: Deals Page Functionality

  Background:
    Given I am on ATT DealsPage

  @smokeTest
  Scenario Outline: User should be search multiple items
    When  User click on search field
    And  User enters "<searchKeys>" in search field
    And User should see "<expectedValue>" written in search field
    Then User should see "<pageUrl>" as current Url







    Examples:
      | searchKeys | expectedValue | pageUrl                                                                       |
      | Samsung    | Samsung       | https://www.att.com/search/?q=samsung&autoSuggest=true&linkCnt=1&linkSelPos=1 |
      | iphone     | Iphone        | https://www.att.com/search/?q=Iphone&linkCnt=10&linkSelPos=NaN                |
      | Internet   | Internet      | https://www.att.com/search/?q=Internet&linkCnt=10&linkSelPos=NaN              |
      | Television | Television    | https://www.att.com/search/?q=Television&linkCnt=10&linkSelPos=NaN            |
      | Wifi       | Wifi          | https://www.att.com/search/?q=Wifi&linkCnt=5&linkSelPos=NaN                   |
      | Watch      | Watch         | https://www.att.com/search/?q=Watch&linkCnt=9&linkSelPos=NaN                  |















