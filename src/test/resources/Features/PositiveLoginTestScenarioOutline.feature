
Feature: Login as different users with using scenario Outline


  Scenario Outline: Login as student with parameters
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>" credentials
    Then The user should be able to login
    Then The welcome message contains "Nihan"
    Examples:
      | username           | password   |
      | eurotech@gmail.com | Test12345! |
      | seyit@gmail.com    | Seyit!     |
      | gulcan@gmail.com   | newjob2023 |
      | 1123456@gmail.com  | 123456     |
      | nhntsc@gmail.com   | N12345!    |