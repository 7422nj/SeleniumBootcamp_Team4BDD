Feature: ESPN Podcast

#  Background: common steps by sync way will work with your Scenario
  Background:
    Given I am on ESPN Podcasts Page

  @burger
  Scenario: Find Mel's Mock 4.0 & Todd's All-Satellite Team Podcast
    When I scroll to Mel & Todd All-Satellite Team
    And I click on Mel & Todd All-Satellite Team
    And I should see "Apr 13, 2021" as date of the podcast
    But I should not see "Bootcamp404" as date of the podcast
    Then I should see "First Draft - Mel's Mock 4.0 & Todd's All-Satellite Team | ESPN" as page title

  @burger
  Scenario: Find The ESPN Daily Podcast
    When I scroll to ESPN Daily Podcast
    And I click on ESPN Daily Podcast
    And I should see "ESPN Daily - The Next Great Quarterback Prospect (Is Someone You’ve Never Heard Of)" header of podcast
    But I should not see "Bootcamp404" header of podcast
    Then I should see "ESPN Daily - The Next Great Quarterback Prospect (Is Someone You’ve Never Heard Of) | ESPN" as page title

  @burger
  Scenario: Find 30 for 30 Podcast
    When I scroll to 30 for 30
    And I click on 30 for 30
    And I should see "30 For 30 Podcasts" as 30 for 30 header
    But I should not see "Bootcamp404" as 30 for 30 header
    Then I should see "30 For 30 Podcasts Show - PodCenter - ESPN Radio" as page title

  @burger
  Scenario: Find The Adam Schefter Podcast (NFL)
    When I scroll to The Adam Schefter Podcast (NFL)
    And I click on The Adam Schefter Podcast (NFL)
    And I should see "The Adam Schefter Podcast" as Adam Podcast Header
    But I should not see "Bootcamp" as Adam Podcast Header
    Then I should see "The Adam Schefter Podcast Show - PodCenter - ESPN Radio" as page title

  @burger
  Scenario: Find Around the Rim with LaChina Robinson (WBB)
    When I scroll to Around the Rim with LaChina Robinson (WBB)
    And I click on Around the Rim with LaChina Robinson (WBB)
    And I should see "Around The Rim" as LaChina Podcast Header
    But I should not see "Bootcamp404" as LaChina Podcast Header
    Then I should see "Around The Rim Show - PodCenter - ESPN Radio" as page title

  @burger
  Scenario: Find The Daily Wager Podcast Page
    When I scroll to The Daily Wager Podcast Page
    And I click on The Daily Wager Podcast Page Link
    And I should see "Daily Wager" as Daily Wager header
    But I should not see "Bootcamp404" as Daily Wager header
    Then I should see "Daily Wager Show - PodCenter - ESPN Radio" as page title

  @burger
  Scenario: Find The ESPN Investigates Podcast Page
    When I scroll to The ESPN Investigates Podcast Page
    And I click on The ESPN Investigates Podcast Page
    And I should see "ESPN Investigates" as Investigates header
    But I should not see "Bootcamp404" as Investigates header
    Then I should see "ESPN Investigates Show - PodCenter - ESPN Radio" as page title

  @burger
  Scenario: Download Getting The Team Back Podcast recent podcast
    When I scroll to Getting The Team Back Podcast
    And I hover over download link
    And I click on download link
    And I click on audio play button
    Then I should see audio box is "true" displayed

  @burger
  Scenario Outline: User should be able to enter words into search bar
    When I click on search button
    And I enter "<searchPodcasts>" into search field
    And I should see "<expectedValue>" written in search field
    But I should not see "<notExpectedValue>" written in search field
    Then I should see "<expectedTitle>" as page title


    Examples:
      | searchPodcasts    | expectedValue     | notExpectedValue | expectedTitle                                  |
      | Daily Wager       | Daily Wager       | Bootcamp404      | Sports Podcasts - Podcenter - ESPNRadio - ESPN |
      | ESPN Investigates | ESPN Investigates | Bootcamp404      | Sports Podcasts - Podcenter - ESPNRadio - ESPN |
      | 30 for 30         | 30 for 30         | Bootcamp404      | Sports Podcasts - Podcenter - ESPNRadio - ESPN |
      | SVPod             | SVPod             | Bootcamp404      | Sports Podcasts - Podcenter - ESPNRadio - ESPN |




