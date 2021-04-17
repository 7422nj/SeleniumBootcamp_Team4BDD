Feature: Macys Sign In/Sign Up Functionalities

  #Background: common steps by sync way will work with your scenario

  Background:
    Given I am on Macys Help & Faqs Page

    #Scenario 1
  @smokeTest
  Scenario: Locate Sign In and Sign Up Page
    When I hover over sign in drop down
    And I click on drop down option Sign In
    And I should see "No account yet?" as sign up header
    And I should see "Returning customer" as sign in header
    Then I verify "Sign In - Macy's" as macys sign up and sign in page title

    #Scenario 2
  @burger
  Scenario: Sign in with valid email and password
    When I hover over sign in drop down
    And I click on drop down option Sign In
    And I should see "Returning customer" as sign in header
    And I enter my email address
    And I enter my password
    And I click sign in button
    Then I should see "Access Denied" as page header

 #Scenario 3
  @burger
  Scenario: Sign in with valid email and invalid password
    When I hover over sign in drop down
    And I click on drop down option Sign In
    And I should see "Returning customer" as sign in header
    And I enter my email address
    And i enter invalid password
    And I click sign in button
    Then I should see "Your email address or password is incorrect. Forgot your password?" as password error message

 #Scenario 4
  @burger
  Scenario: Sign in with invalid email and valid password
    When I hover over sign in drop down
    And I click on drop down option Sign In
    And I should see "Returning customer" as sign in header
    And I enter invalid email address
    And I enter my password
    And I click sign in button
    Then I should see "Your email address or password is incorrect. Forgot your password?" as password error message

     #Scenario 5
  @burger
  Scenario: Sign in with email and no password
    When I hover over sign in drop down
    And I click on drop down option Sign In
    And I should see "Returning customer" as sign in header
    And I enter my email address
    And I click sign in button
    Then I should see "Please enter your password" as no password entered error code

     #Scenario 6
  @burger
  Scenario: Sign in with password and no email
    When I hover over sign in drop down
    And I click on drop down option Sign In
    And I should see "Returning customer" as sign in header
    And I enter my password
    And I click sign in button
    Then I should see "Please enter your email address" as no email entered error code

    #Scenario 7
  @burger
  Scenario: Sign in with no email or password
    When I hover over sign in drop down
    And I click on drop down option Sign In
    And I should see "Returning customer" as sign in header
    And I click sign in button
    Then I should see "Please enter your email address" for no email and "Please enter your password" for no password




