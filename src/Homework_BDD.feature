Feature: I should be able to login using valid credentials

  Scenario: I enter valid credentials
    Given I am on the login page
    When I enter valid username
    And valid password
    And click on login
    Then I should be logged in

  Scenario: I enter invalid credentials
    Given I am on the login page
    When I enter valid username
    And invalid password
    And click on login
    Then I should not be able to login
    And error message should display

  Scenario: I enter invalid credentials
    Given I am on the login page
    When I enter invalid username
    And valid password
    And click on login
    Then I should not be able to login
    And error message should display

  Scenario: I enter invalid credentials
    Given I am on the login page
    When I enter invalid username
    And invalid password
    And click on login
    Then I should not be able to login
    And error message should display

  Scenario: I enter invalid credentials
    Given I am on the login page
    When I enter valid username
    And click on login
    Then I should not be able to login
    And error message to enter password should display

  Scenario: I enter invalid credentials
    Given I am on the login page
    When I enter valid password
    And click on login
    Then I should not be able to login
    And error message to enter username should display

  Scenario: I enter no credentials
    Given I am on the login page
    When I click on login
    Then I should not be able to login
    And error message to enter username and password should display

  Scenario: I enter invalid credentials
    Given I am on the login page
    When I enter invalid password
    And click on login
    Then I should not be able to login
    And error message to enter username should display

  Scenario: I enter invalid credentials
    Given I am on the login page
    When I enter invalid username
    And click on logi
    Then I should not be able to login
    And error message to enter password should display