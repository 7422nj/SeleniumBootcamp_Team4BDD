Feature: Macys Sign In/Sign Up Functionalities

  #Background: common steps by sync way will work with your scenario

  Background:
    Given I am on Macys Help & Faqs Page

  @smokeTest
  Scenario: Locate Sign In and Sign Up Page
    When I hover over sign in drop down
    And I click on drop down option Sign In
    And I should see "No account yet?" as sign up header
    And I should see "Returning customer" as sign in header
    Then I verify "Sign In - Macy's" as macys sign up and sign in page title




#    And I click on create an account button










