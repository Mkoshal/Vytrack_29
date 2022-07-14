Feature: User should be able to click refresh button

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  @refreshReset
  Scenario Outline: User clicks refresh and reset button
    Given "<user>" is on Vehicles page
    When user clicks on refresh button
    Then user should be able to see Cars page header
    When user clicks reset button
    Then user should be able to see Cars page header
    Examples:
      | user            |
      | user177         |
      | storemanager210 |
      | salesmanager273 |

