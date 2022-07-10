Feature: Export Grid dropdown is on the left of the page

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons


  @ExportGridDropdown2
  Scenario Outline: Export Grid dropdown is on the left of the page
    Given "<user>" is on Vehicles page
    When user clicks on Export Grid dropdown
    Then user is able to see Export Grid Dropdown on the left of the page
    Examples:
      | user            |
      | user177         |
      | storemanager210 |
      | salesmanager273 |
