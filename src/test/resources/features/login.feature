@Login
Feature: Vytrack login feature
  User Story: As a user I should be able to login with the correct credentials to different accounts.

  Accounts are: Truck Drivers, Store Manager, Sales Manager

  Background: For each scenario user is on the vytrack login page
    Given user is on the vytrack login page

  @TruckDriver @Login
  Scenario: Login as a truck driver
      Given user is on the vytrack login page
      When user enters truck driver username
      And user enters truck driver password
      Then user should see dashboard

  @StoreManager @Login
  Scenario: Login as a store manager
    Given user is on the vytrack login page
    When user enters store manager username
    And user enters store manager password
    Then user should see dashboard

  @SalesManager @Login
  Scenario: Login as a sales manager
    Given user is on the vytrack login page
    When user enters sales manager username
    And user enters sales manager password
    Then user should see dashboard