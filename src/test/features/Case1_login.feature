Feature: Login to saucedemo Application

  Background:
    Given User is on login page

  Scenario: Login with invalid credentials
    When user enter the incorrect username
    And user enter the incorrect password
    And user click on the login button
    Then user should not be logged in successfully

  Scenario: Login with valid credentials
    When user enter the username
    And user enter the password
    And user click on the login button
    Then user should be logged in successfully

