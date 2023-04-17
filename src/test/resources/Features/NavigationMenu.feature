@NavigateMenu
Feature: Navigation Menu Test

  @Teacher @DevelopersMenu
  Scenario: Navigating Developers Menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    And The user navigates to Developers Menu
    Then The user able to see developer text

  @Teacher @AllPostMenu
  Scenario: Navigates ALl Post Menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    And The user navigates to All Post Menu
    Then The user able to see Post text

  @Teacher @MyAccountMenu
  Scenario: Navigates ALl Post Menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    And The user navigates to My Account Menu
    Then The user able to see Dashboard text


