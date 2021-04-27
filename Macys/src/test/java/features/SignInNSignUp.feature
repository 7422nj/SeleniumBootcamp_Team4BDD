Feature: Macys Sign In/Sign Up Functionalities

  #Background: common steps by sync way will work with your scenario

  Background:
    Given I am on Macys Help & Faqs Page
    When I hover over sign in drop down
    And I click on drop down option Sign In

    #Scenario 1
  @smokeTest
  Scenario: Locate Sign In and Sign Up Page
    And I should see "No account yet?" as sign up header
    And I should see "Returning customer" as sign in header
    Then I verify "Sign In - Macy's" as macys sign up and sign in page title

    #Scenario 2
  @burger
  Scenario: Sign in with valid email and password
    And I should see "Returning customer" as sign in header
    And I enter my email address
    And I enter my password
    And I click sign in button
    Then I should see "Access Denied" as page header

    #Scenario 3
  @burger
  Scenario: Sign in with valid email and invalid password
    And I should see "Returning customer" as sign in header
    And I enter my email address
    And i enter invalid password
    And I click sign in button
    Then I should see "Your email address or password is incorrect. Forgot your password?" as password error message

    #Scenario 4
  @burger
  Scenario: Sign in with invalid email and valid password
    And I should see "Returning customer" as sign in header
    And I enter invalid email address
    And I enter my password
    And I click sign in button
    Then I should see "Your email address or password is incorrect. Forgot your password?" as password error message

     #Scenario 5
  @burger
  Scenario: Sign in with email and no password
    And I should see "Returning customer" as sign in header
    And I enter my email address
    And I click sign in button
    Then I should see "Please enter your password" as no password entered error code

     #Scenario 6
  @burger
  Scenario: Sign in with password and no email
    And I should see "Returning customer" as sign in header
    And I enter my password
    And I click sign in button
    Then I should see "Please enter your email address" as no email entered error code

    #Scenario 7
  @burger
  Scenario: Sign in with no email or password
    And I should see "Returning customer" as sign in header
    And I click sign in button
    Then I should see "Please enter your email address" for no email and "Please enter your password" for no password

    #Scenario 8
  @burger
  Scenario: Navigate back to Help & FAQS page
    And I should see "Returning customer" as sign in header
    And I should see "No account yet?" as sign up header
    And I verify "Sign In - Macy's" as macys sign up and sign in page title
    And I navigate back to previous page
    And I should see "How Can We Help?" as help & faqs page header
    Then I should see "Macy's Customer Service Site" as page title

  @pizza
  Scenario: Sign in using data table with header
    And I should see "Returning customer" as sign in header
    And I enter Email
      | Email                    |
      | pritamdas15217@gmail.com |
    And I enter Password
      | Password    |
      | Bootcamp404 |
    And I click sign in button
    And I should see "Access Denied" as page header
    But I should not see "Bootcamp404" as page header
    Then I should see "Access Denied" as page title










