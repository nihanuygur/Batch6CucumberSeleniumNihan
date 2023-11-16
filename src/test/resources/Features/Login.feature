# to run all scenarios together, we can use a general tag
@login
Feature: Eurotech Login Test

  Background:
    Given The user is on the login page

    # we can use more than one tag
  @teacher @rerun
  Scenario: Login As Teacher
#    Given The user is on the login page
    When  The user enters teacher credentials
    Then  The user should be able to login

  @student @db
  Scenario: Login As Student
#    Given The user is on the login page
    When  The user enters student credentials
    Then  The user should be able to login

  @developer @Eurotech1
  Scenario: Login As Developer
#    Given The user is on the login page
    When  The user enters developer credentials
    Then The user should be able to login



