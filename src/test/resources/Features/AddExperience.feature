Feature: Add experience positive tests

  @wip
  Scenario: Add experience positive test1
    Given The user is on the login page
    When The user logs in using "nhntsc@gmail.com" and "N12345!" credentials
    Then The user should be able to login
    Then The welcome message contains "Nihan"
    When The user clicks "Add Experience"
    Then The user should land on Add an Experience page
    And The user fills "Job Title" field as "Qa Test Engineer"
    And The user fills "Company" field as "Oracle"
    And The user fills "Location" field as "New York"
    And The user picks "From Date" as "01/05/2021"
    And The user picks "To Date" as "01/05/2021"
    And The user fills "Job Description" field as "Quality Assurance"
    And The user submits the experience form
    Then The user should see "Experience Added" message



