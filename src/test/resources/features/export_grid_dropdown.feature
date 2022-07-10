Feature: User should be able to click Export grid dropdown

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons


  @B26G29-41
  Scenario Outline: Click export grid dropdown for user
    Given "<user>" is on Vehicles page
    When user clicks on Export Grid dropdown
    Then user should be able to see CSV and XLSX
    Examples:
      | user            |
      | user177         |
      | storemanager210 |
      | salesmanager273 |


