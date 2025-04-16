@smokeTest
Feature: Test Exceptions Functionality

  Scenario: Adding, Editing, and Removing Items
    Given I open the practice test site
    When I navigate to the Test Exceptions page
    And I edit the first row and save it
    And I add a new item in row 2 and save it
    And I edit the second row and save it
    And I remove the second row
    Then I should see the changes reflected successfully
