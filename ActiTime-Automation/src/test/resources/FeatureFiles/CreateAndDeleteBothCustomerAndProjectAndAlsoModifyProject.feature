Feature: Create And Delete Both Customer And Also Modify project
  Scenario:Create And Delete Both the Customer And project And Also Modify The project
    Given I Launch chrome Browser
    And I Navigate the application URL
    And I find the login page
    When I enter username in username text field
    And I enter password in password text field
    And I click the login button
    Then I find the homePage
    And I minimize the Flyout Window
    And I click the Task button
    Given I find the Customer list page
    And I click Add new button
    And I click New Customer button
    Then Enter the customer name
    And Enter customer Description
    Then Click the create customer button
    And I click Add new button
    And I click New Project button
    Then Enter the project Name
    And I click the create project button
    And I click edit button of project
    And Enter the project description
    And I click edit button of project
    And I click edit button of project
    And I click the Action button of project
    And I click the delete Project button
    And I click the permanently delete button of project
    When I click the customer settings button
    And I click the Action button
    And I click the delete customer button
    And I click the permanently delete button
    Given I find the Customer list page
    When I click on logout link
    Then I find the login page after logout
    And I logout the browser