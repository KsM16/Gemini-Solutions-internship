Feature: Login functionality
  @sample
  Scenario: Validate that user is able to login successfully
    Given The browser is launched
    And The user navigates to the login page
    When The user enters valid username and password
    And Clicks on the login button
    Then The user should be redirected to the homepage
    And A welcome message should be displayed