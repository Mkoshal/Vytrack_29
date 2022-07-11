Feature: User should be able to click grid settings button

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons


  @settings
  Scenario Outline: User clicks Grid Settings button
    Given "<user>" is on Vehicles page
    When user clicks on Grid settings button
    Then user should be able to see Grid Setting dropdown
    Examples:
      | user            |
      | user177         |
      | storemanager210 |
      | salesmanager273 |
