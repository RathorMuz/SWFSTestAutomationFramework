Feature: Logout from saucedemo application

  Background:
    Given User is logged in

  Scenario: Logout from saucedemo application
    When user click on menu icon
    And click on Logout
    Then user should be logged out from application