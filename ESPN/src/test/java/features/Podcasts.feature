Feature: ESPN Podcast

#  Background: common steps by sync way will work with your Scenario
  Background:
    Given I am ESPN Podcasts Page

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







