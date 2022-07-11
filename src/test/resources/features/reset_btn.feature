Feature: User should be able to click reset button

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

@reset
Scenario Outline: User clicks reset button
Given "<user>" is on Vehicles page
When user clicks on reset button
Then user should be able to reset the page to current one
Examples:
| user            |
| user177         |
| storemanager210 |
| salesmanager273 |