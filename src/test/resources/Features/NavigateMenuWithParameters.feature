Feature: Navigate Menu with parameters

  Background:
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    And  The welcome message contains "Teacher"

  Scenario: Navigates Developer Menu
    When   The user navigates to "Developers" Menu
    Then  The user should be able to see header as "Filter Profiles by Skill or by Location"


  Scenario: Navigates Posts Menu
    When   The user navigates to "All Posts" Menu
    Then  The user should be able to see header as "Posts"


  Scenario: Navigates My Account Menu
    When   The user navigates to "My Account" Menu
    Then  The user should be able to see header as "Dashboard"

    #    Create a Scenario Outline covering the above 3 scenarios

  Scenario Outline: Navigates Different Menu Options
    When  The user navigates to "<menuName>" Menu
    Then  The user should be able to see header as "<header>"
    Examples:
      | menuName   | header                                  |
      | Developers | Filter Profiles by Skill or by Location |
      | All Posts  | Posts                                   |
      | My Account | Dashboard                               |

      # Homework
  # create a new feature named 'NegativeLoginTestScenarioOutline'
  # Use scenario outline to enter invalid username and/or password and validate the different error message


