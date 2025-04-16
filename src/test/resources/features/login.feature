@smokeTest
Feature: Login and logout flow

  Scenario: Valid login and logout
    Given I open the practice test site
    When I navigate to the login page
    And I extract login credentials
    And I perform login and logout
    Then I should be logged out successfully

  Scenario: Invalid login attempt
    Given I open the practice test site
    When I navigate to the login page
    And I enter invalid credentials
    Then I should see a login error message
