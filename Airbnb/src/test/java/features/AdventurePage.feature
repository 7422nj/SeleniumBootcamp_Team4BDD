Feature: Adventure page functionality

  Background:
    Given I am on Airbnb Adventure


  @smokeTest
  Scenario Outline: User should be search multiple items
    When  User click on search field
    And  User enters "<searchKeys>" in search field
    And  User should see "<expectedValue>" written in search field
    And  user enters "<date>" in search date
    And  User should see "<expectedValue>" written in search field
    Then User should see "<pageUrl>" as current Url



    Examples:
      | searchKeys | expectedValue | date   | pageUrl                                                                                                                                                                                                                                                                                                                                    |
      | Algeria    | Algeria       | May 20 | https://www.airbnb.com/s/Algeria/adventures?tab_id=adventure_tab&refinement_paths%5B%5D=%2Fadventures&flexible_trip_dates%5B%5D=june&flexible_trip_dates%5B%5D=may&flexible_trip_lengths%5B%5D=weekend_trip&date_picker_type=calendar&rank_mode=default&checkin=2021-05-20&source=structured_search_input_header&search_type=filter_change |
      | Usa        | Usa           | May1   |https://www.airbnb.com/s/Usa/adventures?tab_id=adventure_tab&refinement_paths%5B%5D=%2Fadventures&flexible_trip_dates%5B%5D=june&flexible_trip_dates%5B%5D=may&flexible_trip_lengths%5B%5D=weekend_trip&date_picker_type=calendar&rank_mode=default&checkin=2021-05-01&source=structured_search_input_header&search_type=filter_change|
      | France     | France        | June10 |https://www.airbnb.com/s/France/adventures?tab_id=adventure_tab&refinement_paths%5B%5D=%2Fadventures&flexible_trip_dates%5B%5D=june&flexible_trip_dates%5B%5D=may&flexible_trip_lengths%5B%5D=weekend_trip&date_picker_type=calendar&rank_mode=default&checkin=2021-06-10&source=structured_search_input_header&search_type=filter_change|
      | England    | England       | June15 |https://www.airbnb.com/s/England/adventures?tab_id=adventure_tab&refinement_paths%5B%5D=%2Fadventures&flexible_trip_dates%5B%5D=june&flexible_trip_dates%5B%5D=may&flexible_trip_lengths%5B%5D=weekend_trip&date_picker_type=calendar&rank_mode=default&checkin=2021-06-15&source=structured_search_input_header&search_type=filter_change|
      | Italy      | Italy         | June29 |https://www.airbnb.com/s/Italy/adventures?tab_id=adventure_tab&refinement_paths%5B%5D=%2Fadventures&flexible_trip_dates%5B%5D=june&flexible_trip_dates%5B%5D=may&flexible_trip_lengths%5B%5D=weekend_trip&date_picker_type=calendar&rank_mode=default&checkin=2021-06-29&source=structured_search_input_header&search_type=filter_change|
      | Japan      | Japan         | July5  |https://www.airbnb.com/s/Japan/adventures?tab_id=adventure_tab&refinement_paths%5B%5D=%2Fadventures&flexible_trip_dates%5B%5D=june&flexible_trip_dates%5B%5D=may&flexible_trip_lengths%5B%5D=weekend_trip&date_picker_type=calendar&rank_mode=default&checkin=2021-06-15&source=structured_search_input_header&search_type=filter_change|
















