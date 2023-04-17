# to run all scenarios together, we can use a general tag
@Login
Feature: Eurotech Login Test

  @Teacher @Eurotech1
  Scenario: Login As Teacher
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

# we can use more than one tag
    @Student @wip
  Scenario: Login As Student
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login

  @Developer @Eurotech1
  Scenario: Login As Student
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login