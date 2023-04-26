Feature: Login as different users with using scenario Outline

  @smoke
  Scenario Outline: Login as student with parameters
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>" credentials
    Then The user should be able to login
    Then The welcome message contains "<name>"
    Examples:
      | username           | password   | name    |
      | eurotech@gmail.com | Test12345! | Teacher |
      | seyit@gmail.com    | Seyit!     | Seyit   |
      | gulcan@gmail.com   | newjob2023 | Gülcan  |
      | 123456@gmail.com   | 123456     | Burak   |
      | nhntsc@gmail.com   | N12345!    | Nihan   |