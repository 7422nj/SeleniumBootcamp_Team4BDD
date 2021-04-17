Feature: ATT Sign In Functionalities

  #Background: common steps by sync way will work with your scenario
  Background:
    Given I am on ATT Support Page

  @burger
  Scenario: Locate sign in page
    When I hover over sign in
    And I click on sign in link
    And I should see "Sign in" as sign in page header
    Then I should see "Login Screen" as page title

  @burger
  Scenario: Sign in with Invalid credentials using MYSQLDB
    When I click on sign in link
    And I enter user id
    And I enter password
    And I click on submit sign in button
    Then I should see "Something's gone wrong" as error code

  @burger
  Scenario: Sign in with user id and no password
    When I click on sign in link
    And I enter user id
    And I click on submit sign in button
    Then I should see "This information is required. If you don't remember your password, use Forgot password link." as password error code

  @pizza
  Scenario: Sign in with password and no user id
    When I click on sign in link
    And I enter password
    And I click on submit sign in button
    Then I should see "This information is required. If you don't remember your user ID, use Forgot user ID link." as user id error code






