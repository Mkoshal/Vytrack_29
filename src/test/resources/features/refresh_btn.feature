Feature: User should be able to click refresh button

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  @refresh
  Scenario Outline: User clicks refresh button
    Given "<user>" is on Vehicles page
    When user clicks on refresh button
    Then user should be able to see the same Vehicles page
    Examples:
      | user            |
      | user177         |
      | storemanager210 |
      | salesmanager273 |

