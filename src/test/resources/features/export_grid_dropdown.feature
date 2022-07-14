@ExportGrid
Feature: User should be able to click Export grid dropdown

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons


  @B26G29-41 @exportGridValidation
  Scenario Outline: Click export grid dropdown for user
    Given "<user>" is on Vehicles page
    When user clicks on Export Grid dropdown on the left of the page
    And user clicks on "<option>" option
    Then user should see the message as Export started successfully. You will receive email notification upon completion.

    Examples:
      | user            | option |
      | user177         | CSV    |
      | storemanager210 | XLSX   |
      | salesmanager273 | CSV    |

  @B26G29-00
  Scenario Outline: Locate export grid dropdown on the left of the page
    Given "<user>" is on Vehicles page
    When user looks for Export Grid dropdown
    Then user should be able to see Export Grid dropdown on the left of the page
    Examples:
      | user            |
      | user177         |
      | storemanager210 |
      | salesmanager273 |



