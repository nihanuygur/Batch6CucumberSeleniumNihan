Feature: Negative Login Test


  Scenario Outline: Login as student with wrong parameters
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>" credentials
    Then The user should not be able to login
    Then Verify the error message contains "Invalid"
    Examples:
      | username           | password   |
      | eurotech@gmail.com | Test12345  |
      | eurotech@gmail.cm  | Test12345! |
      | eurotech@gmail.com |            |


  Scenario Outline: Login as an User with invalid parameters
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>" credentials
    Then The user should not be able to login
    Then Verify the error message contains "a valid email"
    Examples:
      | username       | password  |
      | eurotech@gmail | Test12345 |


  Scenario Outline: Login as an User with invalid parameters
    Given The user is on the login page
    When The user logs in using invalid "<username>" and "<password>" credentials
    Then Verify the error message contains "<errorMessage>"

    Examples:
      | username           | password   | errorMessage                                                                             |
      | eurotechgmail      | Test12345! | Please include an '@' in the email address. 'eurotechgmail' is missing an '@'.           |
      | eurotech@gmail.com | 1          | Please lengthen this text to 6 characters or more (you are currently using 1 character). |
      | @                  | Test12345! | Please enter a part followed by '@'. '@' is incomplete.                                  |
      |                    | Test12345! | Please fill out this field.                                                              |
      | ssss@adddd@ddd.com | Test12345! | A part following '@' should not contain the symbol '@'.                                  |
      | dddd@ddd.          | Test12345! | '.' is used at a wrong position in 'ddd.'.                                               |
      | @ddd.aaa           | Test12345! | Please enter a part followed by '@'. '@ddd.aaa' is incomplete.                           |
      | eurotech@gmail     | Test12345  | Please include a valid email!                                                            |
      | eurotech@gmail.com | Test12345  | Invalid Credentials!                                                                     |



