Feature: Login as different users


  Scenario: Login as teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then The user should be able to login
    Then The welcome message contains "Teacher"
@smoke
  Scenario: Login as student1 with parameters
    Given The user is on the login page
    When The user logs in using "seyit@gmail.com" and "Seyit!" credentials
    Then The user should be able to login
    Then The welcome message contains "Seyit"
@smoke
  Scenario: Login as student2 with parameters
    Given The user is on the login page
    When The user logs in using "gulcan@gmail.com" and "newjob2023" credentials
    Then The user should be able to login
    Then The welcome message contains "Gülcan"

  @rerun
  Scenario: Login as student3 with parameters
    Given The user is on the login page
    When The user logs in using "nhntsc@gmail.com" and "N12345!" credentials
    Then The user should be able to login
    Then The welcome message contains "Nihan"

  Scenario Outline: Login as different users DDT
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>" credentials
    Then The user should be able to login
    Then The welcome message contains "<name>"
    Examples:
      | username           | password   | name    |
      | seyit@gmail.com    | Seyit!     | Seyit   |
      | gulcan@gmail.com   | newjob2023 | Gulcan  |
      | nhntsc@gmail.com   | N12345!    | Nihan   |
      | eurotech@gmail.com | Test12345! | Teacher |