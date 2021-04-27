Feature: Toys Page Functionality

  Background:
    Given I am on ebay ToysPage

  @smokeTest
  Scenario Outline: User should be search multiple items
    When  User click on search field
    And  User enters "<searchKeys>" in search field
    And  User should see "<expectedValue>" written in search field
    Then User should see "<pageUrl>" as current Url




    Examples:
      | searchKeys  | expectedValue | pageUrl                                                                                  |
      | plane       | plane         | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=plane&_sacat=220       |
      | cars        | cars          | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=cars&_sacat=220        |
      | bottles     | bottles       | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=bottles&_sacat=220     |
      | animals     | animals       | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=animals&_sacat=220     |
      | water toys  | water toys    | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=water+toys&_sacat=220  |
      | video games | video games   | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=video+games&_sacat=220 |




















